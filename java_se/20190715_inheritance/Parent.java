class Parent {
	protected double weight, height;

	public Parent(){ //기본생성자
		System.out.println("Parent의 기본생성자");
	}

	Parent(double weight, double height){ //매개변수가 있는 생성자
		this.weight = weight;
		this.height = height;
	}

	public void disp(){
		System.out.println("몸무게 : "+weight);
		System.out.println("키 : "+height);
	}
}
