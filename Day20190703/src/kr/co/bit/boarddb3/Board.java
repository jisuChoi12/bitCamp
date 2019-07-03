package kr.co.bit.boarddb3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Board {
	protected int cnt;
	protected ResultSet rs;
	protected int no;
	protected int readcount;
	protected int indexI;
	protected String titleContent;
	protected String title;
	protected String content;
	protected String sql;
	protected String author;
	protected String nal;
	protected PreparedStatement pstmt;
	protected static Connection conn;
	protected static BufferedReader br;
	
	static {
		br = new BufferedReader(new InputStreamReader(System.in));
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void titleContentProcess() {
		indexI = titleContent.indexOf("|");
		title = titleContent.substring(0, indexI);
		content = titleContent.substring(indexI+1);		
	}
	
	public void closeAll() {
		try {
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}			
	}
	
	public void showTitles() {
		System.out.print("번호\t제목\t내용\t작성자\t날짜\t\t조회수\n");
	}
	
}
