package kr.co.bit.obj2;

import java.util.Scanner;

public class Array_Test5 {

	public static void main(String[] args) {
		String names[] = new String[] {"a","b","c","d","e"};
		Scanner input = new Scanner(System.in);
		int index=-1;
		do {
			System.out.println("검색할 이름을 입력하세요.");
			System.out.println("이름:");
			String name = input.next();
			for(int i=0; i<names.length; i++) {
				if(name.equals(names[i])) {
					index=i;
				}
			}
			if(index!=-1) {
				System.out.println(name+"을 배열의 "+index+"인덱스 방에서 찾았습니다.");
				break;
			}
			System.out.println("해당하는 이름이 존재하지 않습니다.");
		}while(true);
	}
}

