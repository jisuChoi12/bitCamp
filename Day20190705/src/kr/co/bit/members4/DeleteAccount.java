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
	
	public void deleteAccountProcess() throws SQLException { //È¸¿øÅ»Åð
		if (MembersMain.session == null) {
			System.out.println("·Î±×ÀÎÁßÀÌ ¾Æ´Õ´Ï´Ù.");
//			continue;
		}
		sql = "DELETE FROM MEMBER WHERE ID=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, MembersMain.session);
		cnt = pstmt.executeUpdate();
		if(cnt!=0) {
			System.out.println("Å»ÅðµÇ¾ú½À´Ï´Ù");
			MembersMain.session=null;
		}
	} //È¸¿øÅ»Åð
}
