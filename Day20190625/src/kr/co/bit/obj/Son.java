package kr.co.bit.obj;

public class Son extends Father {
	protected double gudu;
	
	public Son() {
		System.out.println(super.gudu); //main����x
		gudu=140.5;
	}
	
	public static void main(String[] args) {
		Son son = new Son();
		System.out.println(son.gudu); //�Ƶ� �߻�����
	}
}

// ������ ��� �޾Ƽ� ����x
// �ƹ����� �Ƶ��� �Ź� ����� �ٸ��ϱ� (������ ������)
// �θ�Ŭ������ ������ ��������� super�� �ʿ�