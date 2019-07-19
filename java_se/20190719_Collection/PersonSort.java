import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;


class PersonSort {
	public static void main(String[] args) {
		String[] strarr = {"orange","apple","banana","pear","peach","applemango"};
		Arrays.sort(strarr);
		for(String data : strarr){
			System.out.print(data+"\t");
		}
		System.out.println();

		PersonDTO aa = new PersonDTO("aaa",25);
		PersonDTO bb = new PersonDTO("bbb",30);
		PersonDTO cc = new PersonDTO("ccc",32);

		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);


		Collections.sort(list);
		// Comporable 기본 정렬기준을 구현
		System.out.println("나이로 정렬: "+list); // 나이로 오름차순 내림차순

		//------------------------------------------------------------

		// Comparator 기본 정렬기준 외에 다른 기준으로 정렬하고자 할때 사용
		Comparator<PersonDTO> com = new Comparator<PersonDTO>(){ // Comparator은 인터페이스 익명 inner 클래스를 사용
			@Override
			public int compare(PersonDTO p1, PersonDTO p2){
				// String 클래스에는 Comparable<String>가 있으니까
				//return p1.getName().compareTo(p2.getName()); // 오름차순
				return p2.getName().compareTo(p1.getName()); // 내림차순	
				//return p1.getName().compareTo(p2.getName())*1; // 내림차순
			}
		};

		Collections.sort(list, com);
		System.out.println("이름으로 정렬: "+list);
	}
}
