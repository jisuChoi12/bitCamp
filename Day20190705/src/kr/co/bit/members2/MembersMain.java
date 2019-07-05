package kr.co.bit.members2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class MembersMain {
	public static String session;
	
	static {
		session=null;
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) { //�ݺ���
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "bitadmin", "dkdlxl");
				System.out.println("R:ȸ������ L:ȸ����� S:ȸ��ã�� D:ȸ��Ż�� E:ȸ������ I:�α��� O:�α׾ƿ�");
				String protocol = br.readLine();
				
				if (protocol.equals("R") || protocol.equals("r")) { //ȸ������
					if (session != null) {
						System.out.println("�α������Դϴ�.");
						continue;
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
					if(cnt!=0) {
						System.out.println(cnt+"���� ȸ���� ��ϵǾ����ϴ�.");
					}
				} //ȸ������
				else if (protocol.equals("L") || protocol.equals("l")) { //ȸ�����
					System.out.print("���̵�\t�н�����\t�ּ�\t��ȭ��ȣ\n");
					String sql= "SELECT ID,PSW,ADR,PHONE FROM MEMBER";
					PreparedStatement pstmt = conn.prepareStatement(sql);
					ResultSet rs = pstmt.executeQuery();
					while(rs.next()) {
						String id = rs.getString("id");
						String psw = rs.getString("psw");
						String adr = rs.getString("adr");
						String phone = rs.getString("phone");
						System.out.println(id+"\t"+psw+"\t"+adr+"\t"+phone);
					}
				} //ȸ�����
				else if (protocol.equals("S") || protocol.equals("s")) { //ȸ��ã��
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
				} //ȸ��ã��
				else if (protocol.equals("D") || protocol.equals("d")) { //ȸ��Ż��
					if (session == null) {
						System.out.println("�α������� �ƴմϴ�.");
						continue;
					}
					String sql = "DELETE FROM MEMBER WHERE ID=?";
					PreparedStatement pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, session);
					int cnt = pstmt.executeUpdate();
					if(cnt!=0) {
						System.out.println("Ż��Ǿ����ϴ�");
						session=null;
					}
				} //ȸ��Ż��
				else if (protocol.equals("E") || protocol.equals("e")) { //ȸ����������
					if (session == null) {
						System.out.println("�α������� �ƴմϴ�.");
						continue;
					}
					System.out.println("���� �� ȸ�������Դϴ�.");
					System.out.println("���̵�\t�н�����\t�ּ�\t��ȭ��ȣ");
					String sql = "SELECT ID,PSW,ADR,PHONE FROM MEMBER WHERE ID=?";
					PreparedStatement pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, session);
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
						session = idU;
					}
				} //ȸ����������
				else if (protocol.equals("I") || protocol.equals("i")) { //�α���
					if (session != null) {
						System.out.println("�α������Դϴ�.");
						continue;
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
							session=idL;								
						}
						else if(idI.equals(idL) && !pswI.equals(pswL)) {
							System.out.println("��й�ȣ�� Ʋ���ϴ�.");
						}
					}
				} //�α���
				else if (protocol.equals("O") || protocol.equals("o")) { //�α׾ƿ�
					if (session == null) {
						System.out.println("�α������� �ƴմϴ�.");
						continue;
					}
					session = null;
					System.out.println("�α׾ƿ��Ǿ����ϴ�");
				} //�α׾ƿ�
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} //�ݺ���
	}
}
