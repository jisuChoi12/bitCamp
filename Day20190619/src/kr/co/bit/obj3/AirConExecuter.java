package kr.co.bit.obj3;

// static�� ���� ���� �ν��Ͻ� ����/�޼ҵ�� new �����ڰ� �ʿ���
// static�� ���� ����/�޼ҵ��(�Լ�) new �����ڰ� �ʿ���� Ŭ���� �̸����� ���� ȣ��/��� ����

public class AirConExecuter {

	public static void main(String[] args) {
		
		/*
		 * �ν��Ͻ�(=��ü=object) stack�� heap���� ������ �޸� ���� 
		 * new�� �޸� ������ �ѷ� ������ new �����ڴ� �޸� ������ �����ϰ� �ϴ°� 
		 * �� Aircon�� �����ͷ� stack��, �� AirCon�� ���� ������ heap��
		 */ 
//		AirCon airCon = new AirCon(); �ν��Ͻ��� ���(����/�޼ҵ忡 static�� �پ����� �������)
//		airCon.company = "�Ｚ ������"; 
//		airCon.color = "���";
//		airCon.price = 1000000;
//		airCon.size = 7;
//		airCon.temp = 0;
//		
//		System.out.println("���� "+airCon.company+"�� ���. ������ "+airCon.color+"�̰�"
//				+ " ������ "+airCon.price+"���̰� ����� "+airCon.size+"�� �̰� �µ��� "+airCon.temp+"����.");
//		
//		airCon.powerOn();
//		airCon.powerOff();
//		airCon.tempUp();
//		System.out.println(airCon.temp+"�� �ø�");
//		airCon.tempDown();
//		System.out.println(airCon.temp+"�� ����");
		
//		AirCon.company = "�Ｚ ������"; // �ڹٿ��� static�� ���� ����/�޼ҵ�� ���� ȣ�� ����
//		AirCon.color = "���";
//		AirCon.price = 1000000;
//		AirCon.size = 7;
//		AirCon.temp = 0;
//		
//		System.out.println("���� "+AirCon.company+"�� ���. ������ "+AirCon.color+"�̰�"
//				+ " ������ "+AirCon.price+"���̰� ����� "+AirCon.size+"�� �̰� �µ��� "+AirCon.temp+"����.");
//		
//		AirCon.powerOn();
//		AirCon.powerOff();
//		AirCon.tempUp();
//		System.out.println(AirCon.temp+"�� �ø�");
//		AirCon.tempDown();
//		System.out.println(AirCon.temp+"�� ����");
		
	}
}