package kr.co.bit.members4;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Search {
	private BufferedReader br;
	private Connection conn;
	private String idS;
	private String sql;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String id;
	private String psw;
	private String adr;
	private String phone;
	
	public Search() {
		br=null; conn=null; idS=null; sql=null; pstmt=null; rs=null; id=null; psw=null; adr=null; phone=null;
	}
	
	public void searchProcess() throws SQLException,IOException { //찾기
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
