package kr.co.bit.boarddb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardExecute {
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Register register = new Register();
		Delete delete = new Delete();
		Update update = new Update();
		Search search = new Search();
		List list = new List();
		while(true) {//�ݺ���
			Connection conn = null; 
			try {
				conn = Board.getConnection(); 
				System.out.println("====�Խ����ۼ�===="); 
				System.out.println("R:��� S:�˻� D:���� U:���� L:���"); 
				String protocol = br.readLine(); 
								
				if(protocol.equals("R") || protocol.equals("r")) {//���
					register.registerProcess();	
				}//���
				
				else if(protocol.equals("S") || protocol.equals("s")) {//�˻�
					search.searchProcess();
				}//�˻�
				
				else if(protocol.equals("D") || protocol.equals("d")) {//����
					delete.deleteProcess();
				}//����
				
				else if(protocol.equals("U") || protocol.equals("u")) {//����
					update.updateProcess();
				}//����
				
				else if(protocol.equals("L") || protocol.equals("l")) {//��ü���
					list.listProcess();
				}//��ü���
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//�ݺ���
	}
}
