/*
1-100 ������ ������ �߻��Ͽ� ���ߴ� ����
[������]
1-100 ������ ������ �߻����׽��ϴ� 87
���� �Է� : 50
50���� Ů�ϴ�
���� �Է� : 90
90���� �۽��ϴ�
���� �Է� : 87
xx������ ���߼̽��ϴ�
����ϱ� y/n
*/

import java.util.Scanner;

class NumberGame {
	public static void main(String[] args) {
		String again = null;
		Scanner scan = new Scanner(System.in);
		while(true){
			int count = 0;
			int RanNum = (int)(Math.random()*100)+1;
			System.out.println("1-100 ������ ������ �߻����׽��ϴ�.");
			while(true){
				System.out.print("���� �Է� : ");
				int inNum = scan.nextInt();
				if(RanNum>inNum){
					System.out.println(inNum+"���� Ů�ϴ�");
					count++;
				}
				else if(RanNum<inNum){
					System.out.println(inNum+"���� �۽��ϴ�");
					count++;
				}
				else if(RanNum==inNum){
					count++;
					System.out.println(count+"������ ���߼̽��ϴ�.");
					break;
				}
			}
			System.out.println("�ѹ� ��? y/n");
			again = scan.next();
			if(again.equalsIgnoreCase("n")){
				System.out.println("���α׷��� �����մϴ�...");
				System.exit(0);
			}
			if(again.equalsIgnoreCase("y")) continue; 
		}
	}
}

