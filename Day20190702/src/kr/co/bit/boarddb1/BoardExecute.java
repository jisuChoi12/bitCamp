package kr.co.bit.boarddb1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.proxy.annotation.Pre;

public class BoardExecute {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver"); //�ε�
				while(true) {//�ݺ���				
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "bitadmin", "dkdlxl"); //����
					if(conn==null) {
						System.out.println("�����ͺ��̽� ���� ����");
					} else {//�����ͺ��̽� ����
						System.out.println("�����ͺ��̽� ���� ����");
						System.out.println("====�Խ����ۼ�====");
						System.out.println("R:��� S:�˻� D:���� U:���� L:���");
						String protocol = br.readLine();
						
						if(protocol.equals("R") || protocol.equals("r")) {//���
							BoardFunction.register(conn, br);	
						}//���
						
						else if(protocol.equals("S") || protocol.equals("s")) {//�˻�
							BoardFunction.search(conn, br);
						}//�˻�
						
						else if(protocol.equals("D") || protocol.equals("d")) {//����
							BoardFunction.delete(conn, br);
						}//����
						
						else if(protocol.equals("U") || protocol.equals("u")) {//����
							BoardFunction.update(conn, br);
						}//����
						
						else if(protocol.equals("L") || protocol.equals("l")) {//��ü���
							BoardFunction.list(conn);
						}//��ü���
					}//�����ͺ��̽� ����
				}//�ݺ���
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
