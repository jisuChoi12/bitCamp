package kr.co.bit.members5;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignUp extends Members{

	public SignUp() {
	}

	public void signUpProcess() throws SQLException,IOException { //ȸ������
		if (MembersMain.session != null) {
			System.out.println("�α��λ����Դϴ�.");
//			continue;
		}
		conn = getConnection();
		System.out.println("���̵��Է�:");
		id = br.readLine();
		System.out.println("�н������Է�:");
		psw = br.readLine();
		System.out.println("�ּ��Է�:");
		adr = br.readLine();
		System.out.println("��ȭ��ȣ�Է�:");
		phone = br.readLine();
		sql = "INSERT INTO MEMBER(ID,PSW,ADR,PHONE) VALUES (?,?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, psw);
		pstmt.setString(3, adr);
		pstmt.setString(4, phone);
		cnt = pstmt.executeUpdate();
		if (cnt != 0) {
			System.out.println(cnt + "���� ȸ���� ��ϵǾ����ϴ�.");
		}
	} // ȸ������
}
