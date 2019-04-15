package board.model.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import board.model.vo.Board;
import notice.model.vo.SearchDate;

public class BoardDao {
	public BoardDao() {}

	public int getListCount(SqlSession session) {
		
		return session.selectOne("boardMapper.selectListCount");
	}

	public ArrayList<Board> selectList(
			SqlSession session, int currentPage, int limit) {
		RowBounds rb = new RowBounds(currentPage, limit);
		List<Board> list = session.selectList("boardMapper.selectList",rb);
		return (ArrayList<Board>)list;
	}

	public int addReadCount(SqlSession session, int boardNum) {
		return session.update("boardMapper.addReadCount",boardNum);
	}

	public Board selectBoard(SqlSession session, int boardNum) {
		return session.selectOne("boardMapper.selectBoard",boardNum);
	}

	public int insertBoard(SqlSession session, Board board) {
		return session.insert("boardMapper.insertBoard",board);
	}

	public int insertReply(SqlSession session, Board replyBoard) {
		return session.insert("boardMapper.insertReply", replyBoard);
	}

	public int updateReplySeq(SqlSession session, Board replyBoard) {
		return session.update("boardMapper.replySeq", replyBoard);
	}

	public int updateReply(SqlSession session, Board board) {
		return session.update("boardMapper.updateReply", board);
	}

	public int updateBoard(SqlSession session, Board board) {
		return session.update("boardMapper.updateBoard", board);
	}

	public int deleteBoard(SqlSession session, int boardNum) {
		return session.delete("boardMapper.deleteBoard", boardNum);
	}

	public ArrayList<Board> selectDateList(SqlSession session, SearchDate date, int currentPage, int limit) {
		HashMap<String, Object> hm = new HashMap<>();
		hm.put("beginDate",date.getBegin());
		hm.put("endDate", date.getEnd());
		hm.put("start", (currentPage-1)*limit +1);
		hm.put("end", currentPage * limit);
		List<Board> list = session.selectList("boardMapper.selectDateList", hm ); 
		return (ArrayList<Board>) list;
	}

	public ArrayList<Board> selectWriterList(SqlSession session, String writer, int currentPage, int limit) {
		HashMap<String, Object> hm = new HashMap<>();
		hm.put("writer", writer);
		hm.put("start", (currentPage-1)*limit +1);
		hm.put("end", currentPage * limit);
		List<Board> list = session.selectList("boardMapper.selectWriterList",hm ); 
		return (ArrayList<Board>) list;
	}

	public ArrayList<Board> selectTitleList(SqlSession session, String title, int currentPage, int limit) {
		HashMap<String, Object> hm = new HashMap<>();
		hm.put("title", title);
		hm.put("start", (currentPage-1)*limit +1);
		hm.put("end", currentPage * limit);
		List<Board> list = session.selectList("boardMapper.selectTitleList", hm); 
		return (ArrayList<Board>) list;
	}

	public ArrayList<Board> selectReadCountTop5(SqlSession session) {
		List<Board> list = session.selectList("boardMapper.selectTop5");
		return (ArrayList<Board>) list;
	}

	
}











