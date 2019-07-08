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
		
		// static�������� method�� ���� �����Ҷ�
		Box<Integer> box1 = Example06.<Integer>boxing(50);
		System.out.println(box1.get());
		// �� ���� ���
		Box<String> box2 = boxing("ȫ�浿");
		System.out.println(box2.get());
	}
}

// method���� genericŸ�� ������ �����ϴ�