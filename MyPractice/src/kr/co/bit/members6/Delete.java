package kr.co.bit.members6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete extends Members{
	private Connection conn;
	private String sql;
	private PreparedStatement pstmt;
	private int cnt;
	
	public Delete() {
		conn=null; sql=null; pstmt=null; cnt=0;
	}
	
	public boolean isLogin() {
		boolean login = true;
		if(Members.session==null) {
			login = false;
		}
		return login;
	}
	
	public void memSql() {
		sql = "DELETE FROM MEMBER WHERE ID=?";
	}
	
	public void deleteExecuter() throws SQLException {
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, MembersMain.session);
		cnt = pstmt.executeUpdate();
		if(cnt!=0) {
			System.out.println("Ż��Ǿ����ϴ�");
			MembersMain.session=null;
		}
	}
	
	public void deleteProcess() throws SQLException { //ȸ��Ż��
		if(isLogin()) {
			memSql();
			deleteExecuter();
		}
		else {
			System.out.println("�α������� �ƴմϴ�.");
		}
	} //ȸ��Ż��
}
