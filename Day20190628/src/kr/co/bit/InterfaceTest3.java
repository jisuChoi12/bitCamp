package kr.co.bit;

interface In1{
	int x=10;
	public abstract void in1Method();
}

interface In2{
	int x=20;
	public abstract void in1Method();
	public abstract void in2Method();
}

interface In3 extends In1,In2{
}

class ExtendsTest extends Object implements In3{
	@Override
	public void in1Method() {
		System.out.println("in1Method");
	}

	@Override
	public void in2Method() {
		System.out.println("in2Method");
	}
}

public class InterfaceTest3 {
	public static void main(String[] args) {
		ExtendsTest et = new ExtendsTest();
		et.in1Method();
		et.in2Method();
//		System.out.println(et.x); ¸ðÈ£¼º
		System.out.println("In1.x="+In1.x);
		System.out.println("In2.x="+In2.x);
	}
}
