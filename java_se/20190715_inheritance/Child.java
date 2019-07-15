class Child extends Parent {
	protected String name;
	protected int age;

	public Child(){
	
	}
	
	public Child(String name, int age, double weight, double height){
		System.out.println("Child�� ������");
		this.name = name;
		this.age = age;
		// super.weight = weight;
		// super.height = height;
		this.weight = weight;
		this.height = height;
	}

	public void output(){
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		//System.out.println("������ : "+weight);
		//System.out.println("Ű : "+height);
		disp(); // Ŭ������ disp()�� ������ Parent Ŭ������ ���� �ش� �޼ҵ带 ã�´�.
	}

	public static void main(String[] args) {
		Child child = new Child("aaa",25,185.3,75.8);
		child.output(); //childŬ������ �޼ҵ�
		System.out.println("-----------------------");
		child.disp(); //parentŬ������ �޼ҵ�
		System.out.println("***********************");
		Parent parent = new Child("bbb",13,153.6,42.7);
		//parent.output(); //���� 
		parent.disp();


	}
}

//�ڽ� Ŭ������ new �����ڷ� �����ڸ� ȣ���ϸ� �θ� Ŭ������ �⺻ �����ڰ� �Բ� ȣ��ȴ�