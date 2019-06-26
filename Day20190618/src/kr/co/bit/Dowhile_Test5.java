package kr.co.bit;

import java.util.Scanner;

public class Dowhile_Test5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int randNum = (int)(Math.random()*100)+1; // 0을 방지하기 위해 +1을 강제로 넣는다
		int inputNum = 0;
		do {
			System.out.println("숫자를 입력하세요.");
			inputNum = input.nextInt();
			if(inputNum==randNum) {
				System.out.println("정답!");
			}else if(inputNum<randNum) {
				System.out.println("숫자가 너무 작아요.");
			}else {
				System.out.println("숫자가 너무 커요.");
			}
		}while(true);
	}
}
