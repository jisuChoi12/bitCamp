package kr.co.bit.Jazzang;

import java.util.Scanner;

import javax.naming.directory.SearchResult;

public class JazzangMain {
	public static void main(String[] args) {
		JazzangProcess jp = new JazzangProcess();
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("상품이름을 입력하세요.");
			String sangpumName = input.next();
			boolean searchResult = jp.sangpumProcess(sangpumName);
			if(searchResult) {
				break;
			}else {
				System.out.println("해당 상품이 업습니다.");
			}
		}while(true);
	}
}
