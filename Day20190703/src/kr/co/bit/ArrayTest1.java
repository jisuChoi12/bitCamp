package kr.co.bit;

import java.util.ArrayList;

public class ArrayTest1 {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("A"); // ���ڿ� �߰� ����
//		array.add(1); // ���ڿ� �̿ܿ��� �߰� �Ұ���
//		array.add(1.5);
		
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		array1.add(1); // ���� �߰� ����
//		array1.add("A"); // ���� �̿ܿ��� �߰� �Ұ���
//		array1.add(1.5);
		
		
		
//		// ��� ������ Ÿ���� �߰��� ���� ������ �����͸� ������ �� ������ �� �̰� �����ϱ� ���� ���׸��� ���
//		ArrayList array = new ArrayList();
//		array2.add("A");
//		array2.add(1);
//		array2.add(1.5);
		
//		ArrayList array1 = new ArrayList();
//		
//		array1.add("A"); //[0]
//		array1.add("B"); //[1]
//		array1.add("C"); //[2]
//		array1.add("D"); //[3]
//		array1.add("E"); //[4]
//		System.out.println(array1); //[A, B, C, D, E]
//		
//		array1.remove(2); // 2�� �ε��� ��ġ�� �ִ� "C" ����
//		System.out.println(array1); //[A, B, D, E]
//		
//		array1.add(2, "C"); // 2�� �ε��� ��ġ�� �ִ� "C" �߰�
//		System.out.println(array1); //[A, B, C, D, E]
//		
//		array1.add(2, "G"); // 2�� �ε��� ��ġ�� �ִ� "G" �߰�
//		System.out.println(array1); //[A, B, G, C, D, E]
	}

}

//���׸����� ������ Ÿ���� �Ϲ�ȭ�ϴ°��� Ŭ������ �޼ҵ忡�� ����� ���� ������ Ÿ���� ������ �ÿ� �̸� �����ϴ� ���
//�̷��� ������ �ÿ� �̸� Ÿ�԰˻�(type check)�� �����ϸ� ���Ǵ� ��ü�� Ÿ�� �������� �������� ��ȯ���� ����
//Ÿ�� ��ȯ �� Ÿ�� �˻翡 ���� ����� �پ���.
