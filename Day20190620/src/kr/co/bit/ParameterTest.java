package kr.co.bit;

public class ParameterTest {

	public static void main(String[] args) {
		Data d = new Data();
		d.x=10;
		System.out.println("main(0):x="+d.x);
		System.out.println("After change(d.x)"); 
//		change(d.x); // �⺻ 
		change(d); // ����
		System.out.println("main(0):x="+d.x); //�Լ��� �����ϰ� �������� ���ƿ� ��
	}
	
//	�Ķ���Ϳ� �⺻�� : read only
//	public static void change(int x) {
//		x=10000;
//		System.out.println("change(x):x="+x); // �Լ� �ȿ����� x��
//	}
	
//	�Ķ���Ϳ� Ŭ���� Ÿ�� : read & write
	public static void change(Data d) {
		d.x=1000;
		System.out.println("change(x):x="+d.x);
	}
}