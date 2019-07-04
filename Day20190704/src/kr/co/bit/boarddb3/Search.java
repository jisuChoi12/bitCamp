package kr.co.bit.boarddb3;

import java.io.IOException;
import java.sql.SQLException;

public class Search extends Board implements BoardInter{
	
	public Search() {

	}
	
	public void setTitleSearch() throws IOException {
		System.out.println("====검색====");
		System.out.println("찾는 게시글 제목 입력");
		titleSearch = br.readLine();		
	}
	
	@Override
	public void boardSql() {
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
	
	@Override
	public void boardClose() {
		try {
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void boardProcess() throws SQLException, IOException {
		setTitleSearch();
		boardTitle();
		searchExecuter();
		boardClose();
	}
}
