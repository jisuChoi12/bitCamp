package kr.co.bit.haksa1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HaksaProject {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Connection conn = null;
		while(true) {//�ݺ���
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver"); //�ε�
				conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","bitadmin","dkdlxl"); //����
				if(conn==null) {
					System.out.println("�����ͺ��̽� ���� ����");
				}
				else {
					System.out.println("�����ͺ��̽� ���� ����");
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("�л����");
			System.out.println("========�޴�========");
			System.out.println("1.���");
			System.out.println("2.ã��");
			System.out.println("3.����");
			System.out.println("4.��ü���");
			System.out.println("0.����");
			System.out.println("===================");
			System.out.println("��ȣ�� ������ �ּ���");
			int protocol = input.nextInt();
			
			if(protocol==1){//���
				HaksaFunction.register(input, conn);
			}//���
			
			else if(protocol==2) {//ã��
				HaksaFunction.search(input, conn);
			}//ã��
			
			else if(protocol==3) {//����
				HaksaFunction.delete(input, conn);
			}//����
			
			else if(protocol==4) {//��ü���
				HaksaFunction.list(input, conn);
			}//��ü���

			else if(protocol==0) {//����
				System.out.println("����");
				System.exit(0);
			}//����
		}//�ݺ���
	}//main

}