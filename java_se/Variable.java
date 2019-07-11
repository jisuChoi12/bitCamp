class Variable {
	public static void main(String[] args){
		boolean a; // 메모리에 1byte
		a = 25>36; // 0
		System.out.println("a="+a);

		char b; // 메모리에 2byte
		b = 'A'; // 0000 0000 0100 0001
		System.out.println("b="+b);

		int c; // 메모리에 4byte
		c = 65; // 0000 0000 0000 0000 0000 0000 0100 0001 
		System.out.println("c="+c);

		int d; 
		d = 'A'; 
		System.out.println("d="+d); // 65

		char e;
		e = 65;
		System.out.println("e="+e); // A

		float f;
		f = 43.8f;
		System.out.println("f="+f);
	}
}