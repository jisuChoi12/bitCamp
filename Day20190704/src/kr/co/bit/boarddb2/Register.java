package kr.co.bit.boarddb2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Register extends Board{
	private String nalnal;
	private Calendar calendar;
	private SimpleDateFormat sdf;
	private Date date;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Register(){
		nalnal=null;
	}
	
	public void setNo() throws IOException {
		System.out.println("====등록====");
		System.out.println("게시글 번호 입력");
		no = Integer.parseInt(br.readLine());
	}

	@Override
	public void boardSql() {
		sql = "INSERT INTO BOARD(NO,TITLE,CONTENT,AUTHOR,NAL,READCOUNT) VALUES(?,?,?,?,?,?)"; 
	}
	
	public String setNal() {
		calendar = Calendar.getInstance();
		date = calendar.getTime();
		sdf = new SimpleDateFormat("yyy:MM:dd");
		return sdf.format(date);
	}

	public void boardSqlExecuter() throws SQLException{
		pstmt = conn.prepareStatement(sql); 
		pstmt.setInt(1,no);
		pstmt.setString(2, title);
		pstmt.setString(3, content);
		pstmt.setString(4, "최지수");
		nalnal = setNal();
		pstmt.setString(5, nalnal);
		pstmt.setInt(6, 0);
		cnt = pstmt.executeUpdate(); 
		System.out.println(cnt+"건의 게시글이 등록되었습니다.");
	}
	
	public void boardProcess() throws SQLException,IOException {
		getConnection();
		setNo();
		setTitleContent();
		titleContentProcess();
		boardSqlExecuter();	
		boardClose();
	}

	@Override
	public void boardClose() {
		try {
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
