/*
����
Scanner�� �̿��ؼ� ���� a,c,b�� �Է¹޾� �����ϰ� ������� ����Ͻÿ�
if���� �̿�
[������]
a�� �Է� : 25 
b�� �Է� : 12
c�� �Է� : 78
12 25 78
*/

import java.util.Scanner;

class IfTest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("a�� �Է�: ");
		int a = scan.nextInt();
		System.out.print("b�� �Է�: ");
		int b = scan.nextInt();
		System.out.print("c�� �Է�: ");
		int c = scan.nextInt();

		if(a<b && a<c){ //a �� ���� ����
			if(b<c){ // b�� c���� ���� --> a b c
				System.out.print(a+" "+b+" "+c);
			}
			else{ //c�� b���� ���� --> a c b
				System.out.print(a+" "+c+" "+b);
			}
		}
		else if(b<a && b<c){ //b �� ���� ����
			if(a<c){ // a�� c���� ���� --> b a c
				System.out.print(b+" "+a+" "+c);
			}
			else{ //c�� a���� ���� --> b c a
				System.out.print(b+" "+c+" "+a);
			}
		}
		else if(c<a && c<b){ //c �� ���� ����
			if(a<b){ // a�� b���� ���� --> c a b
				System.out.print(c+" "+a+" "+b);
			}
			else{ // b�� a���� ���� --> c b a 
				System.out.print(c+" "+b+" "+a);
			}
		}
	}
}
