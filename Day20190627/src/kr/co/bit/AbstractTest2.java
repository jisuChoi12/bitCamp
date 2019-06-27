package kr.co.bit;

//�߻�Ŭ����
abstract class AbClass1{
	public abstract void abMethod1();
}

//�߻�Ŭ������ ��� �޴� �߻�Ŭ����
abstract class AbClass2 extends AbClass1{
	public abstract void abMethod2();
}

//�߻�Ŭ������ ��� �޴� ����Ŭ����
class GeneralClass extends AbClass2{
	// �߻�Ŭ������ �޼ҵ� ����
	@Override
	public void abMethod1() {
		System.out.println("abMethod1 �޼ҵ� ����");
	}	
	@Override
	public void abMethod2() {
		System.out.println("abMethod2 �޼ҵ� ����");		
	}
}

public class AbstractTest2 {
	public static void main(String[] args) {
		//�߻�Ŭ������ ����� ����Ŭ������ ��ü����(�߻�Ŭ������ ��ü���� �Ұ���)
		GeneralClass gc = new GeneralClass();
		gc.abMethod1();
		gc.abMethod2();
	}		
}
