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

// genericŸ���� primitiveŸ�� ���� ���ϰ� referenceŸ�Ը� ����
// WrapperŬ������ ����ϸ� ���� int(�ȵ�) Integer(��)
