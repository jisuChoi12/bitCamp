package kr.co.bit;

public class ChildMethosCall {

	public static void main(String[] args) {
		Student student = new Student();
		Person person = student;
//		Person person = new Student(); //upCasting-축소
//		person.study(); 에러: 축소가 일어나서 자식객체에 있는 메소드는 사용 불가능 (@Override일 경우 제외)

	}

}
