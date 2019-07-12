//import java.io.IOException;

class InputTest2 {
	public static void main(String[] args) throws java.io.IOException {
		System.out.print("문자 입력 : ");
		int data = System.in.read(); // read()는 enter, space값도 읽음 플러쉬 필요
		System.in.read(); //\r 플러쉬 기능
		System.in.read(); //\n 플러쉬 기능
		System.out.print("문자 입력 : ");
		int data2 = System.in.read();
		System.out.println(data+", "+data2);
	}
}

// 엔터 -> \r\n