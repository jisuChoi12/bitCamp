package kr.co.bit.obj;

public class Son extends Father {
	protected double gudu;
	
	public Son() {
		System.out.println(super.gudu); //main에선x
		gudu=140.5;
	}
	
	public static void main(String[] args) {
		Son son = new Son();
		System.out.println(son.gudu); //아들 발사이즈
	}
}

// 변수를 상속 받아서 쓰면x
// 아버지와 아들의 신발 사이즈가 다르니까 (변수의 다형성)
// 부모클래스의 변수를 쓰고싶으면 super가 필요