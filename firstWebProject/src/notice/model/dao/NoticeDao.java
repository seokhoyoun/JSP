package notice.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import static common.JDBCTemplate.*;

import notice.model.vo.Notice;

public class NoticeDao {
	public NoticeDao() {
	}
	
public HashMap<Integer,Notice> selectMap(Connection conn){
		HashMap<Integer, Notice> hm = new HashMap<>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select * from notice order by 1 desc";
		/*NOTICENO	NUMBER
		NOTICETITLE	VARCHAR2(50 BYTE)
		NOTICEDATE	DATE
		NOTICEWRITER	VARCHAR2(15 BYTE)
		NOTICECONTENT	VARCHAR2(2000 BYTE)
		ORIGINAL_FILEPATH	VARCHAR2(100 BYTE)
		RENAME_FILEPATH	VARCHAR2(100 BYTE)*/
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			while(rset.next()) {
				Notice notice = new Notice();
				notice.setNoticeNo(rset.getInt(1));
				notice.setNoticeTitle(rset.getString(2));
				notice.setNoticeDate(rset.getDate(3));
				notice.setNoticeWriter(rset.getString(4));
				notice.setNoticeContent(rset.getString(5));
				notice.setOriginalFilePath(rset.getString(6));
				notice.setRenameFilePath(rset.getString(7));
				
				hm.put(notice.getNoticeNo(), notice);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		return hm;
	}
	
	public Notice selectOne(Connection conn, int noticeNo) {
		Notice notice = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from notice where noticeno = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, noticeNo);
			
			rset = pstmt.executeQuery();
			if(rset.next()) {
				notice = new Notice();
				notice.setNoticeNo(rset.getInt(1));
				notice.setNoticeTitle(rset.getString(2));
				notice.setNoticeDate(rset.getDate(3));
				notice.setNoticeWriter(rset.getString(4));
				notice.setNoticeContent(rset.getString(5));
				notice.setOriginalFilePath(rset.getString(6));
				notice.setRenameFilePath(rset.getString(7));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return notice;
	}
	
	public int insertNotice(Connection conn, Notice notice) {
		int result = 0;
		PreparedStatement pstmt = null;
		String query = "insert into notice values((select max(noticeno)+1 from notice ),?,default,?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, notice.getNoticeTitle());
			pstmt.setString(2, notice.getNoticeWriter());
			pstmt.setString(3, notice.getNoticeContent());
			pstmt.setString(4, notice.getOriginalFilePath());
			pstmt.setString(5, notice.getRenameFilePath());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	
	public int updateNotice(Connection conn, Notice notice) {
		int result = 0;
		PreparedStatement pstmt = null;
		String query = "update notice set noticetitle = ?, noticecontent = ?, original_filepath = ?, rename_filepath = ? where noticeno = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, notice.getNoticeTitle());
			pstmt.setString(2, notice.getNoticeContent());
			pstmt.setString(3, notice.getOriginalFilePath());
			pstmt.setString(4, notice.getRenameFilePath());
			pstmt.setInt(5, notice.getNoticeNo());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	
	public int deleteNotice(Connection conn, int noticeNo) {
		int result = 0;
		PreparedStatement pstmt = null;
		String query= "delete from notice where noticeno = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, noticeNo);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}

	public HashMap<Integer, Notice> selectSearchTitle(Connection conn, String noticeTitle) {
		HashMap<Integer, Notice> hm = new HashMap<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from notice where noticetitle like ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "%"+noticeTitle+"%");
			
			rset = pstmt.executeQuery();
			while(rset.next()) {
				Notice notice = new Notice();
				notice.setNoticeNo(rset.getInt(1));
				notice.setNoticeTitle(rset.getString(2));
				notice.setNoticeDate(rset.getDate(3));
				notice.setNoticeWriter(rset.getString(4));
				notice.setNoticeContent(rset.getString(5));
				notice.setOriginalFilePath(rset.getString(6));
				notice.setRenameFilePath(rset.getString(7));
				
				hm.put(notice.getNoticeNo(), notice);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return hm;
	}

	public HashMap<Integer, Notice> selectSearchWriter(Connection conn, String noticeWriter) {
		HashMap<Integer, Notice> hm = new HashMap<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from notice where noticewriter like ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "%"+noticeWriter+"%");
			
			rset = pstmt.executeQuery();
			while(rset.next()) {
				Notice notice = new Notice();
				notice.setNoticeNo(rset.getInt(1));
				notice.setNoticeTitle(rset.getString(2));
				notice.setNoticeDate(rset.getDate(3));
				notice.setNoticeWriter(rset.getString(4));
				notice.setNoticeContent(rset.getString(5));
				notice.setOriginalFilePath(rset.getString(6));
				notice.setRenameFilePath(rset.getString(7));
				
				hm.put(notice.getNoticeNo(), notice);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return hm;
	}

	public HashMap<Integer, Notice> selectSearchDate(Connection conn, Date beginDate, Date endDate) {
		HashMap<Integer, Notice> hm = new HashMap<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from notice where noticedate between ? and ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setDate(1, beginDate);
			pstmt.setDate(2, endDate);
			rset = pstmt.executeQuery();
			while(rset.next()) {
				Notice notice = new Notice();
				notice.setNoticeNo(rset.getInt(1));
				notice.setNoticeTitle(rset.getString(2));
				notice.setNoticeDate(rset.getDate(3));
				notice.setNoticeWriter(rset.getString(4));
				notice.setNoticeContent(rset.getString(5));
				notice.setOriginalFilePath(rset.getString(6));
				notice.setRenameFilePath(rset.getString(7));
				
				hm.put(notice.getNoticeNo(), notice);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return hm;
	}
}
