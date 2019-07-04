package kr.co.bit.haksaFull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Haksa {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Connection conn = null;
		String age;
		String irum;
		String hakbun;
		String subject;
		String part;
		String sql;
		PreparedStatement pstmt = null;
		int no;

		while (true) {
			try {
				Class.forName("oracle.jdbc.OracleDriver"); // 로드
				conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "bitadmin", "dkdlxl"); // 연결
				if (conn != null) {
					System.out.println("데이터베이스 연결 성공");
					System.out.println("=====메뉴=====");
					System.out.println("1.등록 2.찾기 3.삭제 4.수정 5.전체출력 0.종료");
					int protocol = Integer.parseInt(br.readLine());
					if (protocol == 1) {// 등록
						System.out.println("=====등록=====");
						System.out.println("1.학생 2.교수 3.관리자");
						protocol = Integer.parseInt(br.readLine());
						if (protocol == 1) {// 학생
							System.out.println("번호");
							no = Integer.parseInt(br.readLine());
							System.out.println("나이");
							age = br.readLine();
							System.out.println("이름");
							irum = br.readLine();
							System.out.println("학번");
							hakbun = br.readLine();
							sql = "INSERT INTO HAKSASTD(NO,AGE,IRUM,HAKBUN) VALUES(?,?,?,?)"; // 문장준비
							pstmt = conn.prepareStatement(sql); // 쿼리준비
							pstmt.setInt(1, no);
							pstmt.setString(2, age);
							pstmt.setString(3, irum);
							pstmt.setString(4, hakbun);
							int cnt = pstmt.executeUpdate(); // 실행
							if (cnt == 0) {
								System.out.println("등록에 실패했습니다.");
							} else {
								System.out.println(cnt + "건 등록 완료");
								pstmt.close();
								conn.close();
							}
						} // 학생
						else if (protocol == 2) {// 교수
							System.out.println("번호");
							no = Integer.parseInt(br.readLine());
							System.out.println("나이");
							age = br.readLine();
							System.out.println("이름");
							irum = br.readLine();
							System.out.println("과목");
							subject = br.readLine();
							sql = "INSERT INTO HAKSAPROF(NO,AGE,IRUM,SUBJECT) VALUES(?,?,?,?) ";
							pstmt = conn.prepareStatement(sql);
							pstmt.setInt(1, no);
							pstmt.setString(2, age);
							pstmt.setString(3, irum);
							pstmt.setString(4, subject);
							int cnt = pstmt.executeUpdate();
							if (cnt == 0) {
								System.out.println("등록에 실패했습니다.");
							} else {
								System.out.println(cnt + "건 등록 완료");
								pstmt.close();
								conn.close();
							}
						} // 교수
						else if (protocol == 3) {// 관리자
							System.out.println("번호");
							no = Integer.parseInt(br.readLine());
							System.out.println("나이");
							age = br.readLine();
							System.out.println("이름");
							irum = br.readLine();
							System.out.println("부서");
							part = br.readLine();
							sql = "INSERT INTO HAKSAMNG(NO,AGE,IRUM,PART) VALUES(?,?,?,?) ";
							pstmt = conn.prepareStatement(sql);
							pstmt.setInt(1, no);
							pstmt.setString(2, age);
							pstmt.setString(3, irum);
							pstmt.setString(4, part);
							int cnt = pstmt.executeUpdate();
							if (cnt == 0) {
								System.out.println("등록에 실패했습니다.");
							} else {
								System.out.println(cnt + "건 등록 완료");
								pstmt.close();
								conn.close();
							}
						} // 관리자
					} // 등록
					else if (protocol == 2) {// 찾기
						System.out.println("=====찾기=====");
						System.out.println("1.학생 2.교수 3.관리자");
						protocol = Integer.parseInt(br.readLine());
						if(protocol==1) {
							System.out.println("=====학생찾기=====");
							System.out.println("찾을 이름을 입력하세요");
							String irumSearch = br.readLine();
							System.out.println("번호\t나이\t이름\t학번");
							sql = "SELECT NO,AGE,IRUM,HAKBUN FROM HAKSASTD WHERE IRUM=?";
							pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, irumSearch);
							ResultSet rs = pstmt.executeQuery();
							while(rs.next()) {
								no = rs.getInt("no");
								age = rs.getString("age");
								irum = rs.getString("irum");
								hakbun = rs.getString("hakbun");
								System.out.print(no+"\t"+age+"\t"+irum+"\t"+hakbun+"\n");
							}
						}
						else if(protocol==2) {
							System.out.println("=====교수찾기=====");
							System.out.println("찾을 이름을 입력하세요");
							String irumSearch = br.readLine();
							System.out.println("번호\t나이\t이름\t과목");
							sql = "SELECT NO,AGE,IRUM,SUBJECT FROM HAKSAPROF WHERE IRUM=?";
							pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, irumSearch);
							ResultSet rs = pstmt.executeQuery();
							while(rs.next()) {
								no = rs.getInt("no");
								age = rs.getString("age");
								irum = rs.getString("irum");
								subject = rs.getString("subject");
								System.out.print(no+"\t"+age+"\t"+irum+"\t"+subject+"\n");
							}
						}
						else if(protocol==3) {
							System.out.println("=====관리자찾기=====");
							System.out.println("찾을 이름을 입력하세요");
							String irumSearch = br.readLine();
							System.out.println("번호\t나이\t이름\t부서");
							sql = "SELECT NO,AGE,IRUM,PART FROM HAKSAMNG WHERE IRUM=?";
							pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, irumSearch);
							ResultSet rs = pstmt.executeQuery();
							while(rs.next()) {
								no = rs.getInt("no");
								age = rs.getString("age");
								irum = rs.getString("irum");
								part = rs.getString("part");
								System.out.print(no+"\t"+age+"\t"+irum+"\t"+part+"\n");
							}
						}
					} // 찾기
					else if (protocol == 3) {// 삭제
						System.out.println("=====삭제=====");
						System.out.println("1.학생 2.교수 3.관리자");
						protocol = Integer.parseInt(br.readLine());
						if(protocol==1) {
							System.out.println("=====학생삭제=====");
							System.out.println("삭제할 이름을 입력하세요");
							String irumDelete = br.readLine();
							sql = "DELETE FROM HAKSASTD WHERE IRUM=?";
							pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, irumDelete);
							int cnt = pstmt.executeUpdate();
							if(cnt==0) {
								System.out.println("삭제에 실패했습니다");
							}else {
								System.out.println(cnt+"건 삭제 완료");
							}
						}
						else if(protocol==2) {
							System.out.println("=====교수삭제=====");
							System.out.println("삭제할 이름을 입력하세요");
							String irumDelete = br.readLine();
							sql = "DELETE FROM HAKSAPROF WHERE IRUM=?";
							pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, irumDelete);
							int cnt = pstmt.executeUpdate();
							if(cnt==0) {
								System.out.println("삭제에 실패했습니다");
							}else {
								System.out.println(cnt+"건 삭제 완료");
							}
						}
						else if(protocol==3) {
							System.out.println("=====관리자삭제=====");	
							System.out.println("삭제할 이름을 입력하세요");
							String irumDelete = br.readLine();
							sql = "DELETE FROM HAKSAMNG WHERE IRUM=?";
							pstmt = conn.prepareStatement(sql);
							pstmt.setString(1,irumDelete);
							int cnt = pstmt.executeUpdate();
							if(cnt==0) {
								System.out.println("삭제에 실패했습니다");
							}else {
								System.out.println(cnt+"건 삭제 완료");
							}
						}
					} // 삭제
					else if (protocol == 4) {// 수정
						System.out.println("=====수정=====");
						System.out.println("1.학생 2.교수 3.관리자");
						protocol = Integer.parseInt(br.readLine());
						if(protocol==1) {
							System.out.println("=====학생수정=====");
							System.out.println("수정할 이름을 입력하세요");
							String irumUpdate = br.readLine();
							System.out.println("현재 등록된 정보");
							sql = "SELECT NO,AGE,IRUM,HAKBUN FROM HAKSASTD WHERE IRUM=?";
							pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, irumUpdate);
							ResultSet rs = pstmt.executeQuery();
							while(rs.next()) {
								no = rs.getInt("no");
								age = rs.getString("age");
								irum = rs.getString("irum");
								hakbun = rs.getString("hakbun");
								System.out.print(no+"\t"+age+"\t"+irum+"\t"+hakbun+"\n");
							}
							System.out.println("");
						}
						else if(protocol==2) {
							System.out.println("=====교수수정=====");
							System.out.println("수정할 이름을 입력하세요");
							String irumUpdate = br.readLine();
						}
						else if(protocol==3) {
							System.out.println("=====관리자수정=====");
							System.out.println("수정할 이름을 입력하세요");
							String irumUpdate = br.readLine();
						}
					} // 수정
					else if (protocol == 5) {// 전체출력
						System.out.println("=====전체출력=====");
						System.out.println("1.학생 2.교수 3.관리자 4.모두출력");
						protocol = Integer.parseInt(br.readLine());
						if(protocol==1) {
							System.out.println("=====학생전체출력=====");
							sql = "SELECT NO,AGE,IRUM,HAKBUN FROM HAKSASTD"; //문장준비
							pstmt = conn.prepareStatement(sql);
							ResultSet rs = pstmt.executeQuery();
							System.out.println("번호\t나이\t이름\t학번");
							while(rs.next()) {
								no = rs.getInt("no");
								age = rs.getString("age");
								irum = rs.getString("irum");
								hakbun = rs.getString("hakbun");
								System.out.print(no+"\t"+age+"\t"+irum+"\t"+hakbun+"\n");
							}
						}
						else if(protocol==2) {
							System.out.println("=====교수전체출력=====");
							sql = "SELECT NO,AGE,IRUM,SUBJECT FROM HAKSAPROF"; //문장준비
							pstmt = conn.prepareStatement(sql);
							ResultSet rs = pstmt.executeQuery();
							System.out.println("번호\t나이\t이름\t과목");
							while(rs.next()) {
								no = rs.getInt("no");
								age = rs.getString("age");
								irum = rs.getString("irum");
								subject = rs.getString("subject");
								System.out.print(no+"\t"+age+"\t"+irum+"\t"+subject+"\n");
							}
						}
						else if(protocol==3) {
							System.out.println("=====관리자전체출력=====");
							System.out.println("번호\t나이\t이름\t부서");
							sql = "SELECT NO,AGE,IRUM,PART FROM HAKSAMNG";
							pstmt = conn.prepareStatement(sql);
							ResultSet rs = pstmt.executeQuery();
							while(rs.next()) {
								no = rs.getInt("no");
								age = rs.getString("age");
								irum = rs.getString("irum");
								part = rs.getString("part");
								System.out.print(no+"\t"+age+"\t"+irum+"\t"+part+"\n");
							}
						}
						else if(protocol==4) {
							System.out.println("=====모두출력=====");
							System.out.println("번호\t학생나이\t학생이름\t학번\t교수나이\t교수이름\t과목\t관리자나이\t관리자이름\t부서");
							sql = "";
						}
					} // 전체출력
					else if(protocol == 0) {// 종료
						System.out.println("=====종료=====");
						
					} // 종료
					else {
						System.out.println("메뉴에서 골라주세요...");
					}
				} else {
					System.out.println("데이터베이스 연결 실패");
				}
			}

			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
