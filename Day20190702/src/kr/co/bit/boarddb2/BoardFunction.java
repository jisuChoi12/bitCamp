package kr.co.bit.boarddb2;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//BoardFunction클래스에 instance메소드
public class BoardFunction {
	
	public void register(Connection conn, BufferedReader br) throws SQLException,IOException {
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
	}
	
	public void search(Connection conn, BufferedReader br) throws SQLException,IOException {
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
			int readcount = rs.getInt("readcount");
			System.out.println(no+"\t"+title+"\t"+content+"\t"+author+"\t"+nal+"\t"+readcount+"\n");
		}
		pstmt.close();
		conn.close();	
	}
	
	public void delete(Connection conn, BufferedReader br) throws SQLException,IOException {
		System.out.println("====삭제====");
		System.out.println("삭제할 게시글의 제목 입력");
		String titleDelete = br.readLine();
		String sql = "Delete FROM BOARD WHERE TITLE=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, titleDelete);
		int cnt = pstmt.executeUpdate();
		System.out.println("해당 게시글"+cnt+"건이 삭제되었습니다.");
		pstmt.close();
		conn.close();	
	}

	public void list(Connection conn, BufferedReader br) throws SQLException {
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
			int readcount = rs.getInt("readcount");								
			System.out.print(no+"\t"+title+"\t"+content+"\t"+author+"\t"+nal+"\t"+readcount+"\n");
		}
		pstmt.close();
		conn.close();	
	}
	
	public void update(Connection conn, BufferedReader br) throws SQLException,IOException {
		System.out.println("====수정====");
		System.out.println("수정할 게시글의 제목 입력");
		String titleSearch = br.readLine();
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
			int readcount = rs.getInt("readcount");
			System.out.println("수정 전 내용입니다.");
			System.out.print("번호\t제목\t내용\t작성자\t날짜\t\t조회수\n");
			System.out.print(no+"\t"+title+"\t"+content+"\t"+author+"\t"+nal+"\t"+readcount+"\n");
			System.out.println("해당 게시글이 검색되었습니다.");
				
			System.out.println("수정할 제목|내용 입력");
			String titleContent = br.readLine();
			int indexI = titleContent.indexOf("|");
			String titleUpdate = titleContent.substring(0,indexI);
			String contentUpdate = titleContent.substring(indexI+1);
			sql = "UPDATE BOARD SET TITLE=?,CONTENT=? WHERE TITLE=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, titleUpdate);
			pstmt.setString(2, contentUpdate);
			pstmt.setString(3, titleSearch);	
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"건의 게시글이 수정되었습니다.");
		}
		pstmt.close();
		conn.close();	
	}
}
