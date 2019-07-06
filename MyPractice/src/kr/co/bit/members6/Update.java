package kr.co.bit.members6;

import java.io.IOException;
import java.sql.SQLException;

public class Update extends Members{
	private String idU;
	private String pswU;
	private String adrU;
	private String phoneU;
	
	public Update() {
		idU=null; pswU=null; adrU=null; phoneU=null; 
	}

	public boolean isLogin() {
		boolean login = true;
		if(Members.session == null) {
			login = false;
		}
		return login;
	}
	
	public void memSqlSearch() {
		sql = "SELECT ID,PSW,ADR,PHONE FROM MEMBER WHERE ID=?";
	}
	
	public void memSql() {
		sql = "UPDATE MEMBER SET ID=?,PSW=?,ADR=?,PHONE=?";
	}
	
	
	public void memTitle() {
		System.out.println("���̵�\t�н�����\t�ּ�\t��ȭ��ȣ");
	}
	
	public void searchExecuter() throws SQLException{
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
	}
	
	public void updateExecuter() throws SQLException {
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
	}
	
	public void setUpdateInfo() throws IOException {
		System.out.println("���̵��Է�:");
		idU = br.readLine();
		System.out.println("�н������Է�:");
		pswU = br.readLine();
		System.out.println("�ּ��Է�:");
		adrU = br.readLine();
		System.out.println("��ȭ��ȣ�Է�:");
		phoneU = br.readLine();
	}
	
	public void updateProcess() throws SQLException,IOException { //ȸ������
		if(isLogin()) {
			conn = getConnection();
			System.out.println("���� �� ȸ�������Դϴ�.");
			memTitle();
			memSqlSearch();
			searchExecuter();
			System.out.println("ȸ�������� �����ϼ���.");
			setUpdateInfo();
			memSql();
			updateExecuter();
		}else {
			System.out.println("�α������� �ƴմϴ�.");
		}
		
	} //ȸ������
}
