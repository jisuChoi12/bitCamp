package kr.co.bit.boarddb2;

import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class List {
	private int no;
	private int readcount;
	private String sql;
	private String title;
	private String content;
	private String author;
	private String nal;
	private ResultSet rs;
	private PreparedStatement pstmt;
	
	public List() {
		no=0; readcount=0;
		sql=null; rs=null; pstmt=null; title=null; content=null; author=null; nal=null; 
	}
	
	public void boardSqlList() {
		sql = "SELECT NO,TITLE,CONTENT,AUTHOR,NAL,READCOUNT FROM BOARD ORDER BY NO ASC";		
	}
	
	public void boardSqlExecuter() throws SQLException{
		pstmt = Register.conn.prepareStatement(sql);
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
		System.out.println("====��ü���====");
		System.out.print("��ȣ\t����\t����\t�ۼ���\t��¥\t\t��ȸ��\n");
		boardSqlList();
		boardSqlExecuter();
		pstmt.close();
		Register.conn.close();	
	}

}
