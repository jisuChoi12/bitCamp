package kr.co.bit.obj3;

public class StaticTest {
	
	// main�������� ���� �޸�
	// static����(=class����)
	static int num1;
	static {
		num1=0;
	}
	
	// main�������� �ٸ� �޸�
	// ������ �Լ��� �Ἥ �ʱ�ȭ
	public int num2;
	public StaticTest() {
		num2=0;
	}
	
	public static void main(String[] args) {
		StaticTest staticTest = new StaticTest();
	}
}
