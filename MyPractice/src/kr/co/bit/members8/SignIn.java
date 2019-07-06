package kr.co.bit.members8;

import java.io.IOException;
import java.sql.SQLException;

public class SignIn extends Members implements Process, SetSql, Session{
	
	public String idI;
	private String pswI;
	
	public SignIn() {
		idI=null; pswI=null;
	}
	
	public void setSignInInfo() throws IOException {
		System.out.println("아이디입력:");
		idI = br.readLine();
		System.out.println("패스워드입력:");
		pswI = br.readLine();
	}
	
	@Override
	public void memSql() {
		sql = "SELECT ID,PSW FROM MEMBER WHERE ID=?";
	}
	
	public void SignInExecuter() throws SQLException{
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, idI);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			id = rs.getString("id");
			psw = rs.getString("psw");
			if(idI.equals(id) && pswI.equals(psw)) {
				System.out.println("환영합니다! 로그인되었습니다.");
				changeSessionStatus();								
			}
			else if(idI.equals(id) && !pswI.equals(psw)) {
				System.out.println("비밀번호가 틀립니다.");
				tryCount++;
				System.out.println(tryCount+"번 잘못된 비밀번호 입력..."+(3-tryCount)+"번의 기회가 남았습니다.");
			}
		}
	}
	
	@Override
	public void process() throws SQLException,IOException{ //로그인
		if(isLogin() || session!=null) {
			System.out.println("로그인상태입니다.");
		}
		else {
			isLock();
			conn = getConnection();
			setSignInInfo();
			memSql();
			SignInExecuter();
		}
	} //로그인

	@Override
	public void changeSessionStatus() {
		session=idI;
	}
}
