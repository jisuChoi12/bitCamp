package kr.co.bit;

import java.util.Scanner;

public class Test1 {
	
//	�ν��Ͻ� �޼ҵ�
	public static int display() {
		Scanner input = new Scanner(System.in);
		System.out.println("1.��� 2.���� 3.���� 4.����");
		int num = input.nextInt();
		return num;
	}
	public static void inputRecord() {
		System.out.println("���");
	}
	public static void deleteRecord() {
		System.out.println("����");
	}
	public static void sortRecord() {
		System.out.println("����");
	}
	public static void exit() {
		System.out.println("����");
		System.exit(0);
	}

//	Ŭ���� �޼ҵ�
//	public static int display() {
//		Scanner input = new Scanner(System.in);
//		System.out.println("1.��� 2.���� 3.���� 4.����");
//		int num = input.nextInt();
//		return num;
//	}
//	public static void inputRecord() {
//		System.out.println("���");
//	}
//	public static void deleteRecord() {
//		System.out.println("����");
//	}
//	public static void sortRecord() {
//		System.out.println("����");
//	}
//	public static void exit() {
//		System.out.println("����");
//		System.exit(0);
//	}

//	������ ����
//	public static void main(String[] args) {
//		while(true) {//�ݺ���
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
//		}//�ݺ���
//	}
}
