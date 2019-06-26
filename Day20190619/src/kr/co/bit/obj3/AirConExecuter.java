package kr.co.bit.obj3;

// static이 붙지 않은 인스턴스 변수/메소드는 new 연산자가 필요함
// static이 붙은 변수/메소드는(함수) new 연산자가 필요없이 클래스 이름에서 직접 호출/사용 가능

public class AirConExecuter {

	public static void main(String[] args) {
		
		/*
		 * 인스턴스(=객체=object) stack과 heap으로 나눠진 메모리 공간 
		 * new는 메모리 공간을 둘로 나눠서 new 연산자는 메모리 공간에 실재하게 하는것 
		 * 앞 Aircon은 포인터로 stack에, 뒤 AirCon은 동적 공간인 heap에
		 */ 
//		AirCon airCon = new AirCon(); 인스턴스일 경우(변수/메소드에 static이 붙어있지 않을경우)
//		airCon.company = "삼성 에어컨"; 
//		airCon.color = "흰색";
//		airCon.price = 1000000;
//		airCon.size = 7;
//		airCon.temp = 0;
//		
//		System.out.println("내가 "+airCon.company+"을 샀다. 색깔은 "+airCon.color+"이고"
//				+ " 가격은 "+airCon.price+"원이고 평수는 "+airCon.size+"평 이고 온도는 "+airCon.temp+"도다.");
//		
//		airCon.powerOn();
//		airCon.powerOff();
//		airCon.tempUp();
//		System.out.println(airCon.temp+"도 올림");
//		airCon.tempDown();
//		System.out.println(airCon.temp+"도 내림");
		
//		AirCon.company = "삼성 에어컨"; // 자바에서 static이 붙은 변수/메소드는 직접 호출 가능
//		AirCon.color = "흰색";
//		AirCon.price = 1000000;
//		AirCon.size = 7;
//		AirCon.temp = 0;
//		
//		System.out.println("내가 "+AirCon.company+"을 샀다. 색깔은 "+AirCon.color+"이고"
//				+ " 가격은 "+AirCon.price+"원이고 평수는 "+AirCon.size+"평 이고 온도는 "+AirCon.temp+"도다.");
//		
//		AirCon.powerOn();
//		AirCon.powerOff();
//		AirCon.tempUp();
//		System.out.println(AirCon.temp+"도 올림");
//		AirCon.tempDown();
//		System.out.println(AirCon.temp+"도 내림");
		
	}
}