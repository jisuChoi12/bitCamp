package kr.co.bit.boarddb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardExecute {
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Register register = new Register();
		Delete delete = new Delete();
		Update update = new Update();
		Search search = new Search();
		List list = new List();
		while(true) {//반복문
			Connection conn = null; 
			try {
				conn = Board.getConnection(); 
				System.out.println("====게시판작성===="); 
				System.out.println("R:등록 S:검색 D:삭제 U:수정 L:목록"); 
				String protocol = br.readLine(); 
								
				if(protocol.equals("R") || protocol.equals("r")) {//등록
					register.registerProcess();	
				}//등록
				
				else if(protocol.equals("S") || protocol.equals("s")) {//검색
					search.searchProcess();
				}//검색
				
				else if(protocol.equals("D") || protocol.equals("d")) {//삭제
					delete.deleteProcess();
				}//삭제
				
				else if(protocol.equals("U") || protocol.equals("u")) {//수정
					update.updateProcess();
				}//수정
				
				else if(protocol.equals("L") || protocol.equals("l")) {//전체출력
					list.listProcess();
				}//전체출력
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//반복문
	}
}
