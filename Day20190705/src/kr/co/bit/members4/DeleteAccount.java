package kr.co.bit.members4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteAccount {
	private Connection conn;
	private String sql;
	private PreparedStatement pstmt;
	private int cnt;
	
	public DeleteAccount() {
		conn=null; sql=null; pstmt=null; cnt=0;
	}
	
	public void deleteAccountProcess() throws SQLException { //ȸ��Ż��
		if (MembersMain.session == null) {
			System.out.println("�α������� �ƴմϴ�.");
//			continue;
		}
		sql = "DELETE FROM MEMBER WHERE ID=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, MembersMain.session);
		cnt = pstmt.executeUpdate();
		if(cnt!=0) {
			System.out.println("Ż��Ǿ����ϴ�");
			MembersMain.session=null;
		}
	} //ȸ��Ż��
}
