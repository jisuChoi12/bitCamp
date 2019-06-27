package kr.co.bit.haksa3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Register {
	private int protocol;
	private int no;	
	private int cnt;
	private Scanner input;
	private Connection conn;
	private Statement stmt;
	private String age;
	private String irum;
	private String hakbun;
	private String subject;
	private String part;
	private String sql;

	public Register() {
		input = new Scanner(System.in);
		no=0;cnt=0;protocol=0;
		age=null;irum=null;hakbun=null;subject=null;part=null;sql=null;stmt=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //�ε�
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","bitadmin","dkdlxl");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void setProtocol() {
		System.out.println("========���=========");
		System.out.println("1.�л�");
		System.out.println("2.����");
		System.out.println("3.������");
		System.out.println("4.�����޴�");
		System.out.println("====================");
		System.out.println("��ȣ�� ������ �ּ���");
		protocol = input.nextInt();		
	}
	
	public void setStd() {
		System.out.println("��ȣ:");
		no = input.nextInt();
		System.out.println("����:");
		age = input.next();
		System.out.println("�̸�:");
		irum = input.next();
		System.out.println("�й�:");
		hakbun = input.next();
	}
	
	public void setProf() {
		System.out.println("��ȣ:");
		no = input.nextInt();
		System.out.println("����:");
		age = input.next();
		System.out.println("�̸�:");
		irum = input.next();
		System.out.println("����:");
		subject = input.next();
	}
	
	public void setMng() {
		System.out.println("��ȣ:");
		no = input.nextInt();
		System.out.println("����:");
		age = input.next();
		System.out.println("�̸�:");
		irum = input.next();
		System.out.println("�μ�:");
		part = input.next();
	}
	
	public void registerProcess() {//���
		setProtocol();
		if(protocol==1) {//�л�
			setStd();
			try {
				stmt = conn.createStatement(); //�����غ�
				sql = "INSERT INTO STUDENT (NO,AGE,IRUM,HAKBUN) VALUES ("+no+",'"+age+"','"+irum+"','"+hakbun+"')"; //�����غ�
				cnt = stmt.executeUpdate(sql); //����
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
		else if(protocol==2) {//�������
			setProf();
			try {
				stmt = conn.createStatement();
				sql = "INSERT INTO PROFESSOR (NO,AGE,IRUM,SUBJECT) VALUES ("+no+",'"+age+"','"+irum+"','"+subject+"')";
				cnt = stmt.executeUpdate(sql);
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
		else if(protocol==3) {//������ ���
			setMng();
			try {
				stmt = conn.createStatement();
				sql = "INSERT INTO MANAGER (NO,AGE,IRUM,PART) VALUES ("+no+",'"+age+"','"+irum+"','"+part+"')";
				cnt = stmt.executeUpdate(sql);
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
}

