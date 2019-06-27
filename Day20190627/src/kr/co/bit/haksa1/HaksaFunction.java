package kr.co.bit.haksa1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HaksaFunction {
	public static void register(Scanner input,Connection conn) {//등록
		System.out.println("========등록=========");
		System.out.println("1.학생");
		System.out.println("2.교수");
		System.out.println("3.관리자");
		System.out.println("4.이전메뉴");
		System.out.println("====================");
		System.out.println("번호를 선택해 주세요");
		int select = input.nextInt();
		if(select==1) {//학생
			System.out.println("번호:");
			int no = input.nextInt();
			System.out.println("나이:");
			String age = input.next();
			System.out.println("이름:");
			String irum = input.next();
			System.out.println("학번:");
			String hakbun = input.next();
			try {
				Statement stmt = conn.createStatement(); //공간준비
				String sql = "INSERT INTO STUDENT (NO,AGE,IRUM,HAKBUN) VALUES ("+no+",'"+age+"','"+irum+"','"+hakbun+"')"; //문장준비
				int cnt = stmt.executeUpdate(sql); //실행
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
		else if(select==2) {//교수등록
			System.out.println("번호:");
			int no = input.nextInt();
			System.out.println("나이:");
			String age = input.next();
			System.out.println("이름:");
			String irum = input.next();
			System.out.println("과목:");
			String subject = input.next();
			try {
				Statement stmt = conn.createStatement();
				String sql = "INSERT INTO PROFESSOR (NO,AGE,IRUM,SUBJECT) VALUES ("+no+",'"+age+"','"+irum+"','"+subject+"')";
				int cnt = stmt.executeUpdate(sql);
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
		else if(select==3) {//관리자 등록
			System.out.println("번호:");
			int no = input.nextInt();
			System.out.println("나이:");
			String age = input.next();
			System.out.println("이름:");
			String irum = input.next();
			System.out.println("부서:");
			String part = input.next();
			try {
				Statement stmt = conn.createStatement();
				String sql = "INSERT INTO MANAGER (NO,AGE,IRUM,PART) VALUES ("+no+",'"+age+"','"+irum+"','"+part+"')";
				int cnt = stmt.executeUpdate(sql);
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
	public static void search(Scanner input,Connection conn) {//찾기
		System.out.println("========찾기=========");
		System.out.println("1.학생찾기 2.교수찾기 3.관리자찾기");
		int select = input.nextInt();
		System.out.println("이름:");
		String irumSearch = input.next();
		if(select==1) {//학생찾기
			try {
				System.out.print("번호\t나이\t이름\t학번\n");
				Statement stmt = conn.createStatement();
				String sql = "SELECT NO,AGE,IRUM,HAKBUN FROM STUDENT WHERE irum='"+irumSearch+"'";
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()) {
					int no = rs.getInt("no");
					String age = rs.getString("age");
					String irum = rs.getString("irum");
					String hakbun = rs.getString("hakbun");
					System.out.println(no+"\t"+age+"\t"+irum+"\t"+hakbun+"\n");
				}
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//학생찾기
		else if(select==2) {//교수찾기
			try {
				Statement stmt = conn.createStatement();
				String sql = "SELECT NO,AGE,IRUM,SUJECT FROM PROFESSOR WHERE IRUM='"+irumSearch+"'";
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()) {
					int no = rs.getInt("no");
					String age = rs.getString("age");
					String irum = rs.getString("irum");
					String subject = rs.getString("subject");
					System.out.println(no+"\t"+age+"\t"+irum+"\t"+subject+"\n");
				}
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//교수찾기
		else if(select==3) {//관리자찾기
			try {
				Statement stmt = conn.createStatement();
				String sql = "SELECT NO,AGE,IRUM,PART FROM MANAGER WHERE IRUM='"+irumSearch+"'";
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()) {
					int no = rs.getInt("no");
					String age = rs.getString("age");
					String irum = rs.getString("irum");
					String part = rs.getString("part");
					System.out.println(no+"\t"+age+"\t"+irum+"\t"+part+"\n");
			
				}
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//관리자찾기
	}//찾기
	public static void delete(Scanner input,Connection conn) {//삭제
		System.out.println("========삭제=========");
		System.out.println("1.학생삭제 2.교수삭제 3.관리자삭제");
		int select = input.nextInt();
		System.out.println("이름");
		String irumDelete = input.next();
		if(select==1) {//학생삭제
			try {
				Statement stmt = conn.createStatement();
				String sql = "DELETE FROM STUDENT WHERE IRUM='"+irumDelete+"'";
				int cnt = stmt.executeUpdate(sql);
				if(cnt==0) {
					System.out.println("삭제실패");
				}else {
					System.out.println(cnt+ "건 삭제 완료");
					stmt.close();
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//학생삭제
		else if(select==2) {//교수삭제
			try {
				Statement stmt = conn.createStatement();
				String sql = "DELETE FROM PROFESSOR WHERE IRUM='"+irumDelete+"'";
				int cnt = stmt.executeUpdate(sql);
				if(cnt==0) {
					System.out.println("삭제실패");
				}else {
					System.out.println(cnt+ "건 삭제 완료");
					stmt.close();
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//교수삭제
		else if(select==3) {//관리자삭제
			try {
				Statement stmt = conn.createStatement();
				String sql = "DELETE FROM MANAGER WHERE IRUM='"+irumDelete+"'";
				int cnt = stmt.executeUpdate(sql);
				if(cnt==0) {
					System.out.println("삭제실패");
				}else {
					System.out.println(cnt+ "건 삭제 완료");
					stmt.close();
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//관리자삭제
	}//찾기
	public static void list(Scanner input,Connection conn) {//전체출력
		System.out.println("========전체출력=========");
		System.out.println("1.학생전체출력 2.교수전체출력 3.관리자전체출력");
		int select = input.nextInt();
		if(select==1) {
			try {//학생전체출력
				System.out.print("번호\t나이\t이름\t학번\n");
				Statement stmt = conn.createStatement(); //공간준비
				String sql = "SELECT NO,AGE,IRUM,HAKBUN FROM STUDENT ORDER BY NO ASC"; //문장준비
				ResultSet rs = stmt.executeQuery(sql); //실행
				while(rs.next()) {
					int no = rs.getInt("no");
					String age = rs.getString("age");
					String irum = rs.getString("irum");
					String hakbun = rs.getString("hakbun");
					System.out.print(no+"\t"+age+"\t"+irum+"\t"+hakbun+"\n");
				}
				stmt.close();
				conn.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
		}//학생전체출력
		if(select==2) {//교수전체출력
			try {
					System.out.print("번호\t나이\t이름\t과목\n");
					Statement stmt = conn.createStatement(); //공간준비
					String sql = "SELECT NO,AGE,IRUM,SUBJECT FROM PROFESSOR ORDER BY NO ASC"; //문장준비
					ResultSet rs = stmt.executeQuery(sql); //실행
					while(rs.next()) {
						int no = rs.getInt("no");
						String age = rs.getString("age");
						String irum = rs.getString("irum");
						String subject = rs.getString("subject");
						System.out.print(no+"\t"+age+"\t"+irum+"\t"+subject+"\n");
					}
					stmt.close();
					conn.close();
				} catch (SQLException e) {
				e.printStackTrace();
				}
		}//교수전체출력
		else if(select==3) {//관리자전체출력
			try {
					Statement stmt = conn.createStatement(); //공간준비
					String sql = "SELECT NO,AGE,IRUM,PART FROM MANAGER ORDER BY NO ASC"; //문장준비
					ResultSet rs = stmt.executeQuery(sql); //실행
					System.out.print("번호\t나이\t이름\t부서\n");
					while(rs.next()) {
						int no = rs.getInt("no");
						String age = rs.getString("age");
						String irum = rs.getString("irum");
						String part = rs.getString("part");
						System.out.print(no+"\t"+age+"\t"+irum+"\t"+part+"\n");
					}
					stmt.close();
					conn.close();
				} catch (SQLException e) {
				e.printStackTrace();
				}
		}//관리자전체출력
	}//전체출력
}
