package kr.co.bit;

public class JuExecuter {

	public static void main(String[] args) {
		System.out.println("�ֹ��ϼ��� y/n");
		char ju = 'y';
		if(ju=='y' || ju=='Y') {
			System.out.println("�ֹ�����");
			System.out.println("�޴�: 1.����� 2.«�� 3.������");
			int menu=1;
			// switch�ȿ� switch�� ���� ����... ��ø�� ���ϱ�
			switch(menu) { 
			//switch(...) {} �̷������� �ٷ� switch �ȿ� switch�� ���� ����/��ø
			case 1:
				System.out.println("����� ����");
				System.out.println("����� ����� y/n");
				char gob='y';
				if(gob=='y' || gob=='Y') {
					System.out.println("����� ����� ����");
				}else {
					System.out.println("����� ���� ����");
				}
				break;
			case 2:
				System.out.println("«�� ����");
				gob='y';
				if(gob=='y' || gob=='Y') {
					System.out.println("«�� ����� ����");
				}else {
					System.out.println("«�� ���� ����");
				}
				break;
			case 3: 
				System.out.println("������ ����");
				System.out.println("������: 1.���� 2.���� 3.����");
				int tang=1;
				// case�ȿ� switch�� �� ���� ��øx
				switch(tang) {
				case 1:
					System.out.println("������ ���� ����");
					break;
				case 2:
					System.out.println("������ ���� ����");
					break;
				case 3:
					System.out.println("������ ���� ����");
					break;
				default:
					System.out.println("123�� �߿� �����ϼ���");
				}
				break;
			default:
				System.out.println("123�� �߿� �����ϼ���");
			}
		}
		else {
			System.out.println("�ֹ����");
		}
	}
}
