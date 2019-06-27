package kr.co.bit;

//�������̽�
interface Interface1{
	//������ public static -> ��������� �ѹ��� ���������.
	public static int interVar1=10;
	//�߻�޼ҵ�
	public abstract void interfaceMethod1(); //�������� ���� Override
	
	//�ڹ�8���� �������̽����� static/default �޼ҵ� ���
	public static void abcd() {
		System.out.println("����...");
	}
}

interface Interface2{
	public static int interVar2=20;
	public abstract void interfaceMethod2();
	public abstract void interfaceMethos3();
}

// �������̽��� ��ӹ޴� ����Ŭ���� -> Object�� Interface1 �ΰ��� ����Ŭ������ ��� 
class Interface1Imp1 extends Object implements Interface1, Interface2{
	// �������̽��� ���ǵ� ��� �߻�Ŭ������ �����ؾ��� (�ϳ��� �������� �� Ŭ������ abstractŬ����)
	@Override
	public void interfaceMethod1() {
		System.out.println("interdaceMethod1 ���� ");
	}
	@Override
	public void interfaceMethod2() {
		System.out.println("interfaceMethod2 ����");	
	}
	public void aaa() {
		System.out.println("aaa");
	}
	@Override
	public void interfaceMethos3() {
		// TODO Auto-generated method stub
		
	}
}

//����Ŭ����
public class InterfaceTest1 {
	public static void main(String[] args) {
		// �������̽��� ��ӹ��� ����Ŭ������ ��ü����
		Interface1Imp1 in1Imp1 = new Interface1Imp1();
		
		System.out.println("in1Imp1.interVar="+in1Imp1.interVar1);
		System.out.println("in1Imp2.interVar="+in1Imp1.interVar2);
		in1Imp1.interfaceMethod1();
		in1Imp1.interfaceMethod2();		
		in1Imp1.aaa();
		
		
		
		// static ����/�޼ҵ�� Ŭ���������� ȣ�Ⱑ��
		System.out.println("Interface1.interVar="+Interface1.interVar1);
		System.out.println("Interface2.interVar="+Interface2.interVar2);
		Interface1.abcd();
		
		// �޼ҵ�� �������̽� �ȿ��� �߻�޼ҵ�ϱ� �װ� ������ ����Ŭ������ upCasting�ϰ� �޼ҵ� ȣ��
		Interface1 it1 = new Interface1Imp1(); //upCasting
		it1.interfaceMethod1();
		//it1.aaa(); ����: upCasting������ ����Ŭ������ �޼ҵ常 ��� ����
		
		Interface2 it2 = new Interface1Imp1();
		it2.interfaceMethod2();
	}
}
