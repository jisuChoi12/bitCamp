package kr.co.bit.obj1;
//2�ܰ���
class Super{
	protected int num1;
	public Super() {
	}
	public void superMethod1() {
		System.out.println("�Ҿƹ���");
	}		
}
class Sub extends Super{
	protected int num2;
	public Sub(){
	}
	public void subMethod1() {
		System.out.println("�ƹ���");
	}
}
class SubSub extends Sub{
	protected int num3;
	public SubSub(){
	}
	public void subsubMethod1() {
		System.out.println("����");
	}
}

public class ExtendsTest2 {
	public static void main(String[] args) {
		SubSub subSub = new SubSub();
		subSub.num1=100;
		subSub.num2=200;
		subSub.num3=300;
		subSub.superMethod1();
		subSub.subMethod1();
		subSub.subsubMethod1();
	}
}
