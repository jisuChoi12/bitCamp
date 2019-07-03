package kr.co.bit;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> hashTest = new HashMap<String, String>();
		hashTest.put("id","abcd");
		hashTest.put("password", "1234");
		System.out.println(hashTest.get("id"));
		System.out.println(hashTest.get("password"));
	}
}

// Map 인터페이스는 키와 값 쌍의 형태로 데이터를 저장해주는 컬랙션 객체다.
// 값은 중복될 수 있지만 키는 절대로 중복될 수 없다.
