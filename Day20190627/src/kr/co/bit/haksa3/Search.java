package kr.co.bit.haksa3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Search {
	private int no;
	private int protocol;
	private Scanner input;
	private Connection conn;
	private ResultSet rs;
	private Statement stmt;
	private String irumSearch;
	private String age;
	private String irum;
	private String hakbun;
	private String subject;
	private String part; 
	private String sql;
	

	public Search(){
		input = new Scanner(System.in);
		no=0; protocol=0; 
		rs=null; stmt=null; irumSearch=null; age=null; irum=null; hakbun=null; subject=null; part=null; sql=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","bitadmin","dkdlxl");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void search() {//ã��
		System.out.println("========ã��=========");
		System.out.println("1.�л�ã�� 2.����ã�� 3.������ã��");
		protocol = input.nextInt();
		System.out.println("�̸�:");
		irumSearch = input.next();
		if(protocol==1) {//�л�ã��
			try {
				System.out.print("��ȣ\t����\t�̸�\t�й�\n");
				stmt = conn.createStatement();
				sql = "SELECT NO,AGE,IRUM,HAKBUN FROM STUDENT WHERE irum='"+irumSearch+"'";
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					no = rs.getInt("no");
					age = rs.getString("age");
					irum = rs.getString("irum");
					hakbun = rs.getString("hakbun");
					System.out.println(no+"\t"+age+"\t"+irum+"\t"+hakbun+"\n");
				}
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//�л�ã��
		else if(protocol==2) {//����ã��
			try {
				stmt = conn.createStatement();
				sql = "SELECT NO,AGE,IRUM,SUJECT FROM PROFESSOR WHERE IRUM='"+irumSearch+"'";
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					no = rs.getInt("no");
					age = rs.getString("age");
					irum = rs.getString("irum");
					subject = rs.getString("subject");
					System.out.println(no+"\t"+age+"\t"+irum+"\t"+subject+"\n");
				}
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//����ã��
		else if(protocol==3) {//������ã��
			try {
				stmt = conn.createStatement();
				sql = "SELECT NO,AGE,IRUM,PART FROM MANAGER WHERE IRUM='"+irumSearch+"'";
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()) {
					no = rs.getInt("no");
					age = rs.getString("age");
					irum = rs.getString("irum");
					part = rs.getString("part");
					System.out.println(no+"\t"+age+"\t"+irum+"\t"+part+"\n");
			
				}
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//������ã��
	}//ã��
}
