package kr.co.bit;

public class StringTest3 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Java");
		StringBuffer sb2 = sb1.append("Fighting");
		System.out.println("sb1==sb2:"+(sb1==sb2));
		System.out.println(sb1);
		System.out.println(sb2);
	}
}

// �Һ����� �����Ƿ� �޼ҵ带 �̿��ؼ�(append) ���ڿ��� �����ϸ� �޸𸮻󿡼� ���ڿ��� �������� ����ȴ�.

