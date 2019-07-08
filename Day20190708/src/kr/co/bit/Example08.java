package kr.co.bit;

//람다

public class Example08 {
	public static void main(String[] args) {
		RambdaInterface1 ri1;
//		예전방식
//		ri1 = new RambdaInterface() {
//			
//			@Override
//			public void method() {
//				System.out.println("method call 1");
//				
//			}
//		};
//		ri1.method();
		
//		ri1 = () -> {
//			System.out.println("method call 1");
//		};
//		ri1.method();
		
		ri1 = () -> System.out.println("method call 1");
		ri1.method();
		
		
		
		RambdaInterface2 ri2;
//		ri2 = (x) -> {
//			int result = x*5;
//			System.out.println(result);
//		};
//		ri2.method(5);

		ri2 = x -> System.out.println(x*5);
		ri2.method(5);
		
		
		RambdaInterface3 ri3;
//		ri3 = (x,y) -> {
//			int result = x+y;
//			return result;
//		};
//		System.out.println(ri3.method(2, 5));
		
//		ri3 = (x,y) -> x+y; 
//		System.out.println(ri3.method(2, 5));
		
		ri3 = (x,y) -> sum(x,y); 
		System.out.println(ri3.method(2, 5));
		
	}
	
	public static int sum(int x,int y) {
		return x+y;
	}
}
