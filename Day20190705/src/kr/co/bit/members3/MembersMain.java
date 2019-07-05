package kr.co.bit.members3;

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
		MembersFunction suiFunction = new MembersFunction();
		while (true) { //�ݺ���
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "bitadmin", "dkdlxl");
				System.out.println("R:ȸ������ L:ȸ����� S:ȸ��ã�� D:ȸ��Ż�� E:ȸ������ I:�α��� O:�α׾ƿ�");
				String protocol = br.readLine();
				
				if (protocol.equals("R") || protocol.equals("r")) { //ȸ������
					suiFunction.signUp(br, conn);
				} //ȸ������
				else if (protocol.equals("L") || protocol.equals("l")) { //ȸ�����
					suiFunction.list(conn);
				} //ȸ�����
				else if (protocol.equals("S") || protocol.equals("s")) { //ȸ��ã��
					suiFunction.search(br, conn);
				} //ȸ��ã��
				else if (protocol.equals("D") || protocol.equals("d")) { //ȸ��Ż��
					suiFunction.deleteAccount(conn);
				} //ȸ��Ż��
				else if (protocol.equals("E") || protocol.equals("e")) { //ȸ����������
					suiFunction.update(br, conn);
				} //ȸ����������
				else if (protocol.equals("I") || protocol.equals("i")) { //�α���
					suiFunction.signIn(br, conn);
				} //�α���
				else if (protocol.equals("O") || protocol.equals("o")) { //�α׾ƿ�
					suiFunction.signOut();
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
