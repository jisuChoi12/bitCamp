class Variable2 {
	int a; // Ŭ��������(Field) heap����, �̹� �ʱ�ȭ �� ����... ����ظ� 0�� ���´�
	static int b;
	String str;

	public static void main(String[] args){
		int a = 10; // ��������(local variable) static����, �����Ⱚ�� ������ �ֱ� ������ �ʱ�ȭ
//		Variable2 variable2 = new Variable2();
		System.out.println("�������� a: "+a);
//		System.out.println("�ʵ� a: "+variable2.a);
		System.out.println("�ʵ� a: "+new Variable2().a); //Variable2 ��ü +1
//		System.out.println("�ʵ� b: "+Variable2.b);
		System.out.println("�ʵ� b: "+b); //Ŭ���� �Ҽ��̱� ������ ���� Ŭ���������� �θ� �ʿ䰡 ����
		System.out.println("�ʵ� str: "+new Variable2().str); //Variable2 ��ü +1
	}
}


