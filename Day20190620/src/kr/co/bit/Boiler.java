package kr.co.bit;

public class Boiler {
	private String maker;
	private String color;
	public int temp;
	
	public void tempUp() { // 1을 올리는 함수
		temp++;
	}
	public void tempUp(int amount) { // 입력받은 amount값 만큼 올리는 함수
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
