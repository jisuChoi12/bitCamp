package kr.co.bit.members6;


import java.io.IOException;
import java.sql.SQLException;

public class SignUp extends Members{

	public SignUp() {
	}

	public boolean isLogin() {
		boolean login = true;
		if(Members.session==null) {
			login = false;
		}
		return login;
	}
	
	public void setSignUpInfo() throws IOException {
		System.out.println("���̵��Է�:");
		id = br.readLine();
		System.out.println("�н������Է�:");
		psw = br.readLine();
		System.out.println("�ּ��Է�:");
		adr = br.readLine();
		System.out.println("��ȭ��ȣ�Է�:");
		phone = br.readLine();
	}
	
	public void memSql(){
		sql = "INSERT INTO MEMBER(ID,PSW,ADR,PHONE) VALUES (?,?,?,?)";
	}
	
	public void sighUpExecuter() throws SQLException {
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, psw);
		pstmt.setString(3, adr);
		pstmt.setString(4, phone);
		cnt = pstmt.executeUpdate();
		if (cnt != 0) {
			System.out.println(cnt + "���� ȸ���� ��ϵǾ����ϴ�.");
		}
	}
	
	public void signUpProcess() throws SQLException,IOException { //ȸ������
		if(isLogin()) {
			System.out.println("�α��λ����Դϴ�.");
		}
		else {
			conn = getConnection();
			setSignUpInfo();
			memSql();
			sighUpExecuter();
		}
	} // ȸ������
}
