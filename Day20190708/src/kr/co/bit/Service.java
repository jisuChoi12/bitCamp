package kr.co.bit;

public class Service {
	@PrintAnnotation
	public void method1() {
		System.out.println("���賻��1");
	}
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("���賻��2");		
	}
	@PrintAnnotation(value="#",num=20)
	public void method3() {
		System.out.println("���賻��3");
	}
}
