class Sub extends Parent{
	protected String name;
	protected int age;

	public Sub(String name, int age, double weight, double height){
		super();
		//super(weight,height);
		System.out.println("Sub�� ������");
		this.name = name;
		this.age = age;
		super.weight = weight;
		super.height = height;
	}

	public void disp(){
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		//System.out.println("������ : "+weight);
		//System.out.println("Ű : "+height);
		//disp(); // �ڱ� Ŭ������ �ִ� disp()�� ��� ȣ��
		super.disp();
	}
	public static void main(String[] args) {
		Sub sub = new Sub("aaa",25,185.3,75.8);
		sub.disp();
		System.out.println("***********************");
		Parent parent = new Sub("bbb",13,153.6,42.7);
		parent.disp();

	}
}
