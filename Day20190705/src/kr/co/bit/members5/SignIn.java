package kr.co.bit.members5;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SignIn extends Members{
	
	private String idI;
	private String pswI;
	
	private String idL;
	private String pswL;
	
	public SignIn() {
		idI=null; pswI=null; idL=null; pswL=null;
	}
	
	public void signInProcess() throws SQLException,IOException{ //�α���
		if (MembersMain.session != null) {
			System.out.println("�α��λ����Դϴ�.");
//			continue;
		}
		conn = getConnection();
		System.out.println("���̵��Է�:");
		idI = br.readLine();
		System.out.println("�н������Է�:");
		pswI = br.readLine();
		sql = "SELECT ID,PSW FROM MEMBER WHERE ID=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, idI);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			idL = rs.getString("id");
			pswL = rs.getString("psw");
			
			if(idI.equals(idL) && pswI.equals(pswL)) {
				System.out.println("ȯ���մϴ�! �α��εǾ����ϴ�.");
				MembersMain.session=idL;								
			}
			else if(idI.equals(idL) && !pswI.equals(pswL)) {
				System.out.println("��й�ȣ�� Ʋ���ϴ�.");
			}
		}
	} //�α���
}
