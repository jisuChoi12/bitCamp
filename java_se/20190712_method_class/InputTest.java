class InputTest {
	public static void main(String[] args) { 
		// cmd: java InputTest a b c
		//System.out.println("args[0] = "+args[0]);
		//System.out.println("args[1] = "+args[1]);
		//System.out.println("args[2] = "+args[2]);

		for(int i=0; i<args.length; i++){
			System.out.println("args["+i+"]"+" = "+args[i]);
			System.out.println("ù ���� = "+args[i].charAt(0));
			System.out.println("���ڿ� ���� = "+args[i].length());

		}
		System.out.println();

		for(String data : args){
			System.out.println("data = "+ data);
		}
	}
}
