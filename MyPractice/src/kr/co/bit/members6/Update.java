package kr.co.bit.members6;

import java.io.IOException;
import java.sql.SQLException;

public class Update extends Members{
	private String idU;
	private String pswU;
	private String adrU;
	private String phoneU;
	
	public Update() {
		idU=null; pswU=null; adrU=null; phoneU=null; 
	}

	public boolean isLogin() {
		boolean login = true;
		if(Members.session == null) {
			login = false;
		}
		return login;
	}
	
	public void memSqlSearch() {
		sql = "SELECT ID,PSW,ADR,PHONE FROM MEMBER WHERE ID=?";
	}
	
	public void memSql() {
		sql = "UPDATE MEMBER SET ID=?,PSW=?,ADR=?,PHONE=?";
	}
	
	
	public void memTitle() {
		System.out.println("아이디\t패스워드\t주소\t전화번호");
	}
	
	public void searchExecuter() throws SQLException{
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, MembersMain.session);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			id = rs.getString("id");
			psw = rs.getString("psw");
			adr = rs.getString("adr");
			phone = rs.getString("phone");
			System.out.println(id+"\t"+psw+"\t"+adr+"\t"+phone);
		}
	}
	
	public void updateExecuter() throws SQLException {
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, idU);
		pstmt.setString(2, pswU);
		pstmt.setString(3, adrU);
		pstmt.setString(4, phoneU);
		cnt = pstmt.executeUpdate();
		if(cnt!=0) {
			System.out.println("회원정보가 수정되었습니다.");
			MembersMain.session = idU;
		}
	}
	
	public void setUpdateInfo() throws IOException {
		System.out.println("아이디입력:");
		idU = br.readLine();
		System.out.println("패스워드입력:");
		pswU = br.readLine();
		System.out.println("주소입력:");
		adrU = br.readLine();
		System.out.println("전화번호입력:");
		phoneU = br.readLine();
	}
	
	public void updateProcess() throws SQLException,IOException { //회원수정
		if(isLogin()) {
			conn = getConnection();
			System.out.println("수정 전 회원정보입니다.");
			memTitle();
			memSqlSearch();
			searchExecuter();
			System.out.println("회원정보를 수정하세요.");
			setUpdateInfo();
			memSql();
			updateExecuter();
		}else {
			System.out.println("로그인중이 아닙니다.");
		}
		
	} //회원수정
}
