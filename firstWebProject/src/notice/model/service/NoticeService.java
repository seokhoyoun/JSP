package notice.model.service;

import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

import notice.model.dao.NoticeDao;
import notice.model.vo.Notice;
import static common.JDBCTemplate.*;

public class NoticeService {
	
	private NoticeDao ndao = new NoticeDao();
	
	public NoticeService() {
	}
	
	public HashMap<Integer,Notice> selectMap(){
		Connection conn = getConnection();
		HashMap<Integer, Notice> hm = ndao.selectMap(conn);
		close(conn);
		return hm;
	}
	
	public Notice selectOne(int noticeNo) {
		Connection conn = getConnection();
		Notice notice = ndao.selectOne(conn, noticeNo);
		close(conn);
		return notice;
	}
	
	public int insertNotice(Notice notice) {
		Connection conn = getConnection();
		int result = ndao.insertNotice(conn, notice);
		if(result > 0)
			commit(conn);
		else
			rollback(conn);
		close(conn);
		return result;
	}
	
	public int updateNotice(Notice notice) {
		Connection conn = getConnection();
		int result = ndao.updateNotice(conn, notice);
		if(result > 0)
			commit(conn);
		else
			rollback(conn);
		close(conn);
		return result;
		
	}
	
	public int deleteNotice(int noticeNo) {
		Connection conn = getConnection();
		int result = ndao.deleteNotice(conn, noticeNo);
		if(result > 0)
			commit(conn);
		else
			rollback(conn);
		close(conn);
		return result;
	}

	public HashMap<Integer, Notice> selectSearchTitle(String noticeTitle) {
		Connection conn = getConnection();
		HashMap<Integer, Notice> hm = ndao.selectSearchTitle(conn, noticeTitle);
		close(conn);
		return hm;
	}

	public HashMap<Integer, Notice> selectSearchWriter(String noticeWriter) {
		Connection conn = getConnection();
		HashMap<Integer, Notice> hm = ndao.selectSearchWriter(conn, noticeWriter);
		close(conn);
		return hm;
	}

	public HashMap<Integer, Notice> selectSearchDate(Date beginDate, Date endDate) {
		Connection conn = getConnection();
		HashMap<Integer, Notice> hm = ndao.selectSearchDate(conn, beginDate, endDate);
		close(conn);
		return hm;
	}

	public ArrayList<Notice> selectTop5() {
		Connection conn = getConnection();
		ArrayList<Notice> list = ndao.selectTop5(conn);
		close(conn);
		return list;
	}
}
