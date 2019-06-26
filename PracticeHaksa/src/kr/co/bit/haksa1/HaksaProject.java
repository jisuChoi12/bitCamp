package kr.co.bit.haksa1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HaksaProject {
	public static void main(String[] args) {
		ArrayList<HashMap<String, String>> haksaList = new ArrayList<HashMap<String,String>>();
		Scanner input = new Scanner(System.in);
		HaksaFunction haksa = new HaksaFunction();
		//while반복문
		while(true) {
			System.out.println("=======메뉴선택======");
			System.out.println("1.등록");
			System.out.println("2.찾기");
			System.out.println("3.삭제");
			System.out.println("4.전체출력");
			System.out.println("-------------");
			System.out.println("0.종료");
			System.out.println("-------------");
			System.out.println("번호를 선택해 주세요.");
			int protocol = input.nextInt();
			
			//등록
			if(protocol==1) {
				System.out.println("=======메뉴선택======");
				System.out.println("1.학생");
				System.out.println("2.교수");
				System.out.println("3.관리자");
				System.out.println("4.이전메뉴");
				System.out.println("번호를 선택해 주세요.");
				protocol = input.nextInt();
				haksa.register(protocol, input, haksaList);
				//이전메뉴
				if(protocol==4){
					System.out.println("이전메뉴로 이동");
					continue;
				}//이전메뉴
			}//등록
			
			//찾기
			else if(protocol==2) {
				haksa.search(input, haksaList);
			}//찾기
			
			//삭제
			else if(protocol==3) {
				haksa.delete(input, haksaList);
			}//삭제
			
			//전체출력
			else if(protocol==4) {
				haksa.list(haksaList);
			}//전체출력
			
			//종료
			else {
				System.exit(0);
			}//종료
			
		}//while반복문
	}
}
