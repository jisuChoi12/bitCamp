package kr.co.bit2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example04 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("�����", "������", "�ں���", "�ջ���", "�����");
		
//		����ó��
		Stream<String> stream = list.stream();
		stream.forEach(Example04 :: print);
		System.out.println();
//		����ó�� - ���� �������� ����ó��
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(Example04 :: print);
	}
	
	public static void print(String str) {
		System.out.println(str + " : "+Thread.currentThread().getName());
	}
}
