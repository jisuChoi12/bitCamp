package kr.co.bit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorListIterator {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("축구");
		array.add("야구");
		array.add("농구");
		array.add("배구");
		array.add("족구");
		
		Iterator<String> iterator = array.iterator();
		
		System.out.println("Iterator을 이용한 출력");
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+"\t");
		}
		System.out.println();
		
		ListIterator<String> listIterator = array.listIterator();
		
		System.out.println("ListIterator을 이용한 전방향 출력");
		while(listIterator.hasNext()) {
			System.out.print(listIterator.next()+"\t");
		}
		System.out.println();
		System.out.println("ListIterator을 이용한 후방향 출력");
		while(listIterator.hasPrevious()) {
			System.out.print(listIterator.previous()+"\t");
		}
	}
}

// Iterator과 ListIterator은 특정 컬렉션의 요소를 순차적으로 접근할 수 있게 지원해주는 인터페이스다. 
// Iterator: 전방향으로만 이동 ---> .next()
// ListIterator: 전방향,후방향 모두 이동 ---> .next() .previous()
// ListIterator은 List 인터페이스 타입의 컬렉션에서만 사용가능
// while문 안에서 hasNext()메소드를 사용해 array안에 있는 데이터들을 모두 받아올 수 있다. 
// for문을 대신해서 쓰임... 출력값은 같지만 데이터가 많을때 Iterator,ListIterator이 더 효과적
// for문이 2번 배열방에 있는 데이터를 가져오기 위해 0,1,2번 배열방을 모두 거쳐가야한다면
// Iterator/ListIterator를 사용하면 next()메소드가 바로 그 배열방을 가리키기 때문이다.