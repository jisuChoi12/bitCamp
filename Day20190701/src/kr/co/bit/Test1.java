package kr.co.bit;

import kr.co.bit.obj1.Test;

public class Test1 {
	private String irum;
	
	public Test1() {
//		irum = null;
		irum ="";
	}
	
	public void method1()throws NullPointerException,SpaceException{
		if(irum==null) {
			throw new NullPointerException();		
		}
		if(irum.equals("")) {
			throw new SpaceException("공백에러");
		}
	}
	
	public void method2() {
		throw new NullPointerException();
	}
	
	public void exceptionMethod1() throws Exception{
		throw new ClassNotFoundException();
	}
	
	public void exceptionMethod2() {
		try {
			throw new ClassNotFoundException();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Test1 test = new Test1();
		
		try {
			test.method1();
		} catch (NullPointerException e1) {
			e1.printStackTrace();
		} catch (SpaceException e2) {
			e2.printStackTrace();
		}
	
		try {
			test.exceptionMethod1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		test.exceptionMethod2();
		test.method2();
	}
}
