package kr.co.bit.members4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class List {
	private Connection conn;
	private String sql;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String id;
	private String psw;
	private String adr;
	private String phone;
	
	public List() {
		conn=null; sql=null; pstmt=null; rs=null; id=null; psw=null; adr=null; phone=null;
	}
	
	public void listProcess() throws SQLException { //ȸ�����
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
