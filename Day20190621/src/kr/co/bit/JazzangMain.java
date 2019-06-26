package kr.co.bit;

import java.util.Scanner;

import javax.naming.directory.SearchResult;

public class JazzangMain {
	public static void main(String[] args) { //1
		JazzangProcess jp = new JazzangProcess(); //2
		Scanner input = new Scanner(System.in); //3
		do {
			System.out.println("상품이름을 입력하세요.");
			String sangpumName = input.next();
			boolean searchResult = jp.sangpumProcess(sangpumName); //4
			if(searchResult) { //10
				break;
			}else {
				System.out.println("찾는 상품이 업습니다.");
			}
		}while(true);
	}
}
