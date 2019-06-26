package kr.co.bit;

// switch case test
// 삼형식의 구조를 효율적으로 (if, else if, else의 문법을 사용하면 중괄호가 너무 많이 사용됨)

public class Switch_Test1 {

	public static void main(String[] args) {
		
		String job = args[0]; // 시작은 언제나 0번지
		int salary = 0; // 초기값
		
		switch(job) {
		case "사원": // 문자열로 간판달기
			salary = 200000000;  
			break; // switch case에는 언제나 끝에 break를 달아준다
		case "대리":
			salary = 350000000;
			break; 
		case "과장":
			salary = 500000000;
			break;
		case "부장":
			salary = 800000000;
			break; // break가 없으면 순차적으로 실행되기 때문에 마지막 결과값이 저장되어 출력됨
		default:
			System.out.println("사원, 대리, 과장, 부장 중 입력하세요");
			
		}
		System.out.println("당신의 연봉은 " + salary + "원 입니다.");
	}

}
