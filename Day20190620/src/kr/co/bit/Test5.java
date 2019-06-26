package kr.co.bit;

public class Test5 {
	private int num1;
	private int num2;
	public Test5() {
		num1=0;
		num2=0;
	}
	public Test5(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	@Override
	public String toString() {
		return "Test5 [num1=" + num1 + ", num2=" + num2 + "]";
	}
	public static void main(String[] args) {
		Test5 test5 = new Test5();
		Test5 test6 = new Test5(100,200);
	}
}
