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
			
			if(rset.next()) {
				listCount = rset.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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
		int startRow = (currentPage -1) * limit + 1;
		int endRow = startRow + limit - 1;
		String query = "select * from (\r\n" + 
				"	select rownum rnum, \r\n" + 
				"	board_num, board_writer, board_title, board_content, board_original_filename,board_rename_filename, board_reply_ref,\r\n" + 
				"	board_reply_lev, board_reply_seq, board_readcount, board_date\r\n" + 
				"	from (\r\n" + 
				"		select * from board order by board_ref desc, board_reply_ref desc,\r\n" + 
				"		board_reply_lev asc, board_reply_seq asc\r\n" + 
				"	)\r\n" + 
				")\r\n" + 
				"where rnum >= 11 and rnum <= 20;";
		
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return list;
	}
}
