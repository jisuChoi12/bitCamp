package kr.co.bit;

public class Test4 {

	private int num1;
	private int num2;
	
	public int getNum1() { //전송,출력
		return num1;
	}
	public void setNum1(int num1) { //대입,입력:set함수로 
		this.num1 = num1;
	}
	public int getNum2() { //전송,출력
		return num2;
	}
	public void setNum2(int num2) { //대입,입력
		this.num2 = num2;
	}
	
	public Test4() {//초기화:생성자로 
		num1=100;
		num2=200;
	}
	public static void main(String[] args) {
		Test4 test4 = new Test4();
		System.out.println(test4.num1);
		System.out.println(test4.num2);
		test4.setNum1(1000);
		test4.setNum2(2000);
		System.out.println(test4.getNum1());
		System.out.println(test4.getNum2());
	}
}
