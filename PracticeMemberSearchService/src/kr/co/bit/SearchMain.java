package kr.co.bit;

import java.util.Scanner;

public class SearchMain {

	public static void main(String[] args) {
		SearchService sv = new SearchService();
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("검색할 회원의 이름을 입력하세요.");
			String name = input.next();
			boolean searchResult = sv.searchMember(name);
			
			if(searchResult) {
				break;
			}
			System.out.println("해당 회원이 존재하지 않습니다.");
		}while(true); //무한반복
	}
}
