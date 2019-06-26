package kr.co.bit;

public class Test1Main {

//	메인이 외부
	public static void main(String[] args) {
//		클래스 메소드
//		while(true) {//반복문
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
		
//		}//반복문
		
		//인스턴스 메소드
		Test1 test1 = new Test1();
		while(true) {//반복문
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
		}//반복문
	}
}
