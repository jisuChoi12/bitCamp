package kr.co.bit.members7;


import java.io.IOException;
import java.sql.SQLException;

public class SignUp extends Members implements SetInfo, Process, SetSql{

	public SignUp() {
	}

	@Override
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
	
	@Override
	public void setInfo() throws IOException {
		System.out.println("���̵��Է�:");
		id = br.readLine();
		System.out.println("�н������Է�:");
		psw = br.readLine();
		System.out.println("�ּ��Է�:");
		adr = br.readLine();
		System.out.println("��ȭ��ȣ�Է�:");
		phone = br.readLine();
	}

	@Override
	public void process() throws SQLException, IOException {
		if(isLogin()) {
			System.out.println("�α��λ����Դϴ�.");
		}
		else {
			conn = getConnection();
			setInfo();
			memSql();
			sighUpExecuter();
		}
	}
}
