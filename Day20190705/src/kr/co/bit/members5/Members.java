package kr.co.bit.members5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Members {
	protected static BufferedReader br;
	protected static Connection conn;
	protected ResultSet rs;
	protected PreparedStatement pstmt;
	protected int cnt;
	protected String id;
	protected String psw;
	protected String adr;
	protected String phone;
	protected String sql;
	
	public Members() {
		pstmt=null; rs=null; id=null; psw=null; adr=null; phone=null;
		cnt=0;
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
}
