package kr.co.bit;

public class ProtectedAccess extends ProtectedData {

	public static void main(String[] args) {
		ProtectedData pd = new ProtectedData();
		System.out.println(pd.protectedVar);
		pd.protectedVar = 50;
		System.out.println(pd.protectedVar);		
	}
}
