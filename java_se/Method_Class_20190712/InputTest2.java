//import java.io.IOException;

class InputTest2 {
	public static void main(String[] args) throws java.io.IOException {
		System.out.print("���� �Է� : ");
		int data = System.in.read(); // read()�� enter, space���� ���� �÷��� �ʿ�
		System.in.read(); //\r �÷��� ���
		System.in.read(); //\n �÷��� ���
		System.out.print("���� �Է� : ");
		int data2 = System.in.read();
		System.out.println(data+", "+data2);
	}
}

// ���� -> \r\n