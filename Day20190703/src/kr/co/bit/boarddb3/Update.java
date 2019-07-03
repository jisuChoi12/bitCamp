package kr.co.bit.boarddb3;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Update extends Board{
	private String titleSearch;
	private String titleUpdate;
	private String contentUpdate;
	
	public Update() {
		titleSearch=null; titleUpdate=null; contentUpdate=null; 
	}
	
	public void setTitleSearch() throws IOException {
		System.out.println("====����====");
		System.out.println("������ �Խñ��� ���� �Է�");
		titleSearch = br.readLine();		
	}
	
	public void boardSqlSearch() {
		sql = "SELECT NO,TITLE,CONTENT,AUTHOR,NAL,READCOUNT FROM BOARD WHERE TITLE=?";
	}
	
	public void setTitleContent() throws IOException {
		System.out.println("������ ����|���� �Է�");
		titleContent = br.readLine();
	}
	
	public void boardSqlUpdate() {
		sql = "UPDATE BOARD SET TITLE=?,CONTENT=? WHERE TITLE=?";
	}
	
	public void UpdateExecuter() throws SQLException{
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, titleUpdate);
		pstmt.setString(2, contentUpdate);
		pstmt.setString(3, titleSearch);	
		cnt = pstmt.executeUpdate();
		System.out.println(cnt+"���� �Խñ��� �����Ǿ����ϴ�.");
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
			System.out.println("���� �� �����Դϴ�.");
			showTitles();
			System.out.print(no+"\t"+title+"\t"+content+"\t"+author+"\t"+nal+"\t"+readcount+"\n");
			System.out.println("�ش� �Խñ��� �˻��Ǿ����ϴ�.");
				
			setTitleContent();
			titleContentProcess();
			boardSqlUpdate();
			UpdateExecuter();
		}
	}

	public void updateProcess() throws SQLException,IOException {
		setTitleSearch();
		boardSqlSearch();
		SearchExecuter();
		closeAll();
	}
}
	
