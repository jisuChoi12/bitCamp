package kr.co.bit;

public class Boiler {
	private String maker;
	private String color;
	public int temp;
	
	public void tempUp() { // 1�� �ø��� �Լ�
		temp++;
	}
	public void tempUp(int amount) { // �Է¹��� amount�� ��ŭ �ø��� �Լ�
		temp=temp+amount; 
	}
	
	public void set() {
		maker="a";
		System.out.println(maker);
	}
	
//	public static void main(String[] args) {
//		Boiler boiler = new Boiler();
//		boiler.set();
//		boiler.tempUp();
//		System.out.println(boiler.temp);
//		boiler.tempUp(10);
//		System.out.println(boiler.temp);
//	}
}
