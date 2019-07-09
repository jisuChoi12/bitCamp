package kr.co.bit2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Example03 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
					new Student("±è±è±è",88),
					new Student("ÀÌÀÌÀÌ",85)
				);
		
		Stream<Student> stream = list.stream();
		stream.forEach(s -> System.out.println(s.getName()+"-"+s.getScore()));
		
//		ÀÌÀü¹æ½Ä
//		Iterator<Student> it = list.iterator();
//		while(it.hasNext()) {
//			Student std = it.next();
//			System.out.println(std.getName()+"-"+std.getScore());
	}
}

