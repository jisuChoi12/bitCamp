package kr.co.bit.ju;

import java.util.Scanner;

public class JuExecuter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true){// 반복문
			System.out.println("주문하세요 yes/no");
			String ju = input.next();
			if(ju.equals("yes")||ju.equals("YES")){
				System.out.println("주문선택");
				System.out.println("메뉴1.2.3.");
				int menu = input.nextInt();
				if(menu==1) {
					System.out.println("자장면선택");
					System.out.println("자장면 곱배기 yes/no");
					String gob= input.next();
					if(gob.equals("yes")||gob.equals("YES")) {
						System.out.println("자장면 곱배기 선택");
					}
					else {
						System.out.println("보통");
					}
				}
				if(menu==2) {
					System.out.println("짬뽕선택");
					System.out.println("짬뽕 곱배기 yes/no");
					String gob= input.next();
					if(gob.equals("yes")||gob.equals("YES")) {
						System.out.println("짬뽕 곱배기");
					}
					else {
						System.out.println("보통");
					}
				}
				if(menu==3) {
					System.out.println("탕수육선택");
					System.out.println("사이즈: 1.대2.중3.소");
					int tang= input.nextInt();
					if(tang==1) {
						System.out.println("탕수육 대자");
					}
					if(tang==2) {
						System.out.println("탕수육 중자");
					}if(tang==3) {
						System.out.println("탕수육 소자");
					}
				}
			}else {
				System.out.println("주문취소");
				break;
			}
		}// 반복문
	}
}
