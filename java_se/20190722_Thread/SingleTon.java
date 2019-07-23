class SingleTon{
	private int num = 3;
	private static SingleTon instance = null; // 나 자신을 가리키는 객체
	
	public static SingleTon getInstance(){ // SingleTon 타입을 리턴하는 스태틱함수
		if(instance==null){ // 맨 처음 딱 한번
			synchronized(SingleTon.class){ // SingleTon 클래스 타입으로는 딱 하나 들어올 수 있음
				instance = new SingleTon(); // 객체생성
			}
		}
		return instance; // 처음 한번을 제외하고는 객체를 생성하는게 아니라 이미 만들어진 객체를 리턴
	}

	public static void main(String[] args) {
		SingleTon cc = SingleTon.getInstance(); 
		cc.num++;
		System.out.println("cc: "+cc); // cc: SingleTon@7852e922
		System.out.println("num: "+cc.num); // num: 4
		System.out.println();
		SingleTon dd = SingleTon.getInstance(); 
		dd.num++;
		System.out.println("dd: "+dd); // dd: SingleTon@7852e922
		System.out.println("num: "+dd.num); // num: 5
		System.out.println();

		/*
		SingleTon aa = new SingleTon();
		aa.num++;
		System.out.println("aa: "+aa); // aa: SingleTon@7852e922
		System.out.println("num: "+aa.num); // num: 4
		System.out.println();

		SingleTon bb = new SingleTon();
		bb.num++;
		System.out.println("bb: "+bb); // bb: SingleTon@4e25154f
		System.out.println("num: "+bb.num); // num: 4
		System.out.println();
		*/
	}
}
