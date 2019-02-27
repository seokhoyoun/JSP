package member.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static common.JDBCTemplate.*;

import member.model.vo.Member;

public class MemberDao {
	
	public MemberDao() {
		
	}

	public Member selectLogin(Connection conn, String userId, String userPwd) {
		Member loginUser = null;
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
				loginUser = new Member();
				loginUser.setUserid(userId);
				loginUser.setUserpwd(userPwd);
				loginUser.setUsername(rset.getString(3));
				loginUser.setGender(rset.getString(4));
				loginUser.setAge(rset.getInt(5));
				loginUser.setPhone(rset.getString(6));
				loginUser.setEmail(rset.getString(7));
				loginUser.setHobby(rset.getString(8));
				loginUser.setEtc(rset.getString(9));
				loginUser.setEnrollDate(rset.getDate(10));
				loginUser.setLastModified(rset.getDate(11));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return loginUser;
	}
	
}
