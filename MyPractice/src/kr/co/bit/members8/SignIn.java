package kr.co.bit.members8;

import java.io.IOException;
import java.sql.SQLException;

public class SignIn extends Members implements Process, SetSql, Session{
	
	public String idI;
	private String pswI;
	
	public SignIn() {
		idI=null; pswI=null;
	}
	
	public void setSignInInfo() throws IOException {
		System.out.println("���̵��Է�:");
		idI = br.readLine();
		System.out.println("�н������Է�:");
		pswI = br.readLine();
	}
	
	@Override
	public void memSql() {
		sql = "SELECT ID,PSW FROM MEMBER WHERE ID=?";
	}
	
	public void SignInExecuter() throws SQLException{
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, idI);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			id = rs.getString("id");
			psw = rs.getString("psw");
			if(idI.equals(id) && pswI.equals(psw)) {
				System.out.println("ȯ���մϴ�! �α��εǾ����ϴ�.");
				changeSessionStatus();								
			}
			else if(idI.equals(id) && !pswI.equals(psw)) {
				System.out.println("��й�ȣ�� Ʋ���ϴ�.");
				tryCount++;
				System.out.println(tryCount+"�� �߸��� ��й�ȣ �Է�..."+(3-tryCount)+"���� ��ȸ�� ���ҽ��ϴ�.");
			}
		}
	}
	
	@Override
	public void process() throws SQLException,IOException{ //�α���
		if(isLogin() || session!=null) {
			System.out.println("�α��λ����Դϴ�.");
		}
		else {
			isLock();
			conn = getConnection();
			setSignInInfo();
			memSql();
			SignInExecuter();
		}
	} //�α���

	@Override
	public void changeSessionStatus() {
		session=idI;
	}
}
