package kr.co.bit.boarddb3;

import java.io.BufferedReader;
import java.io.IOException;
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
	protected String titleSearch;
	protected PreparedStatement pstmt;
	protected static Connection conn;
	protected static BufferedReader br;
	
	public Board() {
		cnt=0; no=0; readcount=0; indexI=0;
		rs=null; pstmt=null;
		titleContent=null; title=null; content=null; sql=null; author=null; nal=null; titleSearch=null;
	}
	
	static {
		br = new BufferedReader(new InputStreamReader(System.in));
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException{
		conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "bitadmin", "dkdlxl");
		if(conn==null) {
			System.out.println("데이터베이스 연결 실패");
		} else {
			System.out.println("데이터베이스 연결 성공");
		}
		return conn;
	}
	
	public void titleContentProcess() {
		indexI = titleContent.indexOf("|");
		title = titleContent.substring(0, indexI);
		content = titleContent.substring(indexI+1);		
	}
	
	public void setTitleContent() throws IOException {
		System.out.println("제목|내용");
		titleContent = br.readLine();
	}
	
	public void boardTitle() {
		System.out.print("번호\t제목\t내용\t작성자\t날짜\t\t조회수\n");
	}
	
	
	
}
