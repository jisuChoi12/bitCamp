package kr.co.bit;

public class Test1Main {

//	������ �ܺ�
	public static void main(String[] args) {
//		Ŭ���� �޼ҵ�
//		while(true) {//�ݺ���
//			switch(Test1.display()) {
//			case 1:
//				Test1.inputRecord();
//				break;
//			case 2:
//				Test1.deleteRecord();
//				break;
//			case 3:
//				Test1.sortRecord();
//				break;
//			case 4:
//				Test1.exit();
//				break;
//			}
		
//		}//�ݺ���
		
		//�ν��Ͻ� �޼ҵ�
		Test1 test1 = new Test1();
		while(true) {//�ݺ���
			switch(test1.display()) {
			case 1:
				test1.inputRecord();
				break;
			case 2:
				test1.deleteRecord();
				break;
			case 3:
				test1.sortRecord();
				break;
			case 4:
				test1.exit();
				break;
			}
		}//�ݺ���
	}
}
