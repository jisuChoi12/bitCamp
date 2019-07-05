package kr.co.bit.members5;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignUp extends Members{

	public SignUp() {
	}

	public void signUpProcess() throws SQLException,IOException { //회원가입
		if (MembersMain.session != null) {
			System.out.println("로그인상태입니다.");
//			continue;
		}
		conn = getConnection();
		System.out.println("아이디입력:");
		id = br.readLine();
		System.out.println("패스워드입력:");
		psw = br.readLine();
		System.out.println("주소입력:");
		adr = br.readLine();
		System.out.println("전화번호입력:");
		phone = br.readLine();
		sql = "INSERT INTO MEMBER(ID,PSW,ADR,PHONE) VALUES (?,?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, psw);
		pstmt.setString(3, adr);
		pstmt.setString(4, phone);
		cnt = pstmt.executeUpdate();
		if (cnt != 0) {
			System.out.println(cnt + "건의 회원이 등록되었습니다.");
		}
	} // 회원가입
}
