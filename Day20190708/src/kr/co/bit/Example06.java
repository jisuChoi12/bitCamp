package kr.co.bit;

public class Example06 {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	public static void main(String[] args) {
		Example06 ex = new Example06();
//		ex.boxing("String");
		
		// static영역에서 method를 참조 가능할때
		Box<Integer> box1 = Example06.<Integer>boxing(50);
		System.out.println(box1.get());
		// 그 외의 경우
		Box<String> box2 = boxing("홍길동");
		System.out.println(box2.get());
	}
}

// method에서 generic타입 선언이 가능하다