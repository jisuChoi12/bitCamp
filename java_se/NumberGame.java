/*
1-100 사이의 난수를 발생하여 맞추는 게임
[실행결과]
1-100 사이의 난수를 발생시켰습니다 87
숫자 입력 : 50
50보다 큽니다
숫자 입력 : 90
90보다 작습니다
숫자 입력 : 87
xx번만에 맞추셨습니다
계속하기 y/n
*/

import java.util.Scanner;

class NumberGame {
	public static void main(String[] args) {
		String again = null;
		Scanner scan = new Scanner(System.in);
		while(true){
			int count = 0;
			int RanNum = (int)(Math.random()*100)+1;
			System.out.println("1-100 사이의 난수를 발생시켰습니다.");
			while(true){
				System.out.print("숫자 입력 : ");
				int inNum = scan.nextInt();
				if(RanNum>inNum){
					System.out.println(inNum+"보다 큽니다");
					count++;
				}
				else if(RanNum<inNum){
					System.out.println(inNum+"보다 작습니다");
					count++;
				}
				else if(RanNum==inNum){
					count++;
					System.out.println(count+"번만에 맞추셨습니다.");
					break;
				}
			}
			System.out.println("한번 더? y/n");
			again = scan.next();
			if(again.equalsIgnoreCase("n")){
				System.out.println("프로그램을 종료합니다...");
				System.exit(0);
			}
			if(again.equalsIgnoreCase("y")) continue; 
		}
	}
}

