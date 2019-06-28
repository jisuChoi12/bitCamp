package kr.co.bit.haksadb4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Search {
	private int protocol;
	private int no;
	private String irumSearch;
	private String sql;
	private String irum;
	private String age;
	private String hakbun;
	private String part;
	private String subject;
	private Statement stmt;
	private ResultSet rs;
	private Connection conn;
	
	public Search() {
		protocol=0; no=0;
		irumSearch=null; sql=null; irum=null; age=null; hakbun=null; part=null; subject=null; stmt=null; rs=null; 
	}
		
	public void searchProcess() {
		System.out.println("========ã��=========");
		System.out.println("1.�л�ã�� 2.����ã�� 3.������ã��");
		protocol = Register.input.nextInt();
		System.out.println("�̸�:");
		irumSearch = Register.input.next();
		if(protocol==1) {//�л�ã��
			try {
				conn = Register.getConnection();
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
				conn = Register.getConnection();
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
				conn = Register.getConnection();
				stmt = conn.createStatement();
				sql = "SELECT NO,AGE,IRUM,PART FROM MANAGER WHERE IRUM='"+irumSearch+"'";
				rs = stmt.executeQuery(sql);
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
	}
}
