package kr.co.bit.members3;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MembersFunction {
	
	public void signUp(BufferedReader br, Connection conn) throws SQLException,IOException { //ȸ������
		if (MembersMain.session != null) {
			System.out.println("�α������Դϴ�.");
//			continue;
		}
		System.out.println("���̵��Է�:");
		String id = br.readLine();
		System.out.println("�н������Է�:");
		String psw = br.readLine();
		System.out.println("�ּ��Է�:");
		String adr = br.readLine();
		System.out.println("��ȭ��ȣ�Է�:");
		String phone = br.readLine();
		String sql = "INSERT INTO MEMBER(ID,PSW,ADR,PHONE) VALUES (?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, psw);
		pstmt.setString(3, adr);
		pstmt.setString(4, phone);
		int cnt = pstmt.executeUpdate();
		if (cnt != 0) {
			System.out.println(cnt + "���� ȸ���� ��ϵǾ����ϴ�.");
		}
	} // ȸ������

	public void list(Connection conn) throws SQLException { //ȸ�����
		System.out.print("���̵�\t�н�����\t�ּ�\t��ȭ��ȣ\n");
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

	} //ȸ�����
	
	public void search(BufferedReader br, Connection conn) throws SQLException,IOException { //ã��
		System.out.println("ã�� ȸ���� ID�� �Է�:");
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
	} //ã��
	
	public void deleteAccount(Connection conn) throws SQLException { //ȸ��Ż��
		if (MembersMain.session == null) {
			System.out.println("�α������� �ƴմϴ�.");
//			continue;
		}
		String sql = "DELETE FROM MEMBER WHERE ID=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, MembersMain.session);
		int cnt = pstmt.executeUpdate();
		if(cnt!=0) {
			System.out.println("Ż��Ǿ����ϴ�");
			MembersMain.session=null;
		}
	} //ȸ��Ż��
	
	public void update(BufferedReader br, Connection conn) throws SQLException,IOException { //ȸ������
		if (MembersMain.session == null) {
			System.out.println("�α������� �ƴմϴ�.");
//			continue;
		}
		System.out.println("���� �� ȸ�������Դϴ�.");
		System.out.println("���̵�\t�н�����\t�ּ�\t��ȭ��ȣ");
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
		System.out.println("ȸ�������� �����ϼ���.");
		System.out.println("���̵��Է�:");
		String idU = br.readLine();
		System.out.println("�н������Է�:");
		String pswU = br.readLine();
		System.out.println("�ּ��Է�:");
		String adrU = br.readLine();
		System.out.println("��ȭ��ȣ�Է�:");
		String phoneU = br.readLine();
		sql = "UPDATE MEMBER SET ID=?,PSW=?,ADR=?,PHONE=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, idU);
		pstmt.setString(2, pswU);
		pstmt.setString(3, adrU);
		pstmt.setString(4, phoneU);
		int cnt = pstmt.executeUpdate();
		if(cnt!=0) {
			System.out.println("ȸ�������� �����Ǿ����ϴ�.");
			MembersMain.session = idU;
		}
	} //ȸ������
	
	public void signIn(BufferedReader br, Connection conn) throws SQLException,IOException{ //�α���
		if (MembersMain.session != null) {
			System.out.println("�α������Դϴ�.");
//			continue;
		}
		System.out.println("���̵��Է�:");
		String idI = br.readLine();
		System.out.println("�н������Է�:");
		String pswI = br.readLine();
		String sql = "SELECT ID,PSW FROM MEMBER WHERE ID=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, idI);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			String idL = rs.getString("id");
			String pswL = rs.getString("psw");
			
			if(idI.equals(idL) && pswI.equals(pswL)) {
				System.out.println("ȯ���մϴ�! �α��εǾ����ϴ�.");
				MembersMain.session=idL;								
			}
			else if(idI.equals(idL) && !pswI.equals(pswL)) {
				System.out.println("��й�ȣ�� Ʋ���ϴ�.");
			}
		}
	} //�α���
	
	public void signOut() { //�α׾ƿ�
		if (MembersMain.session == null) {
			System.out.println("�α������� �ƴմϴ�.");
//			continue;
		}
		MembersMain.session = null;
		System.out.println("�α׾ƿ��Ǿ����ϴ�");
	} //�α׾ƿ�
}
