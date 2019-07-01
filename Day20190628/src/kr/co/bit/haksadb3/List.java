package kr.co.bit.haksadb3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class List {
	private int protocol;
	private int no;
	private Statement stmt;
	private ResultSet rs;
	private String sql;
	private String age;
	private String irum;
	private String hakbun;
	private String subject;
	private String part;
	private Connection conn;
	private String st_age;
	private String st_irum;
	private String pf_age;
	private String pf_irum;
	private String mng_age;
	private String mng_irum;
	
	
	public List() {
		protocol=0; no=0;
		stmt=null; rs=null; sql=null; age=null; irum=null; hakbun=null; subject=null; part=null;
		st_age=null; st_irum=null; pf_age=null; pf_irum=null; mng_age=null; mng_irum=null;
	}
	
	public void listProcess() {
		System.out.println("========전체출력=========");
		System.out.println("1.학생전체출력 2.교수전체출력 3.관리자전체출력 4.전체출력");
		protocol = Register.input.nextInt();
		if(protocol==1) {
			try {//학생전체출력
				conn = Register.getConnection();
				System.out.print("번호\t나이\t이름\t학번\n");
				stmt = conn.createStatement(); //공간준비
				sql = "SELECT NO,AGE,IRUM,HAKBUN FROM STUDENT ORDER BY NO ASC"; //문장준비
				rs = stmt.executeQuery(sql); //실행
				while(rs.next()) {
					no = rs.getInt("no");
					age = rs.getString("age");
					irum = rs.getString("irum");
					hakbun = rs.getString("hakbun");
					System.out.print(no+"\t"+age+"\t"+irum+"\t"+hakbun+"\n");
				}
				stmt.close();
				conn.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
		}//학생전체출력
		if(protocol==2) {//교수전체출력
			try {
				conn = Register.getConnection();
				System.out.print("번호\t나이\t이름\t과목\n");
				stmt = conn.createStatement(); //공간준비
				sql = "SELECT NO,AGE,IRUM,SUBJECT FROM PROFESSOR ORDER BY NO ASC"; //문장준비
				rs = stmt.executeQuery(sql); //실행
				while(rs.next()) {
					no = rs.getInt("no");
					age = rs.getString("age");
					irum = rs.getString("irum");
					subject = rs.getString("subject");
					System.out.print(no+"\t"+age+"\t"+irum+"\t"+subject+"\n");
				}
				stmt.close();
				conn.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
		}//교수전체출력
		else if(protocol==3) {//관리자전체출력
			try {
				conn = Register.getConnection();
				stmt = conn.createStatement(); //공간준비
				sql = "SELECT NO,AGE,IRUM,PART FROM MANAGER ORDER BY NO ASC"; //문장준비
				rs = stmt.executeQuery(sql); //실행
				System.out.print("번호\t나이\t이름\t부서\n");
				while(rs.next()) {
					no = rs.getInt("no");
					age = rs.getString("age");
					irum = rs.getString("irum");
					part = rs.getString("part");
					System.out.print(no+"\t"+age+"\t"+irum+"\t"+part+"\n");
				}
				stmt.close();
				conn.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
		}//관리자전체출력
		
		else if(protocol==4) {//학사전체출력
			try {
				conn = Register.getConnection();
				stmt = conn.createStatement(); //공간준비
				sql = "SELECT S.NO AS 번호,S.AGE AS 학생나이,S.IRUM AS 학생이름,S.HAKBUN AS 학번,P.AGE AS 교수나이,P.IRUM AS 교수이름,P.SUBJECT AS 과목,M.AGE AS 관리자나이,M.IRUM AS 관리자이름,M.PART AS 부서 FROM (STUDENT S LEFT JOIN PROFESSOR P ON S.NO=P.NO) LEFT JOIN MANAGER M ON S.NO=M.NO ORDER BY 번호 ASC"; //문장준비
				rs = stmt.executeQuery(sql); //실행
				System.out.print("번호\t학생나이\t학생이름\t학번\t교수나이\t교수이름\t과목\t관리자나이\t관리자이름\t부서\n");
				while(rs.next()) {
					no = rs.getInt("번호");
					st_age = rs.getString("학생나이");
					st_irum = rs.getString("학생이름");
					hakbun = rs.getString("학번");
					pf_age = rs.getString("교수나이");
					pf_irum = rs.getString("교수이름");
					subject = rs.getString("과목");
					mng_age = rs.getString("관리자나이");
					mng_irum = rs.getString("관리자이름");
					part = rs.getString("부서");
					System.out.print(no+"\t"+st_age+"\t"+st_irum+"\t"+hakbun+"\t"+pf_age+"\t"+pf_irum+"\t"+subject+"\t"+mng_age+"\t"+mng_irum+"\t"+part+"\n");
				}
				stmt.close();
				conn.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
		}//학사전체출력
	}
}
