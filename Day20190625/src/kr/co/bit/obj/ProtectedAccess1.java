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
//		pd.protectedVar=60; ����: ���� �ٸ� ��Ű���� �ֱ� ������ main���� protected ���������ڷ� ����� ������ ���Ұ�
		ProtectedAccess2 pa2 = new ProtectedAccess2();
		System.out.println(pa2.toString());
	}
}

