package kr.co.bit.boarddb1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.proxy.annotation.Pre;

public class BoardExecute {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver"); //로드
				while(true) {//반복문				
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "bitadmin", "dkdlxl"); //연결
					if(conn==null) {
						System.out.println("데이터베이스 연결 실패");
					} else {//데이터베이스 연결
						System.out.println("데이터베이스 연결 성공");
						System.out.println("====게시판작성====");
						System.out.println("R:등록 S:검색 D:삭제 U:수정 L:목록");
						String protocol = br.readLine();
						
						if(protocol.equals("R") || protocol.equals("r")) {//등록
							BoardFunction.register(conn, br);	
						}//등록
						
						else if(protocol.equals("S") || protocol.equals("s")) {//검색
							BoardFunction.search(conn, br);
						}//검색
						
						else if(protocol.equals("D") || protocol.equals("d")) {//삭제
							BoardFunction.delete(conn, br);
						}//삭제
						
						else if(protocol.equals("U") || protocol.equals("u")) {//수정
							BoardFunction.update(conn, br);
						}//수정
						
						else if(protocol.equals("L") || protocol.equals("l")) {//전체출력
							BoardFunction.list(conn);
						}//전체출력
					}//데이터베이스 연결
				}//반복문
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
