package kr.co.bit.members4;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignUp {
	int cnt;
	private String id;
	private String psw;
	private String adr;
	private String phone;
	private String sql;
	private PreparedStatement pstmt;
	private BufferedReader br;
	private Connection conn;
	

	public SignUp() {
		cnt = 0; id = null; psw = null; adr = null; phone = null; sql = null; pstmt = null; br = null; conn = null;
	}

	public void signUpProcess() throws SQLException,IOException { //ȸ������
		if (MembersMain.session != null) {
			System.out.println("�α��λ����Դϴ�.");
//			continue;
		}
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
