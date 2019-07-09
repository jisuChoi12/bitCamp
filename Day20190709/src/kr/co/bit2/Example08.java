package kr.co.bit2;

import java.util.Arrays;
import java.util.List;

public class Example08 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("³²µµÇü", "Á¤À¯¹Ì", "Á¶¿¬¿ì", "Á¤ÀçÇå", "±è¿¬¿ì", "Á¤À¯¹Ì");
		
		names.stream().distinct().forEach(e -> System.out.println(e));
		System.out.println();
		
		names.stream().filter(e -> e.startsWith("±è")).forEach(e -> System.out.println(e));
		System.out.println();
		
		names.stream().filter(e -> e.endsWith("Çå")).forEach(e -> System.out.println(e));
		System.out.println();
	}
}
