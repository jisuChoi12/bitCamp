package kr.co.bit;

// switch case test
// �������� ������ ȿ�������� (if, else if, else�� ������ ����ϸ� �߰�ȣ�� �ʹ� ���� ����)

public class Switch_Test1 {

	public static void main(String[] args) {
		
		String job = args[0]; // ������ ������ 0����
		int salary = 0; // �ʱⰪ
		
		switch(job) {
		case "���": // ���ڿ��� ���Ǵޱ�
			salary = 200000000;  
			break; // switch case���� ������ ���� break�� �޾��ش�
		case "�븮":
			salary = 350000000;
			break; 
		case "����":
			salary = 500000000;
			break;
		case "����":
			salary = 800000000;
			break; // break�� ������ ���������� ����Ǳ� ������ ������ ������� ����Ǿ� ��µ�
		default:
			System.out.println("���, �븮, ����, ���� �� �Է��ϼ���");
			
		}
		System.out.println("����� ������ " + salary + "�� �Դϴ�.");
	}

}
