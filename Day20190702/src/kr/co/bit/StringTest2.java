package kr.co.bit;

public class StringTest2 {

	public static void main(String[] args) {
		String originalString = new String("Java");
		String lastString = originalString.concat("Fighting");
		System.out.println("originalString==lastString:"+(originalString==lastString));
		System.out.println(originalString);
		System.out.println(lastString);
	}
}

// String 클래스의 불변성... 객체를 생성하면 상수로 인식되기 때문에 한번 만들어지면 메모리상에 존재하는 문자열을 변경할 수 없다.
// 메소드를 사용해서(contact) 기존 문자열을 변경하게 되면 기존의 문자열이 동적으로 변경되는 것이 아니고 새로운 문자열이 생성된다.
// contact 메소드는 특정 문자열 뒤에 파라미터 값으로 지정한 문자열을 연결하는 메소드다.