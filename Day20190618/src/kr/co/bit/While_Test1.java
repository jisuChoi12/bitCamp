package kr.co.bit;

public class While_Test1 {
	public static void main(String[] args) {
		int sum=0;
		int i=1;
		// 조건에 의해서만 반복될때나 무한루트(for문은 몇번 반복될지 정해졌을때)
		while(i<=50) {
			sum+=i;
			i++;
		}
		System.out.println("1부터 50까지의 합="+sum);
	}
}
