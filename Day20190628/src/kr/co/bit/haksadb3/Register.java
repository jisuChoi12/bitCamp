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
				System.out.println("데이터베이스 연결 실패");
			}
			else {
				System.out.println("데이터베이스 연결 성공");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void registerProcess() {
		System.out.println("========등록=========");
		System.out.println("1.학생");
		System.out.println("2.교수");
		System.out.println("3.관리자");
		System.out.println("4.이전메뉴");
		System.out.println("====================");
		System.out.println("번호를 선택해 주세요");
		protocol = input.nextInt();
		if(protocol==1) {//학생
			System.out.println("번호:");
			no = input.nextInt();
			System.out.println("나이:");
			age = input.next();
			System.out.println("이름:");
			irum = input.next();
			System.out.println("학번:");
			hakbun = input.next();
			try {
				conn = getConnection();
				sql = "INSERT INTO STUDENT (NO,AGE,IRUM,HAKBUN) VALUES (?,?,?,?)"; //문장준비
				PreparedStatement pstmt = conn.prepareStatement(sql); //문장준비
				pstmt.setInt(1, no);
				pstmt.setString(2, age);
				pstmt.setString(3, irum);
				pstmt.setString(4, hakbun);
				cnt = pstmt.executeUpdate(); //실행
				if(cnt==0) {
					System.out.println("등록 실패");
				}else {
					System.out.println(cnt+"건 등록 완료");
					pstmt.close();
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//학생
		else if(protocol==2) {//교수등록
			System.out.println("번호:");
			no = input.nextInt();
			System.out.println("나이:");
			age = input.next();
			System.out.println("이름:");
			irum = input.next();
			System.out.println("과목:");
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
					System.out.println("등록 실패");
				}else {
					System.out.println(cnt+"건 등록 완료");
					pstmt.close();
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//교수등록
		else if(protocol==3) {//관리자 등록
			System.out.println("번호:");
			no = input.nextInt();
			System.out.println("나이:");
			age = input.next();
			System.out.println("이름:");
			irum = input.next();
			System.out.println("부서:");
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
					System.out.println("등록 실패");
				}else {
					System.out.println(cnt+" 건 등록 완료");
					pstmt.close();
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//관리자 등록
	}
}
