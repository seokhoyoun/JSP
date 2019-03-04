package member.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import static common.JDBCTemplate.*;

import member.model.vo.Member;

public class MemberDao {
	
	public MemberDao() {
		
	}

	public Member selectLogin(Connection conn, String userId, String userPwd) {
		Member member = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from member where userid = ? and userpwd = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			pstmt.setString(2, userPwd);
//			
//			USERID	VARCHAR2(15 BYTE)
//			USERPWD	VARCHAR2(15 BYTE)
//			USERNAME	VARCHAR2(20 BYTE)
//			GENDER	CHAR(1 BYTE)
//			AGE	NUMBER(3,0)
//			PHONE	VARCHAR2(13 BYTE)
//			EMAIL	VARCHAR2(30 BYTE)
//			HOBBY	VARCHAR2(100 BYTE)
//			ETC	VARCHAR2(1000 BYTE)
//			ENROLL_DATE	DATE
//			LASTMODIFIED	DATE
			
			rset = pstmt.executeQuery();
			if(rset.next()) {
				member = new Member();
				member.setUserid(userId);
				member.setUserpwd(userPwd);
				member.setUsername(rset.getString(3));
				member.setGender(rset.getString(4));
				member.setAge(rset.getInt(5));
				member.setPhone(rset.getString(6));
				member.setEmail(rset.getString(7));
				member.setHobby(rset.getString(8));
				member.setEtc(rset.getString(9));
				member.setEnrollDate(rset.getDate(10));
				member.setLastModified(rset.getDate(11));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return member;
	}

	public int selectCheckId(Connection conn, String userId) {
		int result = 0;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select count(userid) from member where userid = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			
			rset = pstmt.executeQuery();
			if(rset.next()) {
				result = rset.getInt(1);
			}
			System.out.println("result : "+ result);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return result;
	}
//	USERID
//	USERPWD
//	USERNAME
//	GENDER
//	AGE
//	PHONE
//	EMAIL
//	HOBBY
//	ETC
//	ENROLL_DATE
//	LASTMODIFIED
	public int insertMember(Connection conn, Member member) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "insert into member values(?,?,?,?,?,?,?,?,?,sysdate,sysdate)";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getUserid());
			pstmt.setString(2, member.getUserpwd());
			pstmt.setString(3, member.getUsername());
			pstmt.setString(4, member.getGender());
			pstmt.setInt(5, member.getAge());
			pstmt.setString(6, member.getPhone());
			pstmt.setString(7, member.getEmail());
			pstmt.setString(8, member.getHobby());
			pstmt.setString(9, member.getEtc());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}

	public Member selectMember(Connection conn, String userid) {
		Member member = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from member where userid = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);
//			
//			USERID	VARCHAR2(15 BYTE)
//			USERPWD	VARCHAR2(15 BYTE)
//			USERNAME	VARCHAR2(20 BYTE)
//			GENDER	CHAR(1 BYTE)
//			AGE	NUMBER(3,0)
//			PHONE	VARCHAR2(13 BYTE)
//			EMAIL	VARCHAR2(30 BYTE)
//			HOBBY	VARCHAR2(100 BYTE)
//			ETC	VARCHAR2(1000 BYTE)
//			ENROLL_DATE	DATE
//			LASTMODIFIED	DATE
			
			rset = pstmt.executeQuery();
			if(rset.next()) {
				member = new Member();
				member.setUserid(userid);
				member.setUserpwd(rset.getString(2));
				member.setUsername(rset.getString(3));
				member.setGender(rset.getString(4));
				member.setAge(rset.getInt(5));
				member.setPhone(rset.getString(6));
				member.setEmail(rset.getString(7));
				member.setHobby(rset.getString(8));
				member.setEtc(rset.getString(9));
				member.setEnrollDate(rset.getDate(10));
				member.setLastModified(rset.getDate(11));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return member;
	}

	public int updateMember(Connection conn, Member member) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update member set userpwd=?, age=?, email=?, phone=?, etc=? ,hobby=? where userid= ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getUserpwd());
			pstmt.setInt(2, member.getAge());
			pstmt.setString(3, member.getEmail());
			pstmt.setString(4, member.getPhone());
			pstmt.setString(5, member.getEtc());
			pstmt.setString(6, member.getHobby());
			pstmt.setString(7, member.getUserid());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}

	public int deleteMember(Connection conn, String userid) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "delete from member where userid = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}

	public ArrayList<Member> selectList(Connection conn) {
		ArrayList<Member> list = new ArrayList<>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select * from member";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			while(rset.next()){
				Member member = new Member();
				member.setUserid(rset.getString(1));
				member.setUserpwd(rset.getString(2));
				member.setUsername(rset.getString(3));
				member.setGender(rset.getString(4));
				member.setAge(rset.getInt(5));
				member.setPhone(rset.getString(6));
				member.setEmail(rset.getString(7));
				member.setHobby(rset.getString(8));
				member.setEtc(rset.getString(9));
				member.setEnrollDate(rset.getDate(10));
				member.setLastModified(rset.getDate(11));
				
				list.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		return list;
	}
	
}
