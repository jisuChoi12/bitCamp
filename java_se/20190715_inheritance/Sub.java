class Sub extends Parent{
	protected String name;
	protected int age;

	public Sub(String name, int age, double weight, double height){
		super();
		//super(weight,height);
		System.out.println("Sub의 생성자");
		this.name = name;
		this.age = age;
		super.weight = weight;
		super.height = height;
	}

	public void disp(){
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		//System.out.println("몸무게 : "+weight);
		//System.out.println("키 : "+height);
		//disp(); // 자기 클래스에 있는 disp()를 계속 호출
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
