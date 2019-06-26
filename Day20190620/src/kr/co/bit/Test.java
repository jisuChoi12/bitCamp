package kr.co.bit;

public class Test {
	public void printInfo(String ...arg) {
		if(arg.length!=0) {
			for(int i=0; i<arg.length; i++) {
				System.out.println(arg[i]);
			}
		}
	}
	public static void main(String[] args) {
		Test test = new Test();
//		test.printInfo();
		test.printInfo("a");
		test.printInfo("a", "b");
		test.printInfo("a", "b", "c");
	}
}
