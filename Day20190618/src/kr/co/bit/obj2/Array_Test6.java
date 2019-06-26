package kr.co.bit.obj2;

public class Array_Test6 {
	//개선된 for문
	public static void main(String[] args) {
		System.out.println("객체형반복문"); // 숫자의 개념이 필요x
		String names[] = new String[] {"a","b","c","d","e","f"};
		// 객체와 객체일때만
		for(String name:names) { // 배열방에 있는 문자열을 넘겨받아서 sysout
			System.out.println(name);
		}
	}
}
