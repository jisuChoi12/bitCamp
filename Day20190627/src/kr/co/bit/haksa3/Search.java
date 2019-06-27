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

	public void search() {//찾기
		System.out.println("========찾기=========");
		System.out.println("1.학생찾기 2.교수찾기 3.관리자찾기");
		protocol = input.nextInt();
		System.out.println("이름:");
		irumSearch = input.next();
		if(protocol==1) {//학생찾기
			try {
				System.out.print("번호\t나이\t이름\t학번\n");
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
		}//학생찾기
		else if(protocol==2) {//교수찾기
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
		}//교수찾기
		else if(protocol==3) {//관리자찾기
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
		}//관리자찾기
	}//찾기
}
