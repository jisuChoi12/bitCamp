package kr.co.bit.obj;

class VarClass {
	final int x; //�ν��Ϻ��� ����x
	static final int y; //Ŭ�������� ������
	final double PI;
	
	static {
		y=100;
	}
	public VarClass(int x) {
		this.x=x;
		PI=3.14;
	}
}

public class FinalVar{
	public static void main(String[] args) {
//		VarClass.y=30; ����: �ʱⰪ�� �̹� final�� ������/������ ��� ���/���ڻ��
		VarClass vc1 = new VarClass(10);
//		vc1.y=50;
//		vc1.x=40;
		System.out.println(vc1.x+5);
		VarClass vc2 = new VarClass(20);
		System.out.println(vc2.x+5);
		System.out.println(VarClass.y+5);
	}
}
