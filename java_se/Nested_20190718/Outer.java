class Outer {
	private String name;

	public void output(){
		//                        this.
		System.out.println("�̸�: "+name+" ����: "+new Inner().age);
	}

	class Inner {
		private int age;

		public void disp(){
			//						 Outer.this     this.
			System.out.println("�̸�: "+name+" ����: "+age);
		}
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		
		outer.name = "aaa";
		//outer.age = 25; -> x
		outer.output();

		Outer.Inner inner1 = outer.new Inner();
		// inner.name = "bbb"; -> x (Ŭ�������� �ȿ����� ����/���� static�����̴ϱ�x)
		inner1.age = 25;
		inner1.disp();

		// ��øinner
		Outer.Inner inner2 = outer.new Inner();
		inner2.age = 30;
		inner2.disp();

		//-----------------------------------------------------

		Outer.Inner inner3 = new Outer().new Inner();
		// OuterŬ������ name�� ���� x
		inner3.age = 35;
		inner3.disp();
	}
}


// Outer.java
// Outer.class
// Outer$Inner.class