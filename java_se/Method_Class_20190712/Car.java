/*
�������� ���α׷�
�����Ǿ������� true �����ȵǾ������� false
[������]
**************
	1.����
	2.����
	3.����Ʈ ����
	4.��
**************
��ȣ:4
���α׷��� �����մϴ�

��ȣ:1
��ġ �Է�:3 true /false
�̹� �����Ǿ� �ֽ��ϴ�
3�� ��ġ ����

��ȣ:2
��ġ �Է�:3
�����Ǿ� �ִ� ���� �����ϴ�
3�� ��ġ ����

�Է�:3
1��ġ: true
2��ġ: false
1��ġ: true
1��ġ: true
1��ġ: true

*/
import java.util.Scanner;

class Car {
	public static void main(String[] args) {
		int location = 0;
		boolean[] ar = new boolean[5];
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("**************");
			System.out.println("1:���� 2:���� 3:����Ʈ 4:��");
			System.out.println("**************");
			int select = scan.nextInt();
			if(select==1){ //����
				System.out.println("�� �� �ڸ��� �����Ͻðڽ��ϱ�? ");
				location = scan.nextInt();
				if(ar[location-1]){
					System.out.println("�ش� �ڸ����� �̹� ������ ������ �ֽ��ϴ�.");
				} 
				else {
					ar[location-1] = true;
					System.out.println(location+"�� �ڸ��� ���� �Ϸ�!");
				}
			}
			else if(select==2){ //����
				System.out.println("�� �� �ڸ����� ���� �Ͻðڽ��ϱ�?");
				location = scan.nextInt();
				if(ar[location-1]) {
					ar[location-1] = false;
					System.out.println(location+"�� �ڸ����� ���� �Ϸ�!");
				}
				else{
					System.out.println("�ش� �ڸ����� ������ ������ �����ϴ�.");
				}
			}
			else if(select==3){ //����Ʈ
				for(int i=0; i<ar.length; i++){
					System.out.println((i+1)+"�� �ڸ�: "+ar[i]);
				}
			}
			else if(select==4){ //��
				System.out.println("�����մϴ�...");
				break;
			}
		}
	}
}
