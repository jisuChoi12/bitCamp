package kr.co.bit;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/*
성적관리 프로그램

1. 번호, 이름, 국어, 영어, 수학점수를 입력하여 총점과 평균을 구하시오
2. 각 기능에 따라 3개의 클래스로 나누어 작성하시오
     SungJukDTO.java
     SungJukAction.java
     SungJukMain.java
3.평균은 소수이하 3째자리까지 출력
  소수이하 자리값이 0이면 출력하지 않는다
  92.000 → 92로 출력하시오
4. 번호는 중복되지않게 입력한다

menu()
*****************
   1. 입력
   2. 출력
   3. 검색
   4. 삭제
   5. 정렬
   6. 끝
*****************
   번호 : 8
1~6중에 선택하세요

insertArticle()
번호 입력 :
이름 입력 :
국어 입력 :
영어 입력 :
수학 입력 :

printArticle()
번호	이름	국어	영어	수학	총점	평균
15		홍길동	90		92		91		xxx		xx.xxx
30		또치	85		92		100		xxx		xx.xxx

searchArticle()
검색 할 이름 입력 : 코난
찾고자 하는 이름이 없습니다

검색 할 이름 입력 : 홍길동
번호	이름	국어	영어	수학	총점	평균
15		홍길동	90		92		91		xxx		xx.xxx
16		홍길동	89		45		78		xxx		xx.xxx

deleteArticle() - 똑같은 이름이 있으면 모두 삭제
삭제 할 이름 입력 : 홍길동
데이터를 삭제하였습니다

sortArticle()
1. 이름으로 오름차순
2. 총점으로 내림차순
3. 이전메뉴
 번호 입력 : 

*/

class SungJukDTO implements Comparable<SungJukDTO> {
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;

	public SungJukDTO(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getNo() { return no; }

	public String getName() { return name; }

	public int getKor() { return kor; }

	public int getEng() { return eng; }

	public int getMath() { return math; }
	
	public int getTotal() {
		this.total = kor+eng+math;
		return total;
	}
	
	public double getAvg() {
		avg = (double)total/3.0;
		return avg;
	}

	@Override
	public int compareTo(SungJukDTO o) { // 총점 내림차순
		if(this.total< o.total) { return 1; }
		else if(this.total> o.total) { return -1;}
		else return 0;
	}

	@Override
	public String toString() {
		getTotal();
		getAvg();
		return no + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math
				+ "\t" + total + "\t" + new DecimalFormat("#.###").format(avg);
	}
}

//-------------------------------------------------------------------------------

class SungJukAction {
	private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();
	private SungJukDTO sungJukDTO;
	private Scanner scan = new Scanner(System.in);
	int no;
	String name = null;
	int kor;
	int eng;
	int math;
	int select;
	int total;

	public void menu() {
		while (true) {
			System.out.println();
			System.out.println("********메뉴*********");
			System.out.println("  1. 입력");
			System.out.println("  2. 출력");
			System.out.println("  3. 검색");
			System.out.println("  4. 삭제");
			System.out.println("  5. 정렬");
			System.out.println("  6. 끝");
			System.out.println("********************");
			System.out.print("번호: ");
			select = scan.nextInt();
			System.out.println();
			if (select < 1 || select > 6) {
				System.out.println("1~6중에 선택하세요");
			}
			if (select == 1) { insertArticle(); } 
			else if (select == 2) {	printArticle(); } 
			else if (select == 3) {	searchArticle(); }
			else if (select == 4) {	deleteArticle(); } 
			else if (select == 5) { sortArticle();} 
			else if (select == 6) { System.exit(1); }
		}
	}

	public void insertArticle() {
		System.out.println("*******입력*******");
		System.out.print("번호 입력: ");
		no = scan.nextInt();
		System.out.print("이름 입력: ");
		name = scan.next();
		System.out.print("국어 입력: ");
		kor = scan.nextInt();
		System.out.print("영어 입력: ");
		eng = scan.nextInt();
		System.out.print("수학 입력: ");
		math = scan.nextInt();

		sungJukDTO = new SungJukDTO(no, name, kor, eng, math);
		list.add(sungJukDTO);

	}

	public void printArticle() {
		System.out.println("*******출력*******");
		System.out.println("번호 \t이름\t국어\t영어\t수학\t총점\t평균");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public void searchArticle() {
		int count = 0;
		System.out.println("*******검색*******");
		System.out.print("찾을 이름을 입력하세요: ");
		name = scan.next();
//		for (int i = 0; i < list.size(); i++) {
//			if(name.equals(list.get(i).getName())) {
//				count++;
//				if(count==1) { System.out.println("번호 \t이름\t국어\t영어\t수학\t총점\t평균"); }
//				System.out.println(list.get(i).toString());
//			}
//		}
//		if(count==0) { System.out.println("찾고자 하는 이름이 없습니다"); }
		
		for (SungJukDTO data : list) {
			if(name.equals(data.getName())) {
				count++;
				if(count==1) { System.out.println("번호 \t이름\t국어\t영어\t수학\t총점\t평균");	}
				System.out.println(data);
			}
		}
		if(count==0) { System.out.println("찾고자 하는 이름이 없습니다"); }
	}

	public void deleteArticle() {
		int count = 0;
//		int sw = 0;
		System.out.println("*******삭제*******");
		System.out.print("삭제할 이름을 입력하세요: ");
		name = scan.next();
//		for (int i = 0; i < list.size(); i++) {
//			if(name.equals(list.get(i).getName())) {
//				list.remove(i);
//				--i;
//				count++;
//			} 
//		}
//		if(count!=0) { System.out.println("데이터를 삭제하였습니다"); }
//		else if(count==0) { System.out.println("삭제하려는 이름이 없습니다"); }
		
		Iterator<SungJukDTO> it = list.iterator();
		while(it.hasNext()) {
			sungJukDTO = it.next();
			if(name.equals(sungJukDTO.getName())) {
				it.remove(); // remove 메소드는 next()가 호출한 데이터를 삭제한다
				count++;
//				sw=1;
			}
		}
		if(count!=0) { System.out.println("데이터를 삭제하였습니다"); }
		if(count==0) { System.out.println("삭제하려는 이름이 없습니다"); }
//		if(sw==1) { System.out.println("데이터를 삭제하였습니다"); }
//		if(sw==0) { System.out.println("삭제하려는 이름이 없습니다"); }
		
	}

	public void sortArticle() {
		while(true){
			System.out.println("*******정렬*******");
			System.out.println("1. 이름으로 오름차순");
			System.out.println("2. 총점으로 내림차순");
			System.out.println("3. 이전메뉴");
			System.out.print("번호 입력: ");
			select = scan.nextInt();
			if(select==1) {
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {
					@Override
					public int compare(SungJukDTO o1, SungJukDTO o2) {
						return o1.getName().compareTo(o2.getName());
					}
				};
				Collections.sort(list, com);
				System.out.println("이름으로 오름차순");
//				System.out.println("번호 \t이름\t국어\t영어\t수학\t총점\t평균");
//				for (int i = 0; i < list.size(); i++) {
//					System.out.println(list.get(i).toString());
//				}
				printArticle();
			}
			else if (select==2) {
				Collections.sort(list);
				System.out.println("총점으로 내림차순");
//				System.out.println("번호 \t이름\t국어\t영어\t수학\t총점\t평균");
//				for (int i = 0; i < list.size(); i++) {
//					System.out.println(list.get(i).toString());
//				}
				printArticle();
			}
			else if(select==3) {
//				return;
				break;
			}			
		}
	}
}

//--------------------------------------------------------------------

class SungJukMain {
	public static void main(String[] args) {
		SungJukAction act = new SungJukAction();
		act.menu();
	}
}
