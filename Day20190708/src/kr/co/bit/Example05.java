package kr.co.bit;

public class Example05 {

	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
//		box1.set(12); 
		box1.set("abcd");
		System.out.println(box1.get());
		Box<Integer> box2 = new Box<Integer>();
		box2.set(12);
		System.out.println(box2.get());
	}
}

// generic타입은 primitive타입 지원 안하고 reference타입만 지원
// Wrapper클래스를 사용하면 가능 int(안됨) Integer(됨)
