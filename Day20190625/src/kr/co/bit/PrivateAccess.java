package kr.co.bit;

public class PrivateAccess {
	public static void main(String[] args) {
		PrivateData pd = new PrivateData();
//		System.out.println(pd.privateVar); 에러:접근불가
	}
}
