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

// Map �������̽��� Ű�� �� ���� ���·� �����͸� �������ִ� �÷��� ��ü��.
// ���� �ߺ��� �� ������ Ű�� ����� �ߺ��� �� ����.
