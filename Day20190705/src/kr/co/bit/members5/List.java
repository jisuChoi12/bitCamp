package kr.co.bit.members5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class List extends Members {

	public List() {
	}
	
	public void listProcess() throws SQLException { //회원목록
		conn = getConnection();
		System.out.print("아이디\t패스워드\t주소\t전화번호\n");
		sql = "SELECT ID,PSW,ADR,PHONE FROM MEMBER";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while (rs.next()) {
			id = rs.getString("id");
			psw = rs.getString("psw");
			adr = rs.getString("adr");
			phone = rs.getString("phone");
			System.out.println(id + "\t" + psw + "\t" + adr + "\t" + phone);
		}

	} //회원목록
}
