/*
10-99 ������ ������ �ΰ� �߻��Ͽ� ���� ���ߴ� ����
�� ������ 5������ �����մϴ�
�� ������ ������ 20��
Ʋ���� �ѹ� �� ��ȸ�� �����Ѵ�
[������]
[1] 12 + 36 = ??
Ʋ�ȴ�
[1] 12 + 36 = ??
Ʋ�ȴ�... ������ 48
[2] 10 + 15 = ??
�¾Ҵ�
.
.
[5] 90 + 88 = ??
Ʋ�ȴ�
[5] 90 + 88 = ??
�¾Ҵ�
�� ���� ������ 2�����̰� ������ 40���Դϴ�
�ѹ� �� y/n : n
���α׷��� �����մϴ�
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
						System.out.println("����!");
						wrongCnt = 0;
						score += 20;
					}
					if (guess != ans) {
						if (wrongCnt == 0) {
							System.out.println("����...");
						}
						if (wrongCnt == 1) {
							System.out.println("����... ������ " + ans);
							wrongCnt = 0;
							break;
						}
						wrongCnt++;
					}
					if (wrongCnt == 0)
						break;
				}
			}
			System.out.println("�� ���� ������ "+(score/20)+"�����̰� ������ "+score+"�� �Դϴ�.");
			score = 0;
			do{
				System.out.print("�ѹ� ��? y/n: ");
				again = scan.next();
				if(again.equalsIgnoreCase("y") || again.equalsIgnoreCase("n")) break;
			}while(true);	
			if(again.equalsIgnoreCase("n")){
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
		}
	}
}
