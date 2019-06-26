package kr.co.bit;

import java.util.Scanner;

public class Test1 {
	
//	인스턴스 메소드
	public static int display() {
		Scanner input = new Scanner(System.in);
		System.out.println("1.등록 2.삭제 3.정렬 4.종료");
		int num = input.nextInt();
		return num;
	}
	public static void inputRecord() {
		System.out.println("등록");
	}
	public static void deleteRecord() {
		System.out.println("삭제");
	}
	public static void sortRecord() {
		System.out.println("삭제");
	}
	public static void exit() {
		System.out.println("종료");
		System.exit(0);
	}

//	클래스 메소드
//	public static int display() {
//		Scanner input = new Scanner(System.in);
//		System.out.println("1.등록 2.삭제 3.정렬 4.종료");
//		int num = input.nextInt();
//		return num;
//	}
//	public static void inputRecord() {
//		System.out.println("등록");
//	}
//	public static void deleteRecord() {
//		System.out.println("삭제");
//	}
//	public static void sortRecord() {
//		System.out.println("삭제");
//	}
//	public static void exit() {
//		System.out.println("종료");
//		System.exit(0);
//	}

//	메인이 내부
//	public static void main(String[] args) {
//		while(true) {//반복문
//			switch(display()) {
//			case 1:
//				inputRecord();
//				break;
//			case 2:
//				deleteRecord();
//				break;
//			case 3:
//				sortRecord();
//				break;
//			case 4:
//				exit();
//				break;
//			}
//		}//반복문
//	}
}
