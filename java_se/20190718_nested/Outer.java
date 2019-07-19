class Outer {
	private String name;

	public void output(){
		//                        this.
		System.out.println("이름: "+name+" 나이: "+new Inner().age);
	}

	class Inner {
		private int age;

		public void disp(){
			//						 Outer.this     this.
			System.out.println("이름: "+name+" 나이: "+age);
		}
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		
		outer.name = "aaa";
		//outer.age = 25; -> x
		outer.output();

		Outer.Inner inner1 = outer.new Inner();
		// inner.name = "bbb"; -> x (클래스영역 안에서만 가능/여긴 static영역이니까x)
		inner1.age = 25;
		inner1.disp();

		// 중첩inner
		Outer.Inner inner2 = outer.new Inner();
		inner2.age = 30;
		inner2.disp();

		//-----------------------------------------------------

		Outer.Inner inner3 = new Outer().new Inner();
		// Outer클래스의 name에 접근 x
		inner3.age = 35;
		inner3.disp();
	}
}


// Outer.java
// Outer.class
// Outer$Inner.class