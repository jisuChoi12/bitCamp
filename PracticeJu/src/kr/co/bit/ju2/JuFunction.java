package kr.co.bit.ju2;

import java.util.Scanner;

public class JuFunction {
	
	public static String juSelect(Scanner input) {
		System.out.println("주문하세요 yes/no");
		String ju = input.next();
		return ju;
	}
	
	public static void juDisp(int select) {
		if(select==1) {
			System.out.println("주문선택");	
		}
		else {
			System.out.println("주문취소");	
		}
	}
	
	public static int menuSelect(Scanner input) {
		System.out.println("메뉴1.자장면 2.짬뽕 3.탕수육");
		int menu = input.nextInt();
		return menu;
	}
	
	public static void menuDisp(int select) {
		if(select==1) {
			System.out.println("자장면선택");
		}
		else if(select==2) {
			System.out.println("짬뽕선택");
		}
		else if(select==3) {
			System.out.println("탕수육선택");
		}
	}
	
	public static String gobSelect(Scanner input) {
		System.out.println("곱배기 yes/no");
		String gob= input.next();
		return gob;
	}
	
	public static void gobDisp(int select) {
		if(select==1) {
			System.out.println("자장면 곱배기 선택");
		}
		else if(select==2) {
			System.out.println("자장면 보통 선택");
		}
		else if(select==3) {
			System.out.println("짬뽕 곱배기 선택");
		}
		else if(select==4) {
		System.out.println("짬뽕 보통 선택");
		}
	}
	
	public static int tangSelect(Scanner input) {
		System.out.println("사이즈 1.대자 2.중자 3.소자");
		int tang = input.nextInt();
		return tang;
	}
	
	public static void tangDisp(int select) {
		if(select==1) {
			System.out.println("탕수육 대자 선택");
		}
		else if(select==2) {
			System.out.println("탕수육 중자 선택");
		}
		else if(select==3) {
			System.out.println("탕수육 소자 선택");
		}
	}
}
	
	