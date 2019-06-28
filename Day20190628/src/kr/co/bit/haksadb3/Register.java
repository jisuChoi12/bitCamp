package kr.co.bit.haksadb3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Register {
	public static Scanner input;
	public static Connection conn;
	private int protocol;
	private int no;
	private int cnt;
	private String age;
	private String irum;
	private String hakbun;
	private String subject;
	private String part;
	private String sql;
	private PreparedStatement pstmt;
	
	static {
		input = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public Register() {
		cnt=0; no=0; protocol=0;
		age=null; irum=null; hakbun=null; subject=null; part=null; sql=null; pstmt=null;
	}
	
	public static Connection getConnection() {
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","bitadmin","dkdlxl");
			if(conn==null) {
				System.out.println("�����ͺ��̽� ���� ����");
			}
			else {
				System.out.println("�����ͺ��̽� ���� ����");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void registerProcess() {
		System.out.println("========���=========");
		System.out.println("1.�л�");
		System.out.println("2.����");
		System.out.println("3.������");
		System.out.println("4.�����޴�");
		System.out.println("====================");
		System.out.println("��ȣ�� ������ �ּ���");
		protocol = input.nextInt();
		if(protocol==1) {//�л�
			System.out.println("��ȣ:");
			no = input.nextInt();
			System.out.println("����:");
			age = input.next();
			System.out.println("�̸�:");
			irum = input.next();
			System.out.println("�й�:");
			hakbun = input.next();
			try {
				conn = getConnection();
				sql = "INSERT INTO STUDENT (NO,AGE,IRUM,HAKBUN) VALUES (?,?,?,?)"; //�����غ�
				PreparedStatement pstmt = conn.prepareStatement(sql); //�����غ�
				pstmt.setInt(1, no);
				pstmt.setString(2, age);
				pstmt.setString(3, irum);
				pstmt.setString(4, hakbun);
				cnt = pstmt.executeUpdate(); //����
				if(cnt==0) {
					System.out.println("��� ����");
				}else {
					System.out.println(cnt+"�� ��� �Ϸ�");
					pstmt.close();
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//�л�
		else if(protocol==2) {//�������
			System.out.println("��ȣ:");
			no = input.nextInt();
			System.out.println("����:");
			age = input.next();
			System.out.println("�̸�:");
			irum = input.next();
			System.out.println("����:");
			subject = input.next();
			try {
				conn = getConnection();
				sql = "INSERT INTO PROFESSOR (NO,AGE,IRUM,SUBJECT) VALUES (?,?,?,?)";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, no);
				pstmt.setString(2, age);
				pstmt.setString(3, irum);
				pstmt.setString(4, subject);
				cnt = pstmt.executeUpdate();
				if(cnt==0) {
					System.out.println("��� ����");
				}else {
					System.out.println(cnt+"�� ��� �Ϸ�");
					pstmt.close();
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//�������
		else if(protocol==3) {//������ ���
			System.out.println("��ȣ:");
			no = input.nextInt();
			System.out.println("����:");
			age = input.next();
			System.out.println("�̸�:");
			irum = input.next();
			System.out.println("�μ�:");
			part = input.next();
			try {
				conn = getConnection();
				sql = "INSERT INTO MANAGER (NO,AGE,IRUM,PART) VALUES (?,?,?,?)";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, no);
				pstmt.setString(2, age);
				pstmt.setString(3, irum);
				pstmt.setString(4, part);
				cnt = pstmt.executeUpdate();
				if(cnt==0) {
					System.out.println("��� ����");
				}else {
					System.out.println(cnt+" �� ��� �Ϸ�");
					pstmt.close();
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//������ ���
	}
}
