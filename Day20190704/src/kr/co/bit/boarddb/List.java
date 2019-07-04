package kr.co.bit.boarddb;

import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class List extends Board{

	public List() {
	}
	
	public void boardSqlList() {
		sql = "SELECT NO,TITLE,CONTENT,AUTHOR,NAL,READCOUNT FROM BOARD ORDER BY NO ASC";		
	}
	
	public void boardSqlExecuter() throws SQLException{
		pstmt = conn.prepareStatement(sql);
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
	
	public void listProcess() throws SQLException {
		System.out.println("====전체출력====");
		boardTitle();
		boardSqlList();
		boardSqlExecuter();
		rs.close();
		closeAll();
	}
}
