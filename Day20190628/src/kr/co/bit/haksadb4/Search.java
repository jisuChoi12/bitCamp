package kr.co.bit.haksadb4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
	private ResultSet rs;
	private Connection conn;
	private PreparedStatement pstmt;
	
	public Search() {
		protocol=0; no=0;
		irumSearch=null; sql=null; irum=null; age=null; hakbun=null; part=null; subject=null; pstmt=null; rs=null; 
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
				sql = "SELECT NO,AGE,IRUM,HAKBUN FROM STUDENT WHERE irum=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, irumSearch);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					no = rs.getInt("no");
					age = rs.getString("age");
					irum = rs.getString("irum");
					hakbun = rs.getString("hakbun");
					System.out.println(no+"\t"+age+"\t"+irum+"\t"+hakbun+"\n");
				}
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//�л�ã��
		else if(protocol==2) {//����ã��
			try {
				conn = Register.getConnection();
				sql = "SELECT NO,AGE,IRUM,SUJECT FROM PROFESSOR WHERE IRUM=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, irumSearch);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					no = rs.getInt("no");
					age = rs.getString("age");
					irum = rs.getString("irum");
					subject = rs.getString("subject");
					System.out.println(no+"\t"+age+"\t"+irum+"\t"+subject+"\n");
				}
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//����ã��
		else if(protocol==3) {//������ã��
			try {
				conn = Register.getConnection();
				sql = "SELECT NO,AGE,IRUM,PART FROM MANAGER WHERE IRUM=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, irumSearch);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					no = rs.getInt("no");
					age = rs.getString("age");
					irum = rs.getString("irum");
					part = rs.getString("part");
					System.out.println(no+"\t"+age+"\t"+irum+"\t"+part+"\n");
			
				}
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//������ã��
	}
}
