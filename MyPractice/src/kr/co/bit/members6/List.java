package kr.co.bit.members6;

import java.sql.SQLException;

public class List extends Members {

	public List() {
	}

//	public boolean isLogin() {
//		boolean login = true;
//		if(Members.session==null) {
//			login = false;
//		}
//		return login;
//	}
	
	public void memTitle() {
		System.out.print("���̵�\t�н�����\t�ּ�\t��ȭ��ȣ\n");
	}

	public void memSql() {
		sql = "SELECT ID,PSW,ADR,PHONE FROM MEMBER";
	}
	
	public void listExecuter() throws SQLException {
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while (rs.next()) {
			id = rs.getString("id");
			psw = rs.getString("psw");
			adr = rs.getString("adr");
			phone = rs.getString("phone");
			System.out.println(id + "\t" + psw + "\t" + adr + "\t" + phone);
		}
	}
	
	public void listProcess() throws SQLException { //ȸ�����
		conn = getConnection();
		memTitle();
		memSql();
		listExecuter();
	} //ȸ�����
}
