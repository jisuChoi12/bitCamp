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
			Class.forName("oracle.jdbc.driver.OracleDriver"); //로드
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","bitadmin","dkdlxl");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void setProtocol() {
		System.out.println("========등록=========");
		System.out.println("1.학생");
		System.out.println("2.교수");
		System.out.println("3.관리자");
		System.out.println("4.이전메뉴");
		System.out.println("====================");
		System.out.println("번호를 선택해 주세요");
		protocol = input.nextInt();		
	}
	
	public void setStd() {
		System.out.println("번호:");
		no = input.nextInt();
		System.out.println("나이:");
		age = input.next();
		System.out.println("이름:");
		irum = input.next();
		System.out.println("학번:");
		hakbun = input.next();
	}
	
	public void setProf() {
		System.out.println("번호:");
		no = input.nextInt();
		System.out.println("나이:");
		age = input.next();
		System.out.println("이름:");
		irum = input.next();
		System.out.println("과목:");
		subject = input.next();
	}
	
	public void setMng() {
		System.out.println("번호:");
		no = input.nextInt();
		System.out.println("나이:");
		age = input.next();
		System.out.println("이름:");
		irum = input.next();
		System.out.println("부서:");
		part = input.next();
	}
	
	public void registerProcess() {//등록
		setProtocol();
		if(protocol==1) {//학생
			setStd();
			try {
				stmt = conn.createStatement(); //공간준비
				sql = "INSERT INTO STUDENT (NO,AGE,IRUM,HAKBUN) VALUES ("+no+",'"+age+"','"+irum+"','"+hakbun+"')"; //문장준비
				cnt = stmt.executeUpdate(sql); //실행
				if(cnt==0) {
					System.out.println("등록 실패");
				}else {
					System.out.println(cnt+"건 등록 완료");
					stmt.close();
					conn.close();
				}
				conn.close(); //종료
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//학생
		else if(protocol==2) {//교수등록
			setProf();
			try {
				stmt = conn.createStatement();
				sql = "INSERT INTO PROFESSOR (NO,AGE,IRUM,SUBJECT) VALUES ("+no+",'"+age+"','"+irum+"','"+subject+"')";
				cnt = stmt.executeUpdate(sql);
				if(cnt==0) {
					System.out.println("등록 실패");
				}else {
					System.out.println(cnt+"건 등록 완료");
					stmt.close();
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//교수등록
		else if(protocol==3) {//관리자 등록
			setMng();
			try {
				stmt = conn.createStatement();
				sql = "INSERT INTO MANAGER (NO,AGE,IRUM,PART) VALUES ("+no+",'"+age+"','"+irum+"','"+part+"')";
				cnt = stmt.executeUpdate(sql);
				if(cnt==0) {
					System.out.println("등록 실패");
				}else {
					System.out.println(cnt+" 건 등록 완료");
					stmt.close();
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//관리자 등록
	}//등록
}

