package kr.co.bit.members5;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Search extends Members{
	private String idS;

	public Search() {
		 idS=null;
	}
	
	public void searchProcess() throws SQLException,IOException { //찾기
		conn = getConnection();
		System.out.println("찾는 회원의 ID를 입력:");
		idS = br.readLine();
		sql = "SELECT ID,PSW,ADR,PHONE FROM MEMBER WHERE ID=?";
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
	} //찾기

}
