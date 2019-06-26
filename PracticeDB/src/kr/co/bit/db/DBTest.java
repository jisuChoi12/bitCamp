package kr.co.bit.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//		1.�ε�(����): �ڹٿ��� �� ����Ŭ ���ž� ��� �˷���
//		2.����(Connection): url(���),id,password
//		3.�غ�(Statement): 1)�����غ� 
//						  2)�����غ�(�����غ�)
//		4.����(execute): 1) executeUpdate(); ���/����/����
//					    2) executeQuery(); �˻�/���
//		5.����(conn.close,stmt.close)

public class DBTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //�ε�
			while(true) {
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "bitadmin", "dkdlxl"); //����
				System.out.println("1.��� 2.���� 3.��ü��� 4.�˻�");
				int protocol = input.nextInt();
				if(conn==null) {
					System.out.println("�����ͺ��̽� ���� ����");
				}
				else if(protocol==1){ //���
					System.out.println("�����ͺ��̽� ���� ����");
					System.out.println("�л����");
					System.out.println("��ȣ:");
					int no = input.nextInt();
					System.out.println("����:");
					String age = input.next();
					System.out.println("�̸�:");
					String irum = input.next();
					System.out.println("�й�:");
					String hakbun = input.next();
					Statement stmt = conn.createStatement(); //�����غ�
					String sql = "INSERT INTO STUDENT(no,age,irum,hakbun) values("+no+",'"+age+"','"+irum+"','"+hakbun+"')"; //�����غ�(�����غ�)
					int cnt = stmt.executeUpdate(sql); // ����
					if(cnt==0) {
						System.out.println("�л� ��� ����");
					}else {
						System.out.println(cnt+"�� �л��� ��ϵǾ����ϴ�.");
						conn.close(); //����
						stmt.close(); //����
					}
				} //���
				else if(protocol==2) { //����
					System.out.println("�л�����");
					System.out.println("�̸�:");
					String irumDelete = input.next();
					Statement stmt = conn.createStatement(); //�����غ�
					String sql = "DELETE FROM STUDENT WHERE irum='"+irumDelete+"'"; //�����غ�
					int cnt = stmt.executeUpdate(sql); //����
					if(cnt==0) {
						System.out.println("�л� ���� ����");
					}else {
						System.out.println(cnt+"�� �л��� �����Ǿ����ϴ�.");
						conn.close(); //����
						stmt.close(); //����
					}
				} //����
				else if(protocol==3) { //��ü���
					System.out.println("��ü���");
					System.out.print("��ȣ\t����\t�̸�\t�й�\n");
					Statement stmt = conn.createStatement(); //�����غ�
					String sql = "SELECT NO,AGE,IRUM,HAKBUN FROM STUDENT ORDER BY NO ASC"; //�����غ�(�����غ�)
					ResultSet rs = stmt.executeQuery(sql); //����
					while(rs.next()) {
						int no = rs.getInt("no");
						String age = rs.getString("age");
						String irum = rs.getString("irum");
						String hakbun = rs.getString("hakbun");
						System.out.print(no+"\t"+age+"\t"+irum+"\t"+hakbun+"\n");
					}
					conn.close(); //����
					stmt.close();
				} //��ü���
				else if(protocol==4) { //�˻�
					System.out.println("�л��˻�");
					System.out.println("�̸�:");
					String irumSearch = input.next();
					System.out.print("��ȣ\t����\t�̸�\t�й�\n");
					Statement stmt = conn.createStatement(); //�����غ�
					String sql = "SELECT NO,AGE,IRUM,HAKBUN FROM STUDENT WHERE irum='"+irumSearch+"'"; //�����غ�(�����غ�)
					ResultSet rs= stmt.executeQuery(sql); //����
					while(rs.next()) {
						int no = rs.getInt("no");
						String age = rs.getString("age");
						String irum = rs.getString("irum");
						String hakbun = rs.getString("hakbun");
						System.out.print(no+"\t"+age+"\t"+irum+"\t"+hakbun+"\n");
					}
					conn.close(); //����
					stmt.close();
				} //�˻�
			} //�ݺ���
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
