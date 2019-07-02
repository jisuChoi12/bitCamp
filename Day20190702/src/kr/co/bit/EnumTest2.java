package kr.co.bit;

class Student{
	SchoolType school; 
		public Student(SchoolType school) { 
			this.school = school;
		}
}

enum SchoolType{ 
	ELEMENTARY,MIDDLE,HIGH,UNIVERSITY // 순서대로 1,2,3,,,n
}

public class EnumTest2 {
	public static void main(String[] args) {
		Student st = new Student(SchoolType.ELEMENTARY);
		System.out.println("상수를 출력한 경우");
		System.out.println("st.school:"+st.school);
		if(st.school==SchoolType.ELEMENTARY) {
			System.out.println("st.school==Student.ELEMENTARY로 비교했을때");
			System.out.println("당신은 초등학생입니다.");
		}
//		if(st.school==1) { //정수와 직접 비교x
//			System.out.println("st.school==1로 비교했을때");
//			System.out.println("당신은 초등학생입니다.");
//		}
	}
}


// enum은 관련성이 있는 데이터들을 상수처럼 정의해서 사용할 수 있는 단위다.
// 나열형 상수
