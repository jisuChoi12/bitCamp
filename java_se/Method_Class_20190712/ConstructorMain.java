class ConstructorMain {
	private String name;
	private int age;

	ConstructorMain(){
		System.out.println("default ������");	
		//name = "aaa";
		//age = 24;
	}

	ConstructorMain(String name){
		System.out.println("this : "+this);
		this.name = name;
	}

	ConstructorMain(int age){
		this("aaa"); //�����ε� �� �ٸ� �����ڸ� ȣ��
		System.out.println("this : "+this);
		this.age = age;
		
		
	}

	public static void main(String[] args) {
		ConstructorMain cm1 = new ConstructorMain();
		System.out.println("�̸� : "+cm1.name+" ���� : "+cm1.age);	
		System.out.println();

		ConstructorMain cm2 = new ConstructorMain("bbb");
		System.out.println("cm2 : "+cm2);
		System.out.println("�̸� : "+cm2.name+" ���� : "+cm2.age);
		System.out.println();

		ConstructorMain cm3 = new ConstructorMain(25);
		System.out.println("cm3 : "+cm3);
		System.out.println("�̸� : "+cm3.name+" ���� : "+cm3.age);
		System.out.println();
	}
}


/*
������ 
1. Ŭ������� ����
2. ����Ÿ���� ����
3. �����ڰ� ������ �ڵ����� defualt �����ڰ� ȣ��ȴ�
*/

// �����ڳ����� ����ȣ�� ����
// �����ε� �� ������ ������ ȣ���� ����