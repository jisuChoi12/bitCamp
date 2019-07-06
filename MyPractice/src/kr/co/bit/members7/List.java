package kr.co.bit.members7;

import java.sql.SQLException;

public class List extends Members implements Process, ShowInfo, SetSql{

	public List() {
	}

	@Override
	public void memSql() {
		sql = "SELECT ID,PSW,ADR,PHONE FROM MEMBER";
	}
	
	@Override
	public void process() throws SQLException { //회원목록
		conn = getConnection();
		memTitle();
		memSql();
		showInfo();
	} //회원목록

	@Override
	public void showInfo() throws SQLException {
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
}
