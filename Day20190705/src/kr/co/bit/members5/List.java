package kr.co.bit.members5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class List extends Members {

	public List() {
	}
	
	public void listProcess() throws SQLException { //ȸ�����
		conn = getConnection();
		System.out.print("���̵�\t�н�����\t�ּ�\t��ȭ��ȣ\n");
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

	} //ȸ�����
}
