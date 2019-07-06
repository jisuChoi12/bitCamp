package kr.co.bit.members7;

import java.io.IOException;
import java.sql.SQLException;

public class Update extends Members implements SetInfo, Process, ShowInfo, Session, SetSql{
	private String idU;
	private String pswU;
	private String adrU;
	private String phoneU;
	
	public Update() {
		idU=null; pswU=null; adrU=null; phoneU=null; 
	}
	
	public void memSqlSearchForShow() {
		sql = "SELECT ID,PSW,ADR,PHONE FROM MEMBER WHERE ID=?";
	}
	
	@Override
	public void memSql() {
		sql = "UPDATE MEMBER SET ID=?,PSW=?,ADR=?,PHONE=?";
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
			changeSessionStatus();
		}
	}

	@Override
	public void setInfo() throws IOException {
		System.out.println("아이디입력:");
		idU = br.readLine();
		System.out.println("패스워드입력:");
		pswU = br.readLine();
		System.out.println("주소입력:");
		adrU = br.readLine();
		System.out.println("전화번호입력:");
		phoneU = br.readLine();
	}

	@Override
	public void process() throws SQLException, IOException {
		if(isLogin()) {
			conn = getConnection();
			System.out.println("수정 전 회원정보입니다.");
			memTitle();
			memSqlSearchForShow();
			showInfo();
			System.out.println("회원정보를 수정하세요.");
			setInfo();
			memSql();
			updateExecuter();
		}else {
			System.out.println("로그인중이 아닙니다.");
		}
	}

	@Override
	public void showInfo() throws SQLException {
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, session);
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
	public void changeSessionStatus() {
		session = idU;
	}
}
