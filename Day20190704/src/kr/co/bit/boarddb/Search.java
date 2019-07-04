package kr.co.bit.boarddb;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Search extends Board{
	
	public Search() {

	}
	
	public void setTitleSearch() throws IOException {
		System.out.println("====검색====");
		System.out.println("찾는 게시글 제목 입력");
		titleSearch = br.readLine();		
	}
	
	public void boardSqlSearch() {
		sql = "SELECT NO,TITLE,CONTENT,AUTHOR,NAL,READCOUNT FROM BOARD WHERE TITLE=?";		
	}

	public void searchExecuter() throws SQLException {
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, titleSearch);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			no = rs.getInt("no");
			title = rs.getString("title");
			content = rs.getString("content");
			author = rs.getString("author");
			nal = rs.getString("nal");
			readcount = rs.getInt("readcount");
			System.out.print(no+"\t"+title+"\t"+content+"\t"+author+"\t"+nal+"\t"+readcount+"\n");
		}		
	}
	
	public void searchProcess() throws SQLException,IOException {
		setTitleSearch();
		boardTitle();
		boardSqlSearch();
		searchExecuter();
		rs.close();
		closeAll();
	}
}
