package kr.co.bit;

public class StringTest3 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Java");
		StringBuffer sb2 = sb1.append("Fighting");
		System.out.println("sb1==sb2:"+(sb1==sb2));
		System.out.println(sb1);
		System.out.println(sb2);
	}
}

// 불변성이 없으므로 메소드를 이용해서(append) 문자열을 변경하면 메모리상에서 문자열이 동적으로 변경된다.

