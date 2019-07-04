package kr.co.bit.boarddb3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;

public class BoardExecute {
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Register register = new Register();
		Delete delete = new Delete();
		Update update = new Update();
		Search search = new Search();
		List list = new List();
		BoardPoly boardPoly = new BoardPoly();
		
		while(true) {//반복문
			try {
				Board.getConnection(); 
				
				System.out.println("====게시판작성===="); 
				System.out.println("R:등록 S:검색 D:삭제 U:수정 L:목록"); 
				String protocol = br.readLine(); 
								
				if(protocol.equals("R") || protocol.equals("r")) {//등록
					boardPoly.boardSql(register);
					register.boardProcess();
//					boardPoly.boardProcess(register);
					boardPoly.boardClose(register);
				}//등록
				
				else if(protocol.equals("S") || protocol.equals("s")) {//검색
					boardPoly.boardSql(search);
//					search.boardProcess();
					boardPoly.boardProcess(search);
					boardPoly.boardClose(search);
				}//검색
				
				else if(protocol.equals("D") || protocol.equals("d")) {//삭제
					boardPoly.boardSql(delete); //매개변수의 다형성
//					delete.boardProcess(); // 객체에서 호출
					boardPoly.boardProcess(delete);
					boardPoly.boardClose(delete);
				}//삭제
				
				else if(protocol.equals("U") || protocol.equals("u")) {//수정								
					boardPoly.boardSql(update);									
//					update.boardProcess();
					boardPoly.boardProcess(update);
					boardPoly.boardClose(update);
				}//수정
				
				else if(protocol.equals("L") || protocol.equals("l")) {//전체출력
					boardPoly.boardSql(list);
//					list.boardProcess();
					boardPoly.boardProcess(list);
					boardPoly.boardClose(list);
				}//전체출력
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//반복문
	}
}
