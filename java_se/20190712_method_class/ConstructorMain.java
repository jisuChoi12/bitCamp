class ConstructorMain {
	private String name;
	private int age;

	ConstructorMain(){
		System.out.println("default 생성자");	
		//name = "aaa";
		//age = 24;
	}

	ConstructorMain(String name){
		System.out.println("this : "+this);
		this.name = name;
	}

	ConstructorMain(int age){
		this("aaa"); //오버로드 된 다른 생성자를 호출
		System.out.println("this : "+this);
		this.age = age;
		
		
	}

	public static void main(String[] args) {
		ConstructorMain cm1 = new ConstructorMain();
		System.out.println("이름 : "+cm1.name+" 나이 : "+cm1.age);	
		System.out.println();

		ConstructorMain cm2 = new ConstructorMain("bbb");
		System.out.println("cm2 : "+cm2);
		System.out.println("이름 : "+cm2.name+" 나이 : "+cm2.age);
		System.out.println();

		ConstructorMain cm3 = new ConstructorMain(25);
		System.out.println("cm3 : "+cm3);
		System.out.println("이름 : "+cm3.name+" 나이 : "+cm3.age);
		System.out.println();
	}
}


/*
생성자 
1. 클래스명과 같다
2. 리턴타입이 없다
3. 생성자가 없으면 자동으로 defualt 생성자가 호출된다
*/

// 생성자끼리는 강제호출 가능
// 오버로드 된 생성자 끼리는 호출이 가능