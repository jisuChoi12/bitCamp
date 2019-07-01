package kr.co.bit.boardDB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardExecute {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

			try {
				Class.forName("oracle.jdbc.driver.OracleDriver"); //로드
				while(true) {//반복문				
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "bitadmin", "dkdlxl"); //연결
					if(conn==null) {
						System.out.println("데이터베이스 연결 실패");
					} else {//데이터베이스 연결
						System.out.println("데이터베이스 연결 성공");
						System.out.println("====게시판작성====");
						System.out.println("R:등록 S:검색 D:삭제 U:수정 L:목록");
						String protocol = br.readLine();
						
						if(protocol.equals("R") || protocol.equals("r")) {//등록
							System.out.println("====등록====");
							System.out.println("게시글 번호 입력");
							int no = Integer.parseInt(br.readLine());
							System.out.println("제목|내용");
							String titleContent = br.readLine();
							int indexI = titleContent.indexOf("|");
							String title = titleContent.substring(0, indexI);
							String content = titleContent.substring(indexI+1);
							String sql = "INSERT INTO BOARD(NO,TITLE,CONTENT,AUTHOR,NAL,READCOUNT) VALUES(?,?,?,?,?,?)"; //준비
							PreparedStatement pstmt = conn.prepareStatement(sql); //준비
							pstmt.setInt(1,no);
							pstmt.setString(2, title);
							pstmt.setString(3, content);
							pstmt.setString(4, "최지수");
							pstmt.setString(5, "20190701");
							pstmt.setInt(6, 0);
							int cnt = pstmt.executeUpdate(); //실행
							System.out.println(cnt+"건의 게시글이 등록되었습니다.");
							pstmt.close();
							conn.close();
						}//등록
						
						else if(protocol.equals("S") || protocol.equals("s")) {//검색
							System.out.println("====검색====");
							System.out.println("찾는 게시글 제목 입력");
							String titleSearch = br.readLine();
							System.out.print("번호\t제목\t내용\t작성자\t날짜\t\t조회수\n");
							String sql = "SELECT NO,TITLE,CONTENT,AUTHOR,NAL,READCOUNT FROM BOARD WHERE TITLE=?";
							PreparedStatement pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, titleSearch);
							ResultSet rs = pstmt.executeQuery();
							while(rs.next()) {
								int no = rs.getInt("no");
								String title = rs.getString("title");
								String content = rs.getString("content");
								String author = rs.getString("author");
								String nal = rs.getString("nal");
								String readcount = rs.getString("readcount");
								System.out.println(no+"\t"+title+"\t"+content+"\t"+author+"\t"+nal+"\t"+readcount+"\n");
							}
							pstmt.close();
							conn.close();
						}//검색
						
						else if(protocol.equals("D") || protocol.equals("d")) {//삭제
							System.out.println("====삭제====");
							System.out.println("삭제할 게시글의 제목 입력");
							String titleDelete = br.readLine();
							String sql = "Delete FROM BOARD WHERE TITLE=?";
							PreparedStatement pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, titleDelete);
							int cnt = pstmt.executeUpdate();
							System.out.println("해당 게시글은 삭제되었습니다.");
							pstmt.close();
							conn.close();
						}//삭제
						
						else if(protocol.equals("U") || protocol.equals("u")) {//수정
//							System.out.println("====수정====");
//							System.out.println("수정할 게시글의 제목 입력");
//							String titleSearch = br.readLine();
//							String sql = "SELECT NO,TITLE,CONTENT,AUTHOR,NAL,READCOUNT FROM BOARD WHERE TITLE=?";
//							PreparedStatement pstmt = conn.prepareStatement(sql);
//							pstmt.setString(1, titleSearch);
//							ResultSet rs = pstmt.executeQuery();
//							while(rs.next()) {
//								int no = rs.getInt("no");
//								String title = rs.getString("title");
//								String content = rs.getString("content");
//								String author = rs.getString("author");
//								String nal = rs.getString("nal");
//								String readcount = rs.getString("readcount");
//								System.out.println("수정 전 내용입니다.");
//								System.out.println(no+"\t"+title+"\t"+content+"\t"+author+"\t"+nal+"\t"+readcount+"\n");
//								System.out.println("해당 게시글이 검색되었습니다.");
//								System.out.println("수정할 제목|내용 입력");
//								String titleContent = br.readLine();
//								int indexI = titleContent.indexOf("|");
//								String titleU = titleContent.substring(0,indexI);
//								String contentU = titleContent.substring(indexI+1);
//								
//							}
							
						}//수정
						
						else if(protocol.equals("L") || protocol.equals("l")) {//전체출력
							System.out.println("====전체출력====");
							System.out.print("번호\t제목\t내용\t작성자\t날짜\t\t조회수\n");
							String sql = "SELECT NO,TITLE,CONTENT,AUTHOR,NAL,READCOUNT FROM BOARD ORDER BY NO ASC";
							PreparedStatement pstmt = conn.prepareStatement(sql);
							ResultSet rs = pstmt.executeQuery();
							while(rs.next()) {
								int no = rs.getInt("no");
								String title = rs.getString("title");
								String content = rs.getString("content");
								String author = rs.getString("author");
								String nal = rs.getString("nal");
								String readcount = rs.getString("readcount");								
								System.out.print(no+"\t"+title+"\t"+content+"\t"+author+"\t"+nal+"\t"+readcount+"\n");
							}
							pstmt.close();
							conn.close();
						}//전체출력
						
					}//데이터베이스 연결
				}//반복문
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		
		
//		try {
//			while(true) {//반복문
//				
//				if(protocol.equals("R") || protocol.equals("r")) {//등록
//					HashMap<String, String> hashMap = new HashMap<String, String>();
//					System.out.println("제목|내용");
//					String titleContent = br.readLine();
//					int indexI = titleContent.indexOf("|");
//					String title = titleContent.substring(0,indexI);
//					String content = titleContent.substring(indexI+1);
//					if(title==null || title=="") {
//						System.out.println("제목을 입력해주세요.");
//					}
//					if(content==null || content=="") {
//						System.out.println("내용을 입력해주세요.");
//					}
//					hashMap.put("title", title);
//					hashMap.put("content", content);
//					hashMap.put("author", "최지수");
//					hashMap.put("nal", "20190701");
//					hashMap.put("readCount", "0");
//					boardList.add(hashMap);
//					System.out.println("게시글이 등록되었습니다.");
//				}//등록
//				else if(protocol.equals("S") || protocol.equals("s")) {//검색
//					HashMap<String, String> hashMap = new HashMap<String, String>();
//					System.out.println("====찾기====");
//					System.out.println("찾는 게시글 제목입력");
//					String titleSearch = br.readLine();
//					System.out.print("제목\t내용\t작성자\t날짜\t\t조회수\n");
//					for(int i=0; i<boardList.size(); i++) {
//						hashMap = boardList.get(i);
//						if(titleSearch.equals(hashMap.get("title"))) {
//							System.out.print(hashMap.get("title")+"\t");
//							System.out.print(hashMap.get("content")+"\t");
//							System.out.print(hashMap.get("author")+"\t");
//							System.out.print(hashMap.get("nal")+"\t");
//							System.out.print(hashMap.get("readCount")+"\n");
//						}
//					}
//				}//검색
//				else if(protocol.equals("D") || protocol.equals("d")) {//삭제
//					HashMap<String, String> hashMap = new HashMap<String, String>();
//					System.out.println("====삭제====");
//					System.out.println("삭제 할 게시글 제목 입력");
//					String titleDelete = br.readLine();
//					for(int i=0; i<boardList.size(); i++) {
//						hashMap = boardList.get(i);
//						if(titleDelete.equals(hashMap.get("title"))) {
//							boardList.remove(i);
//							System.out.println("해당 게시글은 삭제되었습니다.");
//						}
//					}
//				}//삭제
//				else if(protocol.equals("U") || protocol.equals("u")) {//수정
//					HashMap<String, String> hashMap = new HashMap<String, String>();
//					System.out.println("====수정====");
//					System.out.println("수정 할 게시글 제목 입력 ");
//					String titleSearch = br.readLine();
//					for(int i=0; i<boardList.size(); i++) {
//						hashMap = boardList.get(i);
//						if(titleSearch.equals(hashMap.get("title"))) {
//							System.out.println("수정 전 내용 입니다.");
//							System.out.print("제목\t내용\t작성자\t날짜\t\t조회수\n");
//							System.out.print(hashMap.get("title")+"\t");
//							System.out.print(hashMap.get("content")+"\t");
//							System.out.print(hashMap.get("author")+"\t");
//							System.out.print(hashMap.get("nal")+"\t");
//							System.out.print(hashMap.get("readCount")+"\n");
//						}
//						System.out.println("해당 게시글이 검색되었습니다.");
//						System.out.println("수정할 제목|내용 을 입력하세요.");
//						String titleContent = br.readLine();
//						int indexI = titleContent.indexOf("|");
//						String title = titleContent.substring(0,indexI);
//						String content = titleContent.substring(indexI+1);
//						hashMap.put("title", title);
//						hashMap.put("content", content);
//						boardList.set(i, hashMap);
//					}
//					System.out.println("게시글이 수정되었습니다.");
//				}//수정
//				else if(protocol.equals("L") || protocol.equals("l")) {//목록
//					HashMap<String, String> hashMap = new HashMap<String, String>();
//					System.out.println("====전체출력====");
//					System.out.print("제목\t내용\t작성자\t날짜\t\t조회수\n");
//					for(int i=0; i<boardList.size(); i++) {
//						hashMap = boardList.get(i);
//						System.out.print(hashMap.get("title")+"\t");
//						System.out.print(hashMap.get("content")+"\t");
//						System.out.print(hashMap.get("author")+"\t");
//						System.out.print(hashMap.get("nal")+"\t");
//						System.out.print(hashMap.get("readCount")+"\n");
//					}
//				}//목록
//			}//반복문
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
