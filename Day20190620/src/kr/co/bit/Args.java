package kr.co.bit;

//오버로드 예제

public class Args {
	
	public void add(int x) {
		System.out.println(x+" 정수를 받아서 출력");
	}
	
	public void add(String str) {
		System.out.println(str+" 문자열을 받아서 출력");
	}
	
	public void add(double sil) {
		System.out.println(sil+" 실수를 받아서 출력");
	}
	
	public static void main(String[] args) {
		Args arg = new Args();
		arg.add(10);
		arg.add(1.2);
		arg.add("a");
	}
	
}
