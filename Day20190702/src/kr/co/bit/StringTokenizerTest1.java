package kr.co.bit;

import java.util.StringTokenizer;

public class StringTokenizerTest1 {

	public static void main(String[] args) {
		String source = "111-111|����Ư����|������|���ʵ�";
		StringTokenizer st = new StringTokenizer(source, "|");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
//		String zip = st.nextToken();
//		String si = st.nextToken();
//		String gu = st.nextToken();
//		String dong = st.nextToken();
//		
//		System.out.println("�����ȣ:"+zip);
//		System.out.println("��:"+si);
//		System.out.println("��:"+gu);
//		System.out.println("��:"+dong);
	}
}
