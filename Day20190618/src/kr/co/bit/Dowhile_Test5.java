package kr.co.bit;

import java.util.Scanner;

public class Dowhile_Test5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int randNum = (int)(Math.random()*100)+1; // 0�� �����ϱ� ���� +1�� ������ �ִ´�
		int inputNum = 0;
		do {
			System.out.println("���ڸ� �Է��ϼ���.");
			inputNum = input.nextInt();
			if(inputNum==randNum) {
				System.out.println("����!");
			}else if(inputNum<randNum) {
				System.out.println("���ڰ� �ʹ� �۾ƿ�.");
			}else {
				System.out.println("���ڰ� �ʹ� Ŀ��.");
			}
		}while(true);
	}
}
