package kr.co.bit.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//		1.로드(적재): 자바에게 나 오라클 쓸거야 라고 알려줌
//		2.연결(Connection): url(경로),id,password
//		3.준비(Statement): 1)공간준비 
//						  2)문장준비(쿼리준비)
//		4.실행(execute): 1) executeUpdate(); 등록/삭제/수정
//					    2) executeQuery(); 검색/목록
//		5.종료(conn.close,stmt.close)

public class DBTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //로드
			while(true) {
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "bitadmin", "dkdlxl"); //연결
				System.out.println("1.등록 2.삭제 3.전체출력 4.검색");
				int protocol = input.nextInt();
				if(conn==null) {
					System.out.println("데이터베이스 연결 실패");
				}
				else if(protocol==1){ //등록
					System.out.println("데이터베이스 연결 성공");
					System.out.println("학생등록");
					System.out.println("번호:");
					int no = input.nextInt();
					System.out.println("나이:");
					String age = input.next();
					System.out.println("이름:");
					String irum = input.next();
					System.out.println("학번:");
					String hakbun = input.next();
					Statement stmt = conn.createStatement(); //공간준비
					String sql = "INSERT INTO STUDENT(no,age,irum,hakbun) values("+no+",'"+age+"','"+irum+"','"+hakbun+"')"; //문장준비(쿼리준비)
					int cnt = stmt.executeUpdate(sql); // 실행
					if(cnt==0) {
						System.out.println("학생 등록 실패");
					}else {
						System.out.println(cnt+"건 학생이 등록되었습니다.");
						conn.close(); //종료
						stmt.close(); //종료
					}
				} //등록
				else if(protocol==2) { //삭제
					System.out.println("학생삭제");
					System.out.println("이름:");
					String irumDelete = input.next();
					Statement stmt = conn.createStatement(); //공간준비
					String sql = "DELETE FROM STUDENT WHERE irum='"+irumDelete+"'"; //문장준비
					int cnt = stmt.executeUpdate(sql); //실행
					if(cnt==0) {
						System.out.println("학생 삭제 실패");
					}else {
						System.out.println(cnt+"건 학생이 삭제되었습니다.");
						conn.close(); //종료
						stmt.close(); //종료
					}
				} //삭제
				else if(protocol==3) { //전체출력
					System.out.println("전체출력");
					System.out.print("번호\t나이\t이름\t학번\n");
					Statement stmt = conn.createStatement(); //공간준비
					String sql = "SELECT NO,AGE,IRUM,HAKBUN FROM STUDENT ORDER BY NO ASC"; //문장준비(쿼리준비)
					ResultSet rs = stmt.executeQuery(sql); //실행
					while(rs.next()) {
						int no = rs.getInt("no");
						String age = rs.getString("age");
						String irum = rs.getString("irum");
						String hakbun = rs.getString("hakbun");
						System.out.print(no+"\t"+age+"\t"+irum+"\t"+hakbun+"\n");
					}
					conn.close(); //종료
					stmt.close();
				} //전체출력
				else if(protocol==4) { //검색
					System.out.println("학생검색");
					System.out.println("이름:");
					String irumSearch = input.next();
					System.out.print("번호\t나이\t이름\t학번\n");
					Statement stmt = conn.createStatement(); //공간준비
					String sql = "SELECT NO,AGE,IRUM,HAKBUN FROM STUDENT WHERE irum='"+irumSearch+"'"; //문장준비(쿼리준비)
					ResultSet rs= stmt.executeQuery(sql); //실행
					while(rs.next()) {
						int no = rs.getInt("no");
						String age = rs.getString("age");
						String irum = rs.getString("irum");
						String hakbun = rs.getString("hakbun");
						System.out.print(no+"\t"+age+"\t"+irum+"\t"+hakbun+"\n");
					}
					conn.close(); //종료
					stmt.close();
				} //검색
			} //반복문
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
