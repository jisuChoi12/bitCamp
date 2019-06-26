package kr.co.bit;

// 클래스 멤버변수 지역변수 우선순위가 같으면 안됨

public class Test {
	int num1;
	int num2;

	public Test() {
		this.num1 = 0;
		this.num2 = 0;
	}

	public Test(int num1, int num2) {
		 this.num1=num1;
		 this.num2=num2;
	}
	 
	public static void main(String[] args) {
		Test test1 = new Test();
	}
}
