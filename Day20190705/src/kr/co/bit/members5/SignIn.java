package kr.co.bit.members5;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SignIn extends Members{
	
	private String idI;
	private String pswI;
	
	private String idL;
	private String pswL;
	
	public SignIn() {
		idI=null; pswI=null; idL=null; pswL=null;
	}
	
	public void signInProcess() throws SQLException,IOException{ //로그인
		if (MembersMain.session != null) {
			System.out.println("로그인상태입니다.");
//			continue;
		}
		conn = getConnection();
		System.out.println("아이디입력:");
		idI = br.readLine();
		System.out.println("패스워드입력:");
		pswI = br.readLine();
		sql = "SELECT ID,PSW FROM MEMBER WHERE ID=?";
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
	} //로그인
}
