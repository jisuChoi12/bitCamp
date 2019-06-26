package kr.co.bit;

public class Dowhile_Test4 {
	public static void main(String[] args) {
		int i=0;
		// while
		while(i>=1) {
			System.out.println("while area");
		}
		// do while
		// do while문은 조건이 거짓이라도 한번은 실행 된다
		do {
			System.out.println("do while area");
		}while(i>=1);
	}
}
