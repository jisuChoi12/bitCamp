package kr.co.bit.members8;

import java.io.IOException;
import java.sql.SQLException;

public class Search extends Members implements Process, ShowInfo{
	private String idS;

	public Search() {
		 idS=null;
	}
	
	public void setSearchInfo() throws IOException {
		System.out.println("찾는 회원의 ID를 입력:");
		idS = br.readLine();
	}
	
	public void memSql() {
		sql = "SELECT ID,PSW,ADR,PHONE FROM MEMBER WHERE ID=?";
	}

	@Override
	public void showInfo() throws SQLException {
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, idS);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			id = rs.getString("id");
			psw = rs.getString("psw");
			adr = rs.getString("adr");
			phone = rs.getString("phone");
			System.out.println(id+"\t"+psw+"\t"+adr+"\t"+phone);
		}
	}
	
	@Override
	public void process() throws SQLException, IOException {
		conn = getConnection();
		setSearchInfo();
		memTitle();
		memSql();
		showInfo();
	}
}
