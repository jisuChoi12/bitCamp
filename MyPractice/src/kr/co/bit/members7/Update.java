package kr.co.bit.members7;

import java.io.IOException;
import java.sql.SQLException;

public class Update extends Members implements SetInfo, Process, ShowInfo, Session, SetSql{
	private String idU;
	private String pswU;
	private String adrU;
	private String phoneU;
	
	public Update() {
		idU=null; pswU=null; adrU=null; phoneU=null; 
	}
	
	public void memSqlSearchForShow() {
		sql = "SELECT ID,PSW,ADR,PHONE FROM MEMBER WHERE ID=?";
	}
	
	@Override
	public void memSql() {
		sql = "UPDATE MEMBER SET ID=?,PSW=?,ADR=?,PHONE=?";
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
			changeSessionStatus();
		}
	}

	@Override
	public void setInfo() throws IOException {
		System.out.println("���̵��Է�:");
		idU = br.readLine();
		System.out.println("�н������Է�:");
		pswU = br.readLine();
		System.out.println("�ּ��Է�:");
		adrU = br.readLine();
		System.out.println("��ȭ��ȣ�Է�:");
		phoneU = br.readLine();
	}

	@Override
	public void process() throws SQLException, IOException {
		if(isLogin()) {
			conn = getConnection();
			System.out.println("���� �� ȸ�������Դϴ�.");
			memTitle();
			memSqlSearchForShow();
			showInfo();
			System.out.println("ȸ�������� �����ϼ���.");
			setInfo();
			memSql();
			updateExecuter();
		}else {
			System.out.println("�α������� �ƴմϴ�.");
		}
	}

	@Override
	public void showInfo() throws SQLException {
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, session);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			id = rs.getString("id");
			psw = rs.getString("psw");
			adr = rs.getString("adr");
			phone = rs.getString("phone");
			System.out.println(id+"\t"+psw+"\t"+adr+"\t"+phone);
		}
	}

	@Override
	public void changeSessionStatus() {
		session = idU;
	}
}
