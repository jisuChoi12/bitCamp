/* 
���� ���� �� ����
1: ���� 2: ���� 3: ���ڱ�
��ǥ�Ͱ� 1-3 ������ ������ �߻��Ѵ�.
�⺻ �ݾ��� 10,000���� �����Ѵ�
�ݾ��� 0���̰ų� ���̳ʽ��̸� �ݾ��� �ٽ� �Է�
[������]
����,����,��(1-3) : 1 (System.in.read() ���)
���� �ݾ�: 3000
Enter�� ġ����...
��ǻ�� : ����(2), �� : ����(1)
����
���� ��: 7000
Insert coin(y/n): y/n
���α׷� ����...
�󸶸� �����ұ��?
*/

import java.util.Scanner;

class Game {
	public static void main(String[] args) throws java.io.IOException {
		String[] str = {"����","����","��"};
		Scanner scan = new Scanner(System.in);
		int mny = 10000;
		int my = 0;
		int com = 0;
		int deal = 0;
		
		while(true){
			while(true){
				deal = 0;
				System.out.println("1:���� 2:���� 3:��");
				my = System.in.read()-'0'; // '0' (48) read()�� ����x ����o
				System.in.read();
				System.in.read();
				do{
					System.out.print("���� �ݾ�: ");
					deal = scan.nextInt();
					if(deal<mny && deal!=0) break;
				}while(deal>mny || deal==0);
				System.out.println("ENTER�� �Է����ּ���... :]");
				System.in.read(); // \r
				System.in.read(); // \n
				com = (int)(Math.random()*3)+1;
				
				System.out.print("��ǻ��:"+str[com-1]+" | "+"��:"+str[my-1]+" ... ");

				if(my==com){ //����-���� ����-���� ��-��
					System.out.println("���� :P");
				}
				else if(my>com || (my==1 && com==3)){ // ��-���� ����-���� || ����-��
					System.out.println("�̰�� :D");
					mny += deal;
				}
				else{ // ����-���� ����-�� ��-���� 
					System.out.println("���� :/");
					mny -= deal;
				}

				System.out.println("���� ��: "+mny);
				System.out.println();

				if(mny<=0) break;
			}
			System.out.print("INSERT COIN (y/n): ");
			String more = scan.next();
			if(more.equalsIgnoreCase("y")){
				System.out.print("�󸶸� �����ұ��?: ");
					mny = scan.nextInt();
				}
			if(more.equalsIgnoreCase("n")){
				System.out.println("������ �����մϴ�... :)");
				break;
			}
		}
	}
}


/*
				if(my==1){ //���� 
					if(com==1){
						System.out.println("��ǻ��:���� | ��:����... ���� :|");
					}
					else if(com==2){
						System.out.println("��ǻ��:���� | ��:����... ���� :(");
						mny -= deal;
					}
					else if(com==3){
						System.out.println("��ǻ��:�� | ��:����... �̰�� :D");
						mny += deal;
					}
				}
				else if(my==2){ //����
					if(com==1){
						System.out.println("��ǻ��:���� | ��:����... �̰�� :D");
						mny += deal;
					}
					else if(com==2){
						System.out.println("��ǻ��:���� | ��:����... ���� :|");
					}
					else if(com==3){
						System.out.println("��ǻ��:�� | ��:����... ���� :(");
						mny -= deal;
					}
					
				}
				else if(my==3){ //��
					if(com==1){
						System.out.println("��ǻ��:���� | ��:���ڱ�... ���� :(");
						mny -= deal;
					}
					else if(com==2){
						System.out.println("��ǻ��:���� | ��:���ڱ�... �̰�� :D");
						mny += deal;
					}
					else if(com==3){
						System.out.println("��ǻ��:���ڱ� | ��:���ڱ�... ���� :|");
					}
				}
				*/