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
		int score = 0;

		while (true) {
			for (int i = 1; i <= 5; i++) {
				int wrongCnt=0;
				int rNum1 = (int) (Math.random() * 89) + 10;
				int rNum2 = (int) (Math.random() * 89) + 10;
				while (true) {
					System.out.print("[" + i + "] " + rNum1 + " + " + rNum2 + " = ");
					int ans = rNum1 + rNum2;
					int guess = scan.nextInt();
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
			System.out.print("�ѹ� ��? y/n: ");
			String again = scan.next();
			if (again.equalsIgnoreCase("y")) {
			}	
			if (again.equalsIgnoreCase("n")) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
		}
	}
}
