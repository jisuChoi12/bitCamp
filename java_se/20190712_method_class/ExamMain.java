/*
5문제를 채점하는 프로그램 (4지선다)
필드 : name
	 dap 
	 ox[]
	 score
	 public static final JUNG = "11111";
메소드 : 생성자 - Scanner
	   comp() - 맞았다/클렸다
	   getter()
[실행결과]
이름 입력 : aaa (name)
답안지 입력 : 11321 (dap)

이름 : 1 2 3 4 5 점수
aaa  o o x x o  60
-----------------------

객체배열이용

인원수 입력 : 2

이름 입력: aaa
답안지 입력 : 11221
이름 : 1 2 3 4 5 점수
aaa  o o x x o  60

이름 입력: bbb
답안지 입력 : 11111
이름 : 1 2 3 4 5 점수
bbb  o o o o o  100

*/
import java.util.Scanner;

class Exam{
	private String name;
	private String dap;
	private int person;
	private char[] ox;
	private int score;
	public static final String JUNGDAP = "11111";

	public Exam(){ //생성자 함수
		ox = new char[5]; 
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		name = scan.next();
		System.out.print("답안지 입력 : ");
		dap = scan.next();
	}

	public void comp(){
		score = 0; // 점수 초기화
		for(int i=0; i<dap.length(); i++){ // 답 체크
			if(dap.charAt(i)==JUNGDAP.charAt(i)){
				ox[i] = 'o'; 
				score += 20;
			}else{
				ox[i] = 'x';
			}
		}
	}

	public String getName(){
		return name;
	}

	public int getScore(){
		return score;
	}

	public char[] getOX(){
		return ox;
	}
}
//---------------------------------------------------------
class ExamMain {
	public static void main(String[] args) {
		String scr = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("인원수 입력 : ");
		int person = scan.nextInt();
		
		Exam[] exam = new Exam[person]; //객체 배열 생성
		
		for (int i = 0; i < exam.length; i++) { //배열 길이 만큼 반복
			scr="";
			exam[i] = new Exam(); // i번째 객체 배열방의 객체 생성
			exam[i].comp(); 
			
			for (int j = 0; j < exam[i].getOX().length; j++) { // 각각의 객체에 있는 ox배열의 o/x결과값 가져오기
				scr += exam[i].getOX()[j]+"\t"; 
			}
			
		}

		System.out.println("이름\t1\t2\t3\t4\t5\t점수");
		for (int j = 0; j < exam.length; j++) { // 각각의 객체에서 결과값 가져오기
			System.out.println(exam[j].getName()+"\t"+scr+exam[j].getScore());
		}
	}
}