package kr.co.bit;

//�����ε� ����

public class Args {
	
	public void add(int x) {
		System.out.println(x+" ������ �޾Ƽ� ���");
	}
	
	public void add(String str) {
		System.out.println(str+" ���ڿ��� �޾Ƽ� ���");
	}
	
	public void add(double sil) {
		System.out.println(sil+" �Ǽ��� �޾Ƽ� ���");
	}
	
	public static void main(String[] args) {
		Args arg = new Args();
		arg.add(10);
		arg.add(1.2);
		arg.add("a");
	}
	
}
