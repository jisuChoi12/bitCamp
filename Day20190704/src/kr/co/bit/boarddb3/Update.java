package kr.co.bit.boarddb3;

import java.io.IOException;
import java.sql.SQLException;

public class Update extends Board implements BoardInter{
	
	public Update() {
	}
	
	public void setTitleUpdate() throws IOException {
		System.out.println("====수정====");
		System.out.println("수정할 게시글의 제목 입력");
		titleSearch = br.readLine();		
	}
	
	@Override
	public void boardSql() {
		sql = "SELECT NO,TITLE,CONTENT,AUTHOR,NAL,READCOUNT FROM BOARD WHERE TITLE=?";
	}
	
	public void boardSqlUpdate() {
		sql = "UPDATE BOARD SET TITLE=?,CONTENT=? WHERE TITLE=?";
	}
	
	public void UpdateExecuter() throws SQLException{
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, title);
		pstmt.setString(2, content);
		pstmt.setString(3, titleSearch);	
		cnt = pstmt.executeUpdate();
		System.out.println(cnt+"건의 게시글이 수정되었습니다.");
	}
	
	public void SearchExecuter() throws IOException, SQLException {
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
			System.out.println("해당 게시글이 검색되었습니다.");
			System.out.println("수정 전 내용입니다.");
			boardTitle();
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
		setTitleUpdate();
		SearchExecuter();
		boardSqlUpdate();
		setTitleContent();
		titleContentProcess();
		UpdateExecuter();
		boardClose();
	}
}
	
