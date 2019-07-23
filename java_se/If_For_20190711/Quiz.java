/*
10-99 사이의 난수를 두개 발생하여 합을 맞추는 게임
총 문제는 5문제를 제공합니다
한 문제당 점수는 20점
틀리면 한번 더 기회를 제공한다
[실행결과]
[1] 12 + 36 = ??
틀렸다
[1] 12 + 36 = ??
틀렸다... 정답은 48
[2] 10 + 15 = ??
맞았다
.
.
[5] 90 + 88 = ??
틀렸다
[5] 90 + 88 = ??
맞았다
총 맞은 개수는 2문제이고 점수는 40점입니다
한번 더 y/n : n
프로그램을 종료합니다
*/

import java.util.Scanner;

class Quiz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int wrongCnt=0;
		int rNum1=0;
		int rNum2=0;
		int score = 0;
		int ans=0;
		int guess=0;
		String again;
		
		while (true) {
			for (int i = 1; i <= 5; i++) {
				wrongCnt=0;
				rNum1 = (int) (Math.random() * 90) + 10;
				rNum2 = (int) (Math.random() * 90) + 10;
				while (true) {
					System.out.print("[" + i + "] " + rNum1 + " + " + rNum2 + " = ");
					ans = rNum1 + rNum2;
					guess = scan.nextInt();
					if (guess == ans) {
						System.out.println("정답!");
						wrongCnt = 0;
						score += 20;
					}
					if (guess != ans) {
						if (wrongCnt == 0) {
							System.out.println("오답...");
						}
						if (wrongCnt == 1) {
							System.out.println("오답... 정답은 " + ans);
							wrongCnt = 0;
							break;
						}
						wrongCnt++;
					}
					if (wrongCnt == 0)
						break;
				}
			}
			System.out.println("총 맞은 문제는 "+(score/20)+"문제이고 점수는 "+score+"점 입니다.");
			score = 0;
			do{
				System.out.print("한번 더? y/n: ");
				again = scan.next();
				if(again.equalsIgnoreCase("y") || again.equalsIgnoreCase("n")) break;
			}while(true);	
			if(again.equalsIgnoreCase("n")){
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
	}
}
