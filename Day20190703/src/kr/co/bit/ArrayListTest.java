package kr.co.bit;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("한국");
		array.add("미국");
		array.add("중국");
		System.out.println("ArrayList에 요소 추가하고 출력");
		for(int i=0; i<array.size(); i++) {
			System.out.println(array.get(i));
		}
		System.out.println();
		array.remove(0); //인덱스 0 위치에 있는 "한국"
		array.remove("미국"); //"미국"은 인덱스 2위치에 있음
		System.out.println("ArrayList에서 요소 제거하고 출력");
		for(int i=0; i<array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
}

// ArrayList는 List인터페이스에서 뻗어나옴
// 요소를 추가하면 차례대로 0번 인덱스 위치부터 요소가 추가된다.
// ArrayList객체의 중간에 요소를 추가하는 작업도 가능하지만
// 추가되는 요수 뒤의 요소값들이 한 칸 뒤의 위치로 전부 복사되는 작업이 이루어져야 하므로 비효율적이다. (LinkedList가 더 효율적)
// 순차적인 접근/검색/추가/삭제 또는 뒤에서부터 추가/삭제를 실행할때 효과적이다.