package kr.co.bit;

import java.util.Scanner;

public class Dowhile_Test6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String result = "����";
		String inputStr="";
		do {
			System.out.println("���ѹα��� ������ �Է��ϼ���.");
			inputStr=input.next();
			if(inputStr.equals(result)) { // ���ڿ��� ���Ҷ� -> ��1.equals(��2)
				System.out.println("���ѹα��� ������ "+result+"�Դϴ�.");
				break; // do while������ ���� 
			}
			System.out.println("�ٽ� �Է��ϼ���.");
		}while(true);
	}
}
