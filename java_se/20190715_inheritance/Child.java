class Child extends Parent {
	protected String name;
	protected int age;

	public Child(){
	
	}
	
	public Child(String name, int age, double weight, double height){
		System.out.println("Child의 생성자");
		this.name = name;
		this.age = age;
		// super.weight = weight;
		// super.height = height;
		this.weight = weight;
		this.height = height;
	}

	public void output(){
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		//System.out.println("몸무게 : "+weight);
		//System.out.println("키 : "+height);
		disp(); // 클래스에 disp()가 없으면 Parent 클래스로 가서 해당 메소드를 찾는다.
	}

	public static void main(String[] args) {
		Child child = new Child("aaa",25,185.3,75.8);
		child.output(); //child클래스의 메소드
		System.out.println("-----------------------");
		child.disp(); //parent클래스의 메소드
		System.out.println("***********************");
		Parent parent = new Child("bbb",13,153.6,42.7);
		//parent.output(); //에러 
		parent.disp();


	}
}

//자식 클래스로 new 연산자로 생성자를 호출하면 부모 클래스의 기본 생성자가 함께 호출된다