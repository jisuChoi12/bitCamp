package kr.co.bit.members5;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Update extends Members{
	private String idU;
	private String pswU;
	private String adrU;
	private String phoneU;
	
	public Update() {
		idU=null; pswU=null; adrU=null; phoneU=null; 
	}
	
	public void updateProcess() throws SQLException,IOException { //ȸ������
		if (MembersMain.session == null) {
			System.out.println("�α������� �ƴմϴ�.");
//			continue;
		}
		conn = getConnection();
		System.out.println("���� �� ȸ�������Դϴ�.");
		System.out.println("���̵�\t�н�����\t�ּ�\t��ȭ��ȣ");
		sql = "SELECT ID,PSW,ADR,PHONE FROM MEMBER WHERE ID=?";
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
		System.out.println("ȸ�������� �����ϼ���.");
		System.out.println("���̵��Է�:");
		idU = br.readLine();
		System.out.println("�н������Է�:");
		pswU = br.readLine();
		System.out.println("�ּ��Է�:");
		adrU = br.readLine();
		System.out.println("��ȭ��ȣ�Է�:");
		phoneU = br.readLine();
		sql = "UPDATE MEMBER SET ID=?,PSW=?,ADR=?,PHONE=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, idU);
		pstmt.setString(2, pswU);
		pstmt.setString(3, adrU);
		pstmt.setString(4, phoneU);
		cnt = pstmt.executeUpdate();
		if(cnt!=0) {
			System.out.println("ȸ�������� �����Ǿ����ϴ�.");
			MembersMain.session = idU;
		}
	} //ȸ������
}
