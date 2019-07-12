class Person {
	//String name;
	private String name;
	private int age;

	//구현
	public void setAge(int a){
		age = a;
	}

	public void setName(String n){ 
		name = n;
	}

	public void setData(){} // 오버로드

	public void setData(String n, int a){ // 오버로드
		name = n;
		age = a;
	}
	
	public int getAge(){
		return age;
	}

	public String getName(){
		return name;
	}
}
//-------------------------------------------------------------------------------------
class PersonMain{
	public static void main(String[] args){
		Person aa = new Person(); //객체 aa는 클래스 Person의 참조값을 가지고 있다
		System.out.println("객체 aa = "+aa); // Person@7852e922
		System.out.println("객체 aa = "+aa.toString()); // toString()은 Object가 가진 메소드 (16진수)
		System.out.println("객체 aa = "+aa.hashCode()); // Object소속 (10진수)

		//aa.name = "김김김"; 
		//System.out.println("이름: "+aa.name); 

		//호출
		aa.setName("김김김");
		System.out.println("이름: "+aa.getName());
		aa.setAge(25);
		System.out.println("나이: "+aa.getAge());
		System.out.println();

		//------------------------------------------------------------------------------
		Person bb = new Person(); //객체 bb는 클래스 Person의 참조값을 가지고 있다.
		System.out.println("객체 bb = "+bb); // Person@4e25154f
		bb.setName("이이이");
		System.out.println("이름: "+bb.getName());
		bb.setAge(28);
		System.out.println("나이: "+bb.getAge());
		System.out.println();

		//------------------------------------------------------------------------------
		Person cc = new Person();
		cc.setData("최최최",32);
		System.out.println("이름: "+cc.getName());
		System.out.println("나이: "+cc.getAge());
		System.out.println();
		
		//------------------------------------------------------------------------------
		Person dd = new Person();
		cc.setData();
		System.out.println("이름: "+cc.getName());
		System.out.println("나이: "+cc.getAge());
		System.out.println();

	}
}



// PersonMain.java
// PersonMain.class //클래스 파일은 클래스당 하나씩
// Person.class

//int aa; // 정수형 변수
//double aa; // 실수형 변수
//Person aa; // 객체

//int[] ar; // 정수형 배열
//Person[] ar // 객체 배열