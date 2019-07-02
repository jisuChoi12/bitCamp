package kr.co.bit;

import java.util.StringTokenizer;

public class StringTokenizerTest1 {

	public static void main(String[] args) {
		String source = "111-111|서울특별시|강남구|서초동";
		StringTokenizer st = new StringTokenizer(source, "|");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
//		String zip = st.nextToken();
//		String si = st.nextToken();
//		String gu = st.nextToken();
//		String dong = st.nextToken();
//		
//		System.out.println("우편번호:"+zip);
//		System.out.println("시:"+si);
//		System.out.println("구:"+gu);
//		System.out.println("동:"+dong);
	}
}
