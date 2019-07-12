class Variable2 {
	int a; // 클래스변수(Field) heap영역, 이미 초기화 된 상태... 출력해면 0이 나온다
	static int b;
	String str;

	public static void main(String[] args){
		int a = 10; // 지역변수(local variable) static영역, 쓰레기값을 가지고 있기 때문에 초기화
//		Variable2 variable2 = new Variable2();
		System.out.println("지역변수 a: "+a);
//		System.out.println("필드 a: "+variable2.a);
		System.out.println("필드 a: "+new Variable2().a); //Variable2 객체 +1
//		System.out.println("필드 b: "+Variable2.b);
		System.out.println("필드 b: "+b); //클래스 소속이기 때문에 굳이 클래스명으로 부를 필요가 없다
		System.out.println("필드 str: "+new Variable2().str); //Variable2 객체 +1
	}
}


