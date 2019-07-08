package kr.co.bit;

import java.lang.reflect.Constructor;

public class Example07 {

	// 인스턴스 클래스
	class InnerClass1{
		int field1; //필드
		public InnerClass1() {} //생성자
		void method1() {} //일반메소드
//		static int field2; //인스턴스 클래스 안에서 스태틱 필드X
//		static void method2() {} //인스턴스 클래스 안에서 스태틱 메소드X
	}
	// 스태틱 클래스
	static class InnerClass2{
		int field1; //필드
		public InnerClass2() {} //생성자
		void method1() {} //일반메소드
		static int field2; //스태틱 필드
		static void method2() {} //스태틱 메소드
	}
	
	public void method1() {
		// 지역 클래스
		class InnerClass3{
			int field1; //필드
			public InnerClass3() {} //생성자
			void method1() {} //일반메소드
//			static int field2; //지역 클래스 안에서 스태틱 필드X
//			static void method2() {} //지역 클래스 안에서 스태틱 메소드X
		}
		InnerClass3 ic = new InnerClass3();
	}
	
	public void method2() {
//		InnerClass3 ic = new InnerClass3(); 지역클래스는 지역 안에서만
	}
	
	public static void main(String[] args) {
		Example07 ex = new Example07();
		new Example07(); 
		
//		익명클래스
		Interface1 inter1 = new Interface1() {
			@Override
			public void method1() {
				// TODO Auto-generated method stub
			}

			@Override
			public void method2() {
				// TODO Auto-generated method stub
			}
		};
	}
}
