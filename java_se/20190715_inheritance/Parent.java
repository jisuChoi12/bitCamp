class Parent {
	protected double weight, height;

	public Parent(){ //�⺻������
		System.out.println("Parent�� �⺻������");
	}

	Parent(double weight, double height){ //�Ű������� �ִ� ������
		this.weight = weight;
		this.height = height;
	}

	public void disp(){
		System.out.println("������ : "+weight);
		System.out.println("Ű : "+height);
	}
}
