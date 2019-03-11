package board.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import board.model.vo.Board;

import static common.JDBCTemplate.*;

public class BoardDao {

	public BoardDao() {
	}

	public int getListCount(Connection conn) {
		int listCount = 0;
		Statement stmt = null;
		ResultSet rset = null;

		String query = "select count(*) from board";

		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);

			if (rset.next()) {
				listCount = rset.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		return listCount;
	}

	public ArrayList<Board> selectList(Connection conn, int currentPage, int limit) {
		ArrayList<Board> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		// 해당 페이지에 출력할 목록의 시작행과 끝행 계산
		int startRow = (currentPage - 1) * limit + 1;
		int endRow = startRow + limit - 1;
		String query = "select * from ( " 
						+ " select rownum rnum, "
						+ "	board_num, board_writer, board_title, board_content, board_original_filename,board_rename_filename, board_ref, board_reply_ref, "
						+ "	board_reply_lev, board_reply_seq, board_readcount, board_date " 
						+ "	from ("
								+ "	select * from board order by board_ref desc, board_reply_ref desc, "
								+ "	board_reply_lev asc, board_reply_seq asc) " 
						+ ") " 
						+ "where rnum >= ? and rnum <= ?"
						+ "order by board_ref desc, board_reply_ref";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			rset = pstmt.executeQuery();
			/*BOARD_NUM	NUMBER
			BOARD_WRITER	VARCHAR2(20 BYTE)
			BOARD_TITLE	VARCHAR2(50 BYTE)
			BOARD_CONTENT	VARCHAR2(2000 BYTE)
			BOARD_ORIGINAL_FILENAME	VARCHAR2(100 BYTE)
			BOARD_RENAME_FILENAME	VARCHAR2(100 BYTE)
			BOARD_REF	NUMBER
			BOARD_REPLY_REF	NUMBER
			BOARD_REPLY_LEV	NUMBER
			BOARD_REPLY_SEQ	NUMBER
			BOARD_READCOUNT	NUMBER
			BOARD_DATE	DATE*/
			while(rset.next()) {
				Board board = new Board();
				board.setBoardNum(rset.getInt("BOARD_NUM"));
				board.setBoardWriter(rset.getString("BOARD_WRITER"));
				board.setBoardTitle(rset.getString("BOARD_TITLE"));
				board.setBoardContent(rset.getString("BOARD_CONTENT"));
				board.setBoardOriginalFileName(rset.getString("BOARD_ORIGINAL_FILENAME"));
				board.setBoardRenameFileName(rset.getString("BOARD_RENAME_FILENAME"));
				board.setBoardRef(rset.getInt("BOARD_REF"));
				board.setBoardReplyRef(rset.getInt("BOARD_REPLY_REF"));
				board.setBoardReplyLev(rset.getInt("BOARD_REPLY_LEV"));
				board.setBoardReplySeq(rset.getInt("BOARD_REPLY_SEQ"));
				board.setBoardReadCount(rset.getInt("BOARD_READCOUNT"));
				board.setBoardDate(rset.getDate("BOARD_DATE"));
				
				list.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return list;
	}


	public int addReadCount(Connection conn, int boardNum) {
		int result = 0;
		PreparedStatement pstmt = null;
		String query = "update board set board_readcount = board_readcount + 1 where board_num = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, boardNum);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}

	public Board selectBoard(Connection conn, int boardNum) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Board board = null;
		String query = "select * from board where board_num = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, boardNum);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				board = new Board();
				board.setBoardNum(rset.getInt("BOARD_NUM"));
				board.setBoardWriter(rset.getString("BOARD_WRITER"));
				board.setBoardTitle(rset.getString("BOARD_TITLE"));
				board.setBoardContent(rset.getString("BOARD_CONTENT"));
				board.setBoardOriginalFileName(rset.getString("BOARD_ORIGINAL_FILENAME"));
				board.setBoardRenameFileName(rset.getString("BOARD_RENAME_FILENAME"));
				board.setBoardRef(rset.getInt("BOARD_REF"));
				board.setBoardReplyRef(rset.getInt("BOARD_REPLY_REF"));
				board.setBoardReplyLev(rset.getInt("BOARD_REPLY_LEV"));
				board.setBoardReplySeq(rset.getInt("BOARD_REPLY_SEQ"));
				board.setBoardReadCount(rset.getInt("BOARD_READCOUNT"));
				board.setBoardDate(rset.getDate("BOARD_DATE"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return board;
	}

	public int insertBoard(Connection conn, Board board) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query="insert into board values((select max(board_num)+1 from board),"
				+ "?,?,?,?,?, (select max(board_num)+1 from board), 0,0,0,default, default)";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, board.getBoardWriter());
			pstmt.setString(2, board.getBoardTitle());
			pstmt.setString(3, board.getBoardContent());
			pstmt.setString(4, board.getBoardOriginalFileName());
			pstmt.setString(5, board.getBoardRenameFileName());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}

	public int updateReplySeq(Connection conn, Board replyBoard) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update board set board_reply_seq = board_reply_seq+1 where board_ref = ? and board_reply_lev = ? and board_reply_ref = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, replyBoard.getBoardRef());
			pstmt.setInt(2, replyBoard.getBoardReplyLev());
			pstmt.setInt(3, replyBoard.getBoardReplyRef());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}

	public int insertReplySeq(Connection conn, Board replyBoard) {
		int result = 0;
		PreparedStatement pstmt = null;
		String query = null;
		// 원글의 댓글일 때
		/*BOARD_NUM	NUMBER
		BOARD_WRITER	VARCHAR2(20 BYTE)
		BOARD_TITLE	VARCHAR2(50 BYTE)
		BOARD_CONTENT	VARCHAR2(2000 BYTE)
		BOARD_ORIGINAL_FILENAME	VARCHAR2(100 BYTE)
		BOARD_RENAME_FILENAME	VARCHAR2(100 BYTE)
		BOARD_REF	NUMBER
		BOARD_REPLY_REF	NUMBER
		BOARD_REPLY_LEV	NUMBER
		BOARD_REPLY_SEQ	NUMBER
		BOARD_READCOUNT	NUMBER
		BOARD_DATE	DATE*/
		if(replyBoard.getBoardReplyLev() == 1) {
			 /*query = "insert into board values((select max(board_num)+1 from board),"
						+ "?,?,?,null,null,?, (select max(board_num)+1 from board), 1,?,default, default)";*/
			 query = "insert into board values((select max(board_num)+1 from board),"
						+ "?,?,?,null,null,?, ?, 1,(select max(board_reply_seq)+1 from board where board_num = ?),default, default)";
		}
		if(replyBoard.getBoardReplyLev() == 2) {
			 query = "insert into board values((select max(board_num)+1 from board),"
						+ "?,?,?,null,null, ?,?,2,(select max(board_reply_seq)+1 from board where board_num = ?),default, default)";
		}
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, replyBoard.getBoardWriter());
			pstmt.setString(2, replyBoard.getBoardTitle());
			pstmt.setString(3, replyBoard.getBoardContent());
			
			if(replyBoard.getBoardReplyLev() == 1) {
				pstmt.setInt(4, replyBoard.getBoardRef());
				pstmt.setInt(5, replyBoard.getBoardReplyRef());
				pstmt.setInt(6, replyBoard.getBoardRef());
			}
			if(replyBoard.getBoardReplyLev() == 2) {
				pstmt.setInt(4, replyBoard.getBoardRef());
				pstmt.setInt(5, replyBoard.getBoardReplyRef());
				pstmt.setInt(6, replyBoard.getBoardRef());
			}
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}
}
