package kr.co.bit;

//@MyAnnotation1("aaa")  //���� ���� �� ����, element��� �θ��� ����
public class Example03 {
	int a;
	int b;
	
//	@MyAnnotation1(value = "bbb", elemName2 = 4)
	public Example03(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	@MyAnnotation1("aaa")
	public void method1() {
		
	}
	public void method2(int a, int b) {
		
	}
	public static void main(String[] args) {
		
	}
}
