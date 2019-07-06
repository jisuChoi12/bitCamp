package kr.co.bit.haksa2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.StringTokenizer;

public class HaksaMain {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Connection conn = null;
		HaksaFunction haksafunction = new HaksaFunction();

		while (true) {
			try {
				Class.forName("oracle.jdbc.OracleDriver"); // �ε�
				conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "bitadmin", "dkdlxl"); // ����
				if (conn != null) {
					System.out.println("�����ͺ��̽� ���� ����");
					System.out.println("=====�޴�=====");
					System.out.println("1.��� 2.ã�� 3.���� 4.���� 5.��ü��� 0.����");
					int protocol = Integer.parseInt(br.readLine());
					if (protocol == 1) {
						haksafunction.register(br, conn, protocol);
					} // ���
					else if (protocol == 2) {
						haksafunction.search(br, conn, protocol);
					} // ã��
					else if (protocol == 3) {
						haksafunction.delete(br, conn, protocol);
					} // ����
					else if (protocol == 4) {
						haksafunction.update(br, conn, protocol);
					} // ����
					else if (protocol == 5) {
						haksafunction.list(br, conn, protocol);
					} // ��ü���
					else if(protocol == 0) {// ����
						System.out.println("=====����=====");
						System.exit(0);
					} // ����
					else {
						System.out.println("�޴����� ����ּ���...");
					}
				} else {
					System.out.println("�����ͺ��̽� ���� ����");
					System.exit(0);
				}
			}

			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
