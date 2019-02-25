package member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import member.model.vo.Member;
import static common.JDBCTemplate.*;

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
			
			rset = pstmt.executeQuery();
			/*USERID	VARCHAR2(15 BYTE)
			USERPWD	VARCHAR2(15 BYTE)
			USERNAME	VARCHAR2(20 BYTE)
			GENDER	CHAR(1 BYTE)
			AGE	NUMBER(3,0)
			PHONE	VARCHAR2(13 BYTE)
			EMAIL	VARCHAR2(30 BYTE)
			HOBBY	VARCHAR2(100 BYTE)
			ETC	VARCHAR2(1000 BYTE)
			ENROLL_DATE	DATE
			LASTMODIFIED	DATE*/
			if(rset.next()) {
				member = new Member();
				member.setUserId(userId);
				member.setUserPwd(userPwd);
				member.setUserName(rset.getString(3));
				member.setGender(rset.getString("gender"));
				member.setAge(rset.getInt("age"));
				member.setPhone(rset.getString("phone"));
				member.setEmail(rset.getString("email"));
				member.setHobby(rset.getString("hobby"));
				member.setEtc(rset.getString("etc"));
				member.setEnrollDate(rset.getDate("enroll_date"));
				member.setLastModified(rset.getDate("lastmodified"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return member;
	}
	
	
}
