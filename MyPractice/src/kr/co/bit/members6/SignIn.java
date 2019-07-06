package kr.co.bit.members6;

import java.io.IOException;
import java.sql.SQLException;

public class SignIn extends Members{
	
	private String idI;
	private String pswI;
	
	private String idL;
	private String pswL;
	
	public SignIn() {
		idI=null; pswI=null; idL=null; pswL=null;
	}
	
	public boolean isLogin() {
		boolean login = true;
		if(Members.session==null) {
			login = false;
		}
		return login;
	}
	
	public void setSignInInfo() throws IOException {
		System.out.println("���̵��Է�:");
		idI = br.readLine();
		System.out.println("�н������Է�:");
		pswI = br.readLine();
	}
	
	public void memSql() {
		sql = "SELECT ID,PSW FROM MEMBER WHERE ID=?";
	}
	
	public void SignInExecuter() throws SQLException{
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, idI);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			idL = rs.getString("id");
			pswL = rs.getString("psw");
			if(idI.equals(idL) && pswI.equals(pswL)) {
				System.out.println("ȯ���մϴ�! �α��εǾ����ϴ�.");
				MembersMain.session=idL;								
			}
			else if(idI.equals(idL) && !pswI.equals(pswL)) {
				System.out.println("��й�ȣ�� Ʋ���ϴ�.");
			}
		}
	}
	
	public void signInProcess() throws SQLException,IOException{ //�α���
		if(isLogin()) {
			System.out.println("�α��λ����Դϴ�.");
		}
		else {
			conn = getConnection();
			setSignInInfo();
			memSql();
			SignInExecuter();
		}
	} //�α���
}
