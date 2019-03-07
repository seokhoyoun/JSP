package member.model.service;

import member.model.dao.MemberDao;
import member.model.vo.Member;

import static common.JDBCTemplate.*;

import java.sql.Connection;

public class MemberService {
	// 의존성 주입(DI : Dependency injection)
	private MemberDao mdao = new MemberDao();
	public MemberService() {
	}
	
	public Member selectLogin(String userId, String userPwd) {
		Connection conn = getConnection();
		Member member = mdao.selectLogin(conn, userId, userPwd);
		close(conn);
		return member;
	}
	
	public int checkID(String id) {
		Connection conn = getConnection();
		int count = mdao.checkID(conn, id);
		close(conn);
		return count;
	}

	public int insertMember(Member member) {
		Connection conn = getConnection();
		int result = mdao.insertMember(conn, member);
		if(result > 0)
			commit(conn);
		else
			rollback(conn);
		close(conn);
		return result;
	}
}
