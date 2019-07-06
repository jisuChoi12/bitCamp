package kr.co.bit.members6;

import java.io.IOException;
import java.sql.SQLException;

public class SignIn extends Members{
	
	private String idI;
	private String pswI;
	
	private String idL;
	private String pswL;
	
	public SignIn() {
		idI=null; pswI=null; idL=null; pswL=null;
	}
	
	public boolean isLogin() {
		boolean login = true;
		if(Members.session==null) {
			login = false;
		}
		return login;
	}
	
	public void setSignInInfo() throws IOException {
		System.out.println("아이디입력:");
		idI = br.readLine();
		System.out.println("패스워드입력:");
		pswI = br.readLine();
	}
	
	public void memSql() {
		sql = "SELECT ID,PSW FROM MEMBER WHERE ID=?";
	}
	
	public void SignInExecuter() throws SQLException{
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, idI);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			idL = rs.getString("id");
			pswL = rs.getString("psw");
			if(idI.equals(idL) && pswI.equals(pswL)) {
				System.out.println("환영합니다! 로그인되었습니다.");
				MembersMain.session=idL;								
			}
			else if(idI.equals(idL) && !pswI.equals(pswL)) {
				System.out.println("비밀번호가 틀립니다.");
			}
		}
	}
	
	public void signInProcess() throws SQLException,IOException{ //로그인
		if(isLogin()) {
			System.out.println("로그인상태입니다.");
		}
		else {
			conn = getConnection();
			setSignInInfo();
			memSql();
			SignInExecuter();
		}
	} //로그인
}
