package kr.co.bit.obj3;

public class AirCon {
	
//  �ν��Ͻ���������
	String company; //������
	String color; //��
	int price; //����
	int size; //������ ũŰ
	int temp; //�µ�

//	������ �Լ�(=constructor) �����Ϸ��� ������ �����. �ʱ�ȭ
	public AirCon() {
		company=null;
		color=null;
		price=0;
		size=0;
		temp=0;
	}

//  �ν��Ͻ��޼ҵ�����
	public void powerOn() {
		System.out.println("���� Ŵ"); // ���� ���� ����
	}
	public void powerOff() {
		System.out.println("���� ��"); // ���� ���� ����
	}
	public void tempUp() {
		temp++; // �µ� 1 ����
	}
	public void tempDown() {
		temp--; // �µ� 1 ����
	}
	
	
//	
//	//static��������
//	static String company; //������
//	static String color; //��
//	static int price; //����
//	static int size; //������ ũŰ
//	static int temp; //�µ�
//	
//	//static�޼ҵ�����
//	public static void powerOn() {
//		System.out.println("���� Ŵ"); // ���� ���� ����
//	}
//	public static void powerOff() {
//		System.out.println("���� ��"); // ���� ���� ����
//	}
//	public static void tempUp() {
//		temp++; // �µ� 1 ����
//	}
//	public static void tempDown() {
//		temp--; // �µ� 1 ����
//	}
}
