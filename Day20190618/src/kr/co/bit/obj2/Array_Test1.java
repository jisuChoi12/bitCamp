package kr.co.bit.obj2;

import java.util.ArrayList;

// 대괄호배열과 컬랙션 클래스(ArrayList)
// 컬랙션 클래스는 언제나 메소드 중심
public class Array_Test1 {

	public static void main(String[] args) {
		
		
		/* 문자열 배열
		 * String[] ar = new String[3]; ar[0]="안녕하세요"; ar[1]="감사합니다"; ar[2]="학원입니다";
		 * for(int i=0; i<ar.length; i++) { System.out.println(ar[i]); }
		 * //System.out.println(ar[0]); //System.out.println(ar[1]);
		 * //System.out.println(ar[2]);
		 */		
		
		// 숫자 배열
		int[] num;
		num = new int[3]; 
		num[0]=10;
		num[1]=20;
		num[2]=30;
		for(int i=0; i<num.length; i++) { //변수일때 length
			System.out.println(num[i]);
		}
		//System.out.println(num[0]);
		//System.out.println(num[1]);
		//System.out.println(num[2]);
		
		
		/* 이런식으로 하면x <>을 사용해 고정화 해야함
		 * ArrayList list = new ArrayList(); list.add("문자열"); list.add(1);
		 * list.add(1.5);
		 */
		
		// 데이터가 들어오는만큼 공간을 자동으로 증가 감소. 유지보수 가능
		// 공간을 확보할 때 미리<>안에 타입을 고정화해서 지정된것 외에는 들어가지 못하게 한다.		
		ArrayList<Integer> numList = new ArrayList<Integer>(); // <>안에는 클래스가 온다. 기본형은 안됨
		numList.add(10);
		numList.add(20);
		numList.add(30);
		for(int i=0; i<numList.size(); i++) { //함수일때 size 
			System.out.println(numList.get(i));
		}
		//System.out.println(numList.get(0));
		//System.out.println(numList.get(1));
		//System.out.println(numList.get(2));
	}

}
