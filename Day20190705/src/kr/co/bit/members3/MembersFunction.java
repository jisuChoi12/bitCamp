package kr.co.bit.members3;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MembersFunction {
	
	public void signUp(BufferedReader br, Connection conn) throws SQLException,IOException { //회원가입
		if (MembersMain.session != null) {
			System.out.println("로그인중입니다.");
//			continue;
		}
		System.out.println("아이디입력:");
		String id = br.readLine();
		System.out.println("패스워드입력:");
		String psw = br.readLine();
		System.out.println("주소입력:");
		String adr = br.readLine();
		System.out.println("전화번호입력:");
		String phone = br.readLine();
		String sql = "INSERT INTO MEMBER(ID,PSW,ADR,PHONE) VALUES (?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, psw);
		pstmt.setString(3, adr);
		pstmt.setString(4, phone);
		int cnt = pstmt.executeUpdate();
		if (cnt != 0) {
			System.out.println(cnt + "건의 회원이 등록되었습니다.");
		}
	} // 회원가입

	public void list(Connection conn) throws SQLException { //회원목록
		System.out.print("아이디\t패스워드\t주소\t전화번호\n");
		String sql = "SELECT ID,PSW,ADR,PHONE FROM MEMBER";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			String id = rs.getString("id");
			String psw = rs.getString("psw");
			String adr = rs.getString("adr");
			String phone = rs.getString("phone");
			System.out.println(id + "\t" + psw + "\t" + adr + "\t" + phone);
		}

	} //회원목록
	
	public void search(BufferedReader br, Connection conn) throws SQLException,IOException { //찾기
		System.out.println("찾는 회원의 ID를 입력:");
		String idSearch = br.readLine();
		String sql = "SELECT ID,PSW,ADR,PHONE FROM MEMBER WHERE ID=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, idSearch);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			String id = rs.getString("id");
			String psw = rs.getString("psw");
			String adr = rs.getString("adr");
			String phone = rs.getString("phone");
			System.out.println(id+"\t"+psw+"\t"+adr+"\t"+phone);
		}
	} //찾기
	
	public void deleteAccount(Connection conn) throws SQLException { //회원탈퇴
		if (MembersMain.session == null) {
			System.out.println("로그인중이 아닙니다.");
//			continue;
		}
		String sql = "DELETE FROM MEMBER WHERE ID=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, MembersMain.session);
		int cnt = pstmt.executeUpdate();
		if(cnt!=0) {
			System.out.println("탈퇴되었습니다");
			MembersMain.session=null;
		}
	} //회원탈퇴
	
	public void update(BufferedReader br, Connection conn) throws SQLException,IOException { //회원수정
		if (MembersMain.session == null) {
			System.out.println("로그인중이 아닙니다.");
//			continue;
		}
		System.out.println("수정 전 회원정보입니다.");
		System.out.println("아이디\t패스워드\t주소\t전화번호");
		String sql = "SELECT ID,PSW,ADR,PHONE FROM MEMBER WHERE ID=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, MembersMain.session);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			String id = rs.getString("id");
			String psw = rs.getString("psw");
			String adr = rs.getString("adr");
			String phone = rs.getString("phone");
			System.out.println(id+"\t"+psw+"\t"+adr+"\t"+phone);
		}
		System.out.println("회원정보를 수정하세요.");
		System.out.println("아이디입력:");
		String idU = br.readLine();
		System.out.println("패스워드입력:");
		String pswU = br.readLine();
		System.out.println("주소입력:");
		String adrU = br.readLine();
		System.out.println("전화번호입력:");
		String phoneU = br.readLine();
		sql = "UPDATE MEMBER SET ID=?,PSW=?,ADR=?,PHONE=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, idU);
		pstmt.setString(2, pswU);
		pstmt.setString(3, adrU);
		pstmt.setString(4, phoneU);
		int cnt = pstmt.executeUpdate();
		if(cnt!=0) {
			System.out.println("회원정보가 수정되었습니다.");
			MembersMain.session = idU;
		}
	} //회원수정
	
	public void signIn(BufferedReader br, Connection conn) throws SQLException,IOException{ //로그인
		if (MembersMain.session != null) {
			System.out.println("로그인중입니다.");
//			continue;
		}
		System.out.println("아이디입력:");
		String idI = br.readLine();
		System.out.println("패스워드입력:");
		String pswI = br.readLine();
		String sql = "SELECT ID,PSW FROM MEMBER WHERE ID=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, idI);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			String idL = rs.getString("id");
			String pswL = rs.getString("psw");
			
			if(idI.equals(idL) && pswI.equals(pswL)) {
				System.out.println("환영합니다! 로그인되었습니다.");
				MembersMain.session=idL;								
			}
			else if(idI.equals(idL) && !pswI.equals(pswL)) {
				System.out.println("비밀번호가 틀립니다.");
			}
		}
	} //로그인
	
	public void signOut() { //로그아웃
		if (MembersMain.session == null) {
			System.out.println("로그인중이 아닙니다.");
//			continue;
		}
		MembersMain.session = null;
		System.out.println("로그아웃되었습니다");
	} //로그아웃
}
