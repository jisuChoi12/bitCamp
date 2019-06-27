package kr.co.bit.haksa1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HaksaFunction {
	public static void register(Scanner input,Connection conn) {//���
		System.out.println("========���=========");
		System.out.println("1.�л�");
		System.out.println("2.����");
		System.out.println("3.������");
		System.out.println("4.�����޴�");
		System.out.println("====================");
		System.out.println("��ȣ�� ������ �ּ���");
		int select = input.nextInt();
		if(select==1) {//�л�
			System.out.println("��ȣ:");
			int no = input.nextInt();
			System.out.println("����:");
			String age = input.next();
			System.out.println("�̸�:");
			String irum = input.next();
			System.out.println("�й�:");
			String hakbun = input.next();
			try {
				Statement stmt = conn.createStatement(); //�����غ�
				String sql = "INSERT INTO STUDENT (NO,AGE,IRUM,HAKBUN) VALUES ("+no+",'"+age+"','"+irum+"','"+hakbun+"')"; //�����غ�
				int cnt = stmt.executeUpdate(sql); //����
				if(cnt==0) {
					System.out.println("��� ����");
				}else {
					System.out.println(cnt+"�� ��� �Ϸ�");
					stmt.close();
					conn.close();
				}
				conn.close(); //����
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//�л�
		else if(select==2) {//�������
			System.out.println("��ȣ:");
			int no = input.nextInt();
			System.out.println("����:");
			String age = input.next();
			System.out.println("�̸�:");
			String irum = input.next();
			System.out.println("����:");
			String subject = input.next();
			try {
				Statement stmt = conn.createStatement();
				String sql = "INSERT INTO PROFESSOR (NO,AGE,IRUM,SUBJECT) VALUES ("+no+",'"+age+"','"+irum+"','"+subject+"')";
				int cnt = stmt.executeUpdate(sql);
				if(cnt==0) {
					System.out.println("��� ����");
				}else {
					System.out.println(cnt+"�� ��� �Ϸ�");
					stmt.close();
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//�������
		else if(select==3) {//������ ���
			System.out.println("��ȣ:");
			int no = input.nextInt();
			System.out.println("����:");
			String age = input.next();
			System.out.println("�̸�:");
			String irum = input.next();
			System.out.println("�μ�:");
			String part = input.next();
			try {
				Statement stmt = conn.createStatement();
				String sql = "INSERT INTO MANAGER (NO,AGE,IRUM,PART) VALUES ("+no+",'"+age+"','"+irum+"','"+part+"')";
				int cnt = stmt.executeUpdate(sql);
				if(cnt==0) {
					System.out.println("��� ����");
				}else {
					System.out.println(cnt+" �� ��� �Ϸ�");
					stmt.close();
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//������ ���
	}//���
	public static void search(Scanner input,Connection conn) {//ã��
		System.out.println("========ã��=========");
		System.out.println("1.�л�ã�� 2.����ã�� 3.������ã��");
		int select = input.nextInt();
		System.out.println("�̸�:");
		String irumSearch = input.next();
		if(select==1) {//�л�ã��
			try {
				System.out.print("��ȣ\t����\t�̸�\t�й�\n");
				Statement stmt = conn.createStatement();
				String sql = "SELECT NO,AGE,IRUM,HAKBUN FROM STUDENT WHERE irum='"+irumSearch+"'";
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()) {
					int no = rs.getInt("no");
					String age = rs.getString("age");
					String irum = rs.getString("irum");
					String hakbun = rs.getString("hakbun");
					System.out.println(no+"\t"+age+"\t"+irum+"\t"+hakbun+"\n");
				}
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//�л�ã��
		else if(select==2) {//����ã��
			try {
				Statement stmt = conn.createStatement();
				String sql = "SELECT NO,AGE,IRUM,SUJECT FROM PROFESSOR WHERE IRUM='"+irumSearch+"'";
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()) {
					int no = rs.getInt("no");
					String age = rs.getString("age");
					String irum = rs.getString("irum");
					String subject = rs.getString("subject");
					System.out.println(no+"\t"+age+"\t"+irum+"\t"+subject+"\n");
				}
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//����ã��
		else if(select==3) {//������ã��
			try {
				Statement stmt = conn.createStatement();
				String sql = "SELECT NO,AGE,IRUM,PART FROM MANAGER WHERE IRUM='"+irumSearch+"'";
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()) {
					int no = rs.getInt("no");
					String age = rs.getString("age");
					String irum = rs.getString("irum");
					String part = rs.getString("part");
					System.out.println(no+"\t"+age+"\t"+irum+"\t"+part+"\n");
			
				}
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//������ã��
	}//ã��
	public static void delete(Scanner input,Connection conn) {//����
		System.out.println("========����=========");
		System.out.println("1.�л����� 2.�������� 3.�����ڻ���");
		int select = input.nextInt();
		System.out.println("�̸�");
		String irumDelete = input.next();
		if(select==1) {//�л�����
			try {
				Statement stmt = conn.createStatement();
				String sql = "DELETE FROM STUDENT WHERE IRUM='"+irumDelete+"'";
				int cnt = stmt.executeUpdate(sql);
				if(cnt==0) {
					System.out.println("��������");
				}else {
					System.out.println(cnt+ "�� ���� �Ϸ�");
					stmt.close();
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//�л�����
		else if(select==2) {//��������
			try {
				Statement stmt = conn.createStatement();
				String sql = "DELETE FROM PROFESSOR WHERE IRUM='"+irumDelete+"'";
				int cnt = stmt.executeUpdate(sql);
				if(cnt==0) {
					System.out.println("��������");
				}else {
					System.out.println(cnt+ "�� ���� �Ϸ�");
					stmt.close();
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//��������
		else if(select==3) {//�����ڻ���
			try {
				Statement stmt = conn.createStatement();
				String sql = "DELETE FROM MANAGER WHERE IRUM='"+irumDelete+"'";
				int cnt = stmt.executeUpdate(sql);
				if(cnt==0) {
					System.out.println("��������");
				}else {
					System.out.println(cnt+ "�� ���� �Ϸ�");
					stmt.close();
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//�����ڻ���
	}//ã��
	public static void list(Scanner input,Connection conn) {//��ü���
		System.out.println("========��ü���=========");
		System.out.println("1.�л���ü��� 2.������ü��� 3.��������ü���");
		int select = input.nextInt();
		if(select==1) {
			try {//�л���ü���
				System.out.print("��ȣ\t����\t�̸�\t�й�\n");
				Statement stmt = conn.createStatement(); //�����غ�
				String sql = "SELECT NO,AGE,IRUM,HAKBUN FROM STUDENT ORDER BY NO ASC"; //�����غ�
				ResultSet rs = stmt.executeQuery(sql); //����
				while(rs.next()) {
					int no = rs.getInt("no");
					String age = rs.getString("age");
					String irum = rs.getString("irum");
					String hakbun = rs.getString("hakbun");
					System.out.print(no+"\t"+age+"\t"+irum+"\t"+hakbun+"\n");
				}
				stmt.close();
				conn.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
		}//�л���ü���
		if(select==2) {//������ü���
			try {
					System.out.print("��ȣ\t����\t�̸�\t����\n");
					Statement stmt = conn.createStatement(); //�����غ�
					String sql = "SELECT NO,AGE,IRUM,SUBJECT FROM PROFESSOR ORDER BY NO ASC"; //�����غ�
					ResultSet rs = stmt.executeQuery(sql); //����
					while(rs.next()) {
						int no = rs.getInt("no");
						String age = rs.getString("age");
						String irum = rs.getString("irum");
						String subject = rs.getString("subject");
						System.out.print(no+"\t"+age+"\t"+irum+"\t"+subject+"\n");
					}
					stmt.close();
					conn.close();
				} catch (SQLException e) {
				e.printStackTrace();
				}
		}//������ü���
		else if(select==3) {//��������ü���
			try {
					Statement stmt = conn.createStatement(); //�����غ�
					String sql = "SELECT NO,AGE,IRUM,PART FROM MANAGER ORDER BY NO ASC"; //�����غ�
					ResultSet rs = stmt.executeQuery(sql); //����
					System.out.print("��ȣ\t����\t�̸�\t�μ�\n");
					while(rs.next()) {
						int no = rs.getInt("no");
						String age = rs.getString("age");
						String irum = rs.getString("irum");
						String part = rs.getString("part");
						System.out.print(no+"\t"+age+"\t"+irum+"\t"+part+"\n");
					}
					stmt.close();
					conn.close();
				} catch (SQLException e) {
				e.printStackTrace();
				}
		}//��������ü���
	}//��ü���
}
