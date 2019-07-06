package kr.co.bit.haksa1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.StringTokenizer;

public class Haksa {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Connection conn = null;
//		String age;
//		String irum;
//		String hakbun;
//		String subject;
//		String part;
//		String sql;
//		PreparedStatement pstmt = null;
//		int no;

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
							int no = Integer.parseInt(br.readLine());
							System.out.println("이름");
							String irum = br.readLine();
							System.out.println("나이");
							String age = br.readLine();
							System.out.println("학번");
							String hakbun = br.readLine();
							String sql = "INSERT INTO HAKSASTD(NO,IRUM,AGE,HAKBUN) VALUES(?,?,?,?)"; // 문장준비
							PreparedStatement pstmt = conn.prepareStatement(sql); // 쿼리준비
							pstmt.setInt(1, no);
							pstmt.setString(2, irum);
							pstmt.setString(3, age);
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
							int no = Integer.parseInt(br.readLine());
							System.out.println("이름");
							String irum = br.readLine();
							System.out.println("나이");
							String age = br.readLine();
							System.out.println("과목");
							String subject = br.readLine();
							String sql = "INSERT INTO HAKSAPROF(NO,IRUM,AGE,SUBJECT) VALUES(?,?,?,?) ";
							PreparedStatement pstmt = conn.prepareStatement(sql);
							pstmt.setInt(1, no);
							pstmt.setString(2, irum);
							pstmt.setString(3, age);
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
							int no = Integer.parseInt(br.readLine());
							System.out.println("이름");
							String irum = br.readLine();
							System.out.println("나이");
							String age = br.readLine();
							System.out.println("부서");
							String part = br.readLine();
							String sql = "INSERT INTO HAKSAMNG(NO,IRUM,AGE,PART) VALUES(?,?,?,?) ";
							PreparedStatement pstmt = conn.prepareStatement(sql);
							pstmt.setInt(1, no);
							pstmt.setString(2, irum);
							pstmt.setString(3, age);
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
							System.out.println("번호\t이름\t나이\t학번");
							String sql = "SELECT NO,IRUM,AGE,HAKBUN FROM HAKSASTD WHERE IRUM=?";
							PreparedStatement pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, irumSearch);
							ResultSet rs = pstmt.executeQuery();
							while(rs.next()) {
								int no = rs.getInt("no");
								String irum = rs.getString("irum");
								String age = rs.getString("age");
								String hakbun = rs.getString("hakbun");
								System.out.print(no+"\t"+irum+"\t"+age+"\t"+hakbun+"\n");
							}
						}
						else if(protocol==2) {
							System.out.println("=====교수찾기=====");
							System.out.println("찾을 이름을 입력하세요");
							String irumSearch = br.readLine();
							System.out.println("번호\t이름\t나이\t과목");
							String sql = "SELECT NO,IRUM,AGE,SUBJECT FROM HAKSAPROF WHERE IRUM=?";
							PreparedStatement pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, irumSearch);
							ResultSet rs = pstmt.executeQuery();
							while(rs.next()) {
								int no = rs.getInt("no");
								String irum = rs.getString("irum");
								String age = rs.getString("age");
								String subject = rs.getString("subject");
								System.out.print(no+"\t"+irum+"\t"+age+"\t"+subject+"\n");
							}
						}
						else if(protocol==3) {
							System.out.println("=====관리자찾기=====");
							System.out.println("찾을 이름을 입력하세요");
							String irumSearch = br.readLine();
							System.out.println("번호\t이름\t나이\t부서");
							String sql = "SELECT NO,IRUM,AGE,PART FROM HAKSAMNG WHERE IRUM=?";
							PreparedStatement pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, irumSearch);
							ResultSet rs = pstmt.executeQuery();
							while(rs.next()) {
								int no = rs.getInt("no");
								String irum = rs.getString("irum");
								String age = rs.getString("age");
								String part = rs.getString("part");
								System.out.print(no+"\t"+irum+"\t"+age+"\t"+part+"\n");
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
							String sql = "DELETE FROM HAKSASTD WHERE IRUM=?";
							PreparedStatement pstmt = conn.prepareStatement(sql);
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
							String sql = "DELETE FROM HAKSAPROF WHERE IRUM=?";
							PreparedStatement pstmt = conn.prepareStatement(sql);
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
							String sql = "DELETE FROM HAKSAMNG WHERE IRUM=?";
							PreparedStatement pstmt = conn.prepareStatement(sql);
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
							String irumSearch = br.readLine();
							System.out.println("현재 등록된 정보");
							System.out.println("번호\t이름\t나이\t학번");
							String sql = "SELECT NO,IRUM,AGE,HAKBUN FROM HAKSASTD WHERE IRUM=?";
							PreparedStatement pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, irumSearch);
							ResultSet rs = pstmt.executeQuery();
							while(rs.next()) {
								int no = rs.getInt("no");
								String irum = rs.getString("irum");
								String age = rs.getString("age");
								String hakbun = rs.getString("hakbun");
								System.out.print(no+"\t"+irum+"\t"+age+"\t"+hakbun+"\n");
							}
							System.out.println("");
							System.out.println("정보를 수정하세요");
							System.out.println("번호|이름|나이|학번");
							String updateInfo = br.readLine();
							StringTokenizer stoken = new StringTokenizer(updateInfo,"|");
							while(stoken.hasMoreTokens()) {
								int noU = Integer.parseInt(stoken.nextToken());
								String irumU = stoken.nextToken();
								String ageU = stoken.nextToken();
								String hakbunU = stoken.nextToken();
								
								sql = "UPDATE HAKSASTD SET NO=?,IRUM=?,AGE=?,HAKBUN=? WHERE IRUM=?";
								pstmt = conn.prepareStatement(sql);
								pstmt.setInt(1, noU);
								pstmt.setString(2, irumU);
								pstmt.setString(3, ageU);
								pstmt.setString(4, hakbunU);
								pstmt.setString(5, irumSearch);
								int cnt = pstmt.executeUpdate();
								if(cnt==0) {
									System.out.println("수정에 실패했습니다");
								}else {
									System.out.println(cnt+"건 수정완료");
								}
							}
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
							String sql = "SELECT NO,IRUM,AGE,HAKBUN FROM HAKSASTD"; //문장준비
							PreparedStatement pstmt = conn.prepareStatement(sql);
							ResultSet rs = pstmt.executeQuery();
							System.out.println("번호\t이름\t나이\t학번");
							while(rs.next()) {
								int no = rs.getInt("no");
								String irum = rs.getString("irum");
								String age = rs.getString("age");
								String hakbun = rs.getString("hakbun");
								System.out.print(no+"\t"+irum+"\t"+age+"\t"+hakbun+"\n");
							}
						}
						else if(protocol==2) {
							System.out.println("=====교수전체출력=====");
							String sql = "SELECT NO,IRUM,AGE,SUBJECT FROM HAKSAPROF"; //문장준비
							PreparedStatement pstmt = conn.prepareStatement(sql);
							ResultSet rs = pstmt.executeQuery();
							System.out.println("번호\t이름\t나이\t과목");
							while(rs.next()) {
								int no = rs.getInt("no");
								String irum = rs.getString("irum");
								String age = rs.getString("age");
								String subject = rs.getString("subject");
								System.out.print(no+"\t"+irum+"\t"+age+"\t"+subject+"\n");
							}
						}
						else if(protocol==3) {
							System.out.println("=====관리자전체출력=====");
							System.out.println("번호\t이름\t나이\t부서");
							String sql = "SELECT NO,IRUM,AGE,PART FROM HAKSAMNG";
							PreparedStatement pstmt = conn.prepareStatement(sql);
							ResultSet rs = pstmt.executeQuery();
							while(rs.next()) {
								int no = rs.getInt("no");
								String irum = rs.getString("irum");
								String age = rs.getString("age");
								String part = rs.getString("part");
								System.out.print(no+"\t"+irum+"\t"+age+"\t"+part+"\n");
							}
						}
						else if(protocol==4) {
							System.out.println("=====모두출력=====");
							System.out.println("번호\t학생이름\t학생나이\t학번\t교수이름\t교수나이\t과목\t관리자이름\t관리자나이\t부서");
							String sql = "SELECT S.NO AS 번호,S.IRUM AS 학생이름,S.AGE AS 학생나이,S.HAKBUN AS 학번,P.IRUM AS 교수이름,P.AGE AS 교수나이,P.SUBJECT AS 과목,M.IRUM AS 관리자이름,M.AGE AS 관리자나이,M.PART AS 부서 FROM (HAKSASTD S LEFT JOIN HAKSAPROF P ON S.NO=P.NO) LEFT JOIN HAKSAMNG M ON S.NO=M.NO ORDER BY 번호 ASC";
							PreparedStatement pstmt = conn.prepareStatement(sql);
							ResultSet rs = pstmt.executeQuery();
							while(rs.next()) {
								int no = rs.getInt("번호");
								String std_irum = rs.getString("학생이름");
								String std_age = rs.getString("학생나이");
								String hakbun = rs.getString("학번");
								String prof_irum = rs.getString("교수이름");
								String prof_age = rs.getString("교수나이");
								String subject = rs.getString("과목");
								String mng_irum= rs.getString("관리자이름");
								String mng_age = rs.getString("관리자나이");
								String part = rs.getString("부서");
								System.out.print(no+"\t"+std_irum+"\t"+std_age+"\t"+hakbun+"\t"+prof_irum+"\t"+prof_age+"\t"+subject+"\t"+mng_irum+"\t"+mng_age+"\t"+part+"\n");
							}
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
