package kr.co.bit2;

import java.util.Arrays;
import java.util.List;

public class Example08 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("������", "������", "������", "������", "�迬��", "������");
		
		names.stream().distinct().forEach(e -> System.out.println(e));
		System.out.println();
		
		names.stream().filter(e -> e.startsWith("��")).forEach(e -> System.out.println(e));
		System.out.println();
		
		names.stream().filter(e -> e.endsWith("��")).forEach(e -> System.out.println(e));
		System.out.println();
	}
}
