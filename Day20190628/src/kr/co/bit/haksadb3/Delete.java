package kr.co.bit.haksadb3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete {
	private int protocol;
	private int cnt;
	private String irumDelete;
	private PreparedStatement pstmt;
	private String sql;
	private Connection conn;
	
	public Delete() {
		protocol=0; cnt=0;
		irumDelete=null; pstmt=null; sql=null;
	}
	
	public void deleteProcess() {
		System.out.println("========삭제=========");
		System.out.println("1.학생삭제 2.교수삭제 3.관리자삭제");
		protocol = Register.input.nextInt();
		System.out.println("이름");
		irumDelete = Register.input.next();
		if(protocol==1) {//학생삭제
			try {
				conn = Register.getConnection();
				sql = "DELETE FROM STUDENT WHERE IRUM=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, irumDelete);
				cnt = pstmt.executeUpdate();
				if(cnt==0) {
					System.out.println("삭제실패");
				}else {
					System.out.println(cnt+ "건 삭제 완료");
					pstmt.close();
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//학생삭제
		else if(protocol==2) {//교수삭제
			try {
				conn = Register.getConnection();
				sql = "DELETE FROM PROFESSOR WHERE IRUM=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, irumDelete);
				cnt = pstmt.executeUpdate();
				if(cnt==0) {
					System.out.println("삭제실패");
				}else {
					System.out.println(cnt+ "건 삭제 완료");
					pstmt.close();
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//교수삭제
		else if(protocol==3) {//관리자삭제
			try {
				conn = Register.getConnection();
				sql = "DELETE FROM MANAGER WHERE IRUM=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, irumDelete);
				cnt = pstmt.executeUpdate();
				if(cnt==0) {
					System.out.println("삭제실패");
				}else {
					System.out.println(cnt+ "건 삭제 완료");
					pstmt.close();
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//관리자삭제
	}
}
