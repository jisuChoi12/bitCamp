package kr.co.bit.members6;

import java.io.IOException;
import java.sql.SQLException;

public class Search extends Members{
	private String idS;

	public Search() {
		 idS=null;
	}
	
//	public boolean isLogin() {
//		boolean login = true;
//		if(Members.session==null) {
//			login = false;
//		}
//		return login;
//	}
	
	public void setSearchInfo() throws IOException {
		System.out.println("찾는 회원의 ID를 입력:");
		idS = br.readLine();
	}
	
	public void memSql() {
		sql = "SELECT ID,PSW,ADR,PHONE FROM MEMBER WHERE ID=?";
	}
	
	public void searchExecuter() throws SQLException{
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
	public void searchProcess() throws SQLException,IOException { //찾기
		conn = getConnection();
		setSearchInfo();
		memSql();
		searchExecuter();
		
	} //찾기

}
