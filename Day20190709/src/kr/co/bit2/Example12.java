package kr.co.bit2;

import java.util.Arrays;

public class Example12 {
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		
		System.out.println("forEach ���"); //����ó�� �ܰ�
		Arrays.stream(intArr).filter(a -> a%2==0).forEach(n -> System.out.print(n+" "));
		System.out.println();
		
//		System.out.println("peek�� �߸��� ����");
//		Arrays.stream(intArr).filter(a -> a%2==0).peek(n -> System.out.print(n+" ")); //��¾ȵ�: �߰�ó�� �ܰ迡�� �����ϱ� ����
//		System.out.println();
		
		System.out.println("peek ���"); 
		int total = Arrays.stream(intArr).filter(a -> a%2==0).peek(n -> System.out.println(n+" ")).sum();
		System.out.println("����: "+total);
		
	}
}


// forEach ����ó���ܰ�... �ڿ� �����Լ�X
// peek �߰��ĸ��ܰ�... �ڿ� �����Լ�O