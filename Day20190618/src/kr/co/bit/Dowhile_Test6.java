package kr.co.bit;

import java.util.Scanner;

public class Dowhile_Test6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String result = "서울";
		String inputStr="";
		do {
			System.out.println("대한민국의 수도를 입력하세요.");
			inputStr=input.next();
			if(inputStr.equals(result)) { // 문자열을 비교할때 -> 비교1.equals(비교2)
				System.out.println("대한민국의 수도는 "+result+"입니다.");
				break; // do while문에서 나옴 
			}
			System.out.println("다시 입력하세요.");
		}while(true);
	}
}
