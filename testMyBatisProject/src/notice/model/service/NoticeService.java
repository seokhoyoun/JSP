package notice.model.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import notice.model.dao.NoticeDao;
import notice.model.vo.Notice;
import notice.model.vo.SearchDate;

import static common.SqlSessionTemplate.getSession;

public class NoticeService {
	private NoticeDao ndao = new NoticeDao();
	
	public NoticeService() {}
	
	public HashMap<Integer, Notice> selectMap(){
		SqlSession session = getSession(); 
		HashMap<Integer, Notice> list = ndao.selectMap(session);
		session.close();
		return list;
	}
	
	public Notice selectOne(int noticeNo) {
		SqlSession session = getSession(); 
		Notice notice = ndao.selectOne(session, noticeNo);
		session.close();
		return notice;
	}
	
	public int insertNotice(Notice notice) {
		SqlSession session = getSession();
		int result = ndao.insertNotice(session, notice);
		if(result > 0)
			session.commit();
		else
			session.rollback();
		session.close();
		return result;
	}
	
	public int updateNotice(Notice notice) {
		SqlSession session = getSession();
		int result = ndao.updateNotice(session, notice);
		if(result > 0)
			session.commit();
		else
			session.rollback();
		session.close();
		return result;
	}
	
	public int deleteNotice(int noticeNo) {
		SqlSession session = getSession();
		int result = ndao.deleteNotice(session, noticeNo);
		if(result > 0)
			session.commit();
		else
			session.rollback();
		session.close();
		return result;
	}

	public HashMap<Integer, Notice> selectSearchTitle(String noticeTitle) {
		SqlSession session = getSession(); 
		HashMap<Integer, Notice> list = ndao.selectSearchTitle(session, noticeTitle);
		session.close();
		return list;
	}

	public HashMap<Integer, Notice> selectSearchWriter(
			String noticeWriter) {
		SqlSession session = getSession(); 
		HashMap<Integer, Notice> list = ndao.selectSearchWriter(session, noticeWriter);
		session.close();
		return list;
	}

	public HashMap<Integer, Notice> selectSearchDate(
			SearchDate date) {
		SqlSession session = getSession(); 
		HashMap<Integer, Notice> list = ndao.selectSearchDate(session, date);
		session.close();
		return list;
	}

	public ArrayList<Notice> selectTop5Write() {
		SqlSession session = getSession(); 
		ArrayList<Notice> list = ndao.selectTop5Write(session);
		session.close();
		return list;
	}
}











