package kr.co.bit2;

import java.util.Arrays;
import java.util.List;

public class Example09 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java8 lambda", "stream mapping");
		list.stream().flatMap(data -> Arrays.stream(data.split(" "))).forEach(word -> System.out.println(word));
		
		List<String> list2 = Arrays.asList("10, 20, 30","40, 50, 60");
		list2.stream().flatMapToInt( data -> {
				String[] strArr = data.split(",");
				int[] intArr = new int[strArr.length];
				for (int i = 0; i < intArr.length; i++) {
					intArr[i] = Integer.parseInt(strArr[i].trim());
				}
				return Arrays.stream(intArr);
		}).forEach(number -> System.out.println(number));
	}
}	
