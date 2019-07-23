class SingleTon{
	private int num = 3;
	private static SingleTon instance = null; // �� �ڽ��� ����Ű�� ��ü
	
	public static SingleTon getInstance(){ // SingleTon Ÿ���� �����ϴ� ����ƽ�Լ�
		if(instance==null){ // �� ó�� �� �ѹ�
			synchronized(SingleTon.class){ // SingleTon Ŭ���� Ÿ�����δ� �� �ϳ� ���� �� ����
				instance = new SingleTon(); // ��ü����
			}
		}
		return instance; // ó�� �ѹ��� �����ϰ�� ��ü�� �����ϴ°� �ƴ϶� �̹� ������� ��ü�� ����
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
