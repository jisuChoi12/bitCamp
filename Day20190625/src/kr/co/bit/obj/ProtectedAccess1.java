package kr.co.bit.obj;

import kr.co.bit.ProtectedData;

class ProtectedAccess2 extends ProtectedData{ //
	public ProtectedAccess2() {
		protectedVar = 60;
	}
	@Override
	public String toString() {
		return "ProtectedAccess2 [protectedVar=" + protectedVar + "]";
	} 
}

public class ProtectedAccess1 {
	public static void main(String[] args) {
//		ProtectedData pd = new ProtectedData();
//		pd.protectedVar=60; 에러: 서로 다른 패키지에 있기 때문에 main에서 protected 접근제한자로 선언된 변수는 사용불가
		ProtectedAccess2 pa2 = new ProtectedAccess2();
		System.out.println(pa2.toString());
	}
}

