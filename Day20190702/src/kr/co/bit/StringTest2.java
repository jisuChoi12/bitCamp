package kr.co.bit;

public class StringTest2 {

	public static void main(String[] args) {
		String originalString = new String("Java");
		String lastString = originalString.concat("Fighting");
		System.out.println("originalString==lastString:"+(originalString==lastString));
		System.out.println(originalString);
		System.out.println(lastString);
	}
}

// String Ŭ������ �Һ���... ��ü�� �����ϸ� ����� �νĵǱ� ������ �ѹ� ��������� �޸𸮻� �����ϴ� ���ڿ��� ������ �� ����.
// �޼ҵ带 ����ؼ�(contact) ���� ���ڿ��� �����ϰ� �Ǹ� ������ ���ڿ��� �������� ����Ǵ� ���� �ƴϰ� ���ο� ���ڿ��� �����ȴ�.
// contact �޼ҵ�� Ư�� ���ڿ� �ڿ� �Ķ���� ������ ������ ���ڿ��� �����ϴ� �޼ҵ��.