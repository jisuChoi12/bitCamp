package kr.co.bit.haksadb4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HaksaProject {

	public static void main(String[] args) {
		Register register = new Register();
		Search search = new Search();
		Delete delete = new Delete();
		List list = new List();
		
		while(true) {//반복문
			System.out.println("학사관리");
			System.out.println("========메뉴========");
			System.out.println("1.등록");
			System.out.println("2.찾기");
			System.out.println("3.삭제");
			System.out.println("4.전체출력");
			System.out.println("0.종료");
			System.out.println("===================");
			System.out.println("번호를 선택해 주세요");
			int protocol = Register.input.nextInt();
			
			if(protocol==1){//등록
				register.registerProcess();
			}//등록
			
			else if(protocol==2) {//찾기
				search.searchProcess();
			}//찾기
			
			else if(protocol==3) {//삭제
				delete.deleteProcess();
			}//삭제
			
			else if(protocol==4) {//전체출력
				list.listProcess();
			}//전체출력

			else if(protocol==0) {//종료
				System.out.println("종료");
				System.exit(0);
			}//종료
		}//반복문
	}//main

}