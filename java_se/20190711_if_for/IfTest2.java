/*
과제
Scanner를 이용해서 정수 a,c,b를 입력받아 정렬하고 순서대로 출력하시오
if문만 이용
[실행결과]
a값 입력 : 25 
b값 입력 : 12
c값 입력 : 78
12 25 78
*/

import java.util.Scanner;

class IfTest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("a값 입력: ");
		int a = scan.nextInt();
		System.out.print("b값 입력: ");
		int b = scan.nextInt();
		System.out.print("c값 입력: ");
		int c = scan.nextInt();

		if(a<b && a<c){ //a 가 가장 작음
			if(b<c){ // b가 c보다 작음 --> a b c
				System.out.print(a+" "+b+" "+c);
			}
			else{ //c가 b보다 작음 --> a c b
				System.out.print(a+" "+c+" "+b);
			}
		}
		else if(b<a && b<c){ //b 가 가장 작음
			if(a<c){ // a가 c보다 작음 --> b a c
				System.out.print(b+" "+a+" "+c);
			}
			else{ //c가 a보다 작음 --> b c a
				System.out.print(b+" "+c+" "+a);
			}
		}
		else if(c<a && c<b){ //c 가 가장 작음
			if(a<b){ // a가 b보다 작음 --> c a b
				System.out.print(c+" "+a+" "+b);
			}
			else{ // b가 a보다 작음 --> c b a 
				System.out.print(c+" "+b+" "+a);
			}
		}
	}
}
