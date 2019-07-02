package kr.co.bit;

public class AutoBoxingTest {

	public static void main(String[] args) {
		int intVar1 = 3;
//		1.4이하
		Integer intObj1 = new Integer(intVar1);
//		1.5이상
		intObj1 = intVar1;
//		1.4이하
		Integer intObj2 = new Integer("4");
		int intVar2 = intObj2.intValue();
//		1.5이상
		intVar2 = intObj2;
		
		System.out.println("intObj1:"+intObj1);
		System.out.println("intVar2:"+intVar2);

	}

}
