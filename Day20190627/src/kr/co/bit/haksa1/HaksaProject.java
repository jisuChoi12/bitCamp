package kr.co.bit.haksa1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HaksaProject {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Connection conn = null;
		while(true) {//반복문
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver"); //로드
				conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","bitadmin","dkdlxl"); //연결
				if(conn==null) {
					System.out.println("데이터베이스 연결 실패");
				}
				else {
					System.out.println("데이터베이스 연결 성공");
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("학사관리");
			System.out.println("========메뉴========");
			System.out.println("1.등록");
			System.out.println("2.찾기");
			System.out.println("3.삭제");
			System.out.println("4.전체출력");
			System.out.println("0.종료");
			System.out.println("===================");
			System.out.println("번호를 선택해 주세요");
			int protocol = input.nextInt();
			
			if(protocol==1){//등록
				HaksaFunction.register(input, conn);
			}//등록
			
			else if(protocol==2) {//찾기
				HaksaFunction.search(input, conn);
			}//찾기
			
			else if(protocol==3) {//삭제
				HaksaFunction.delete(input, conn);
			}//삭제
			
			else if(protocol==4) {//전체출력
				HaksaFunction.list(input, conn);
			}//전체출력

			else if(protocol==0) {//종료
				System.out.println("종료");
				System.exit(0);
			}//종료
		}//반복문
	}//main

}