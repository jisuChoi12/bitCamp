import java.util.Scanner;

class IfTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		int result=0;
	
		if(ch>='A' && ch<='Z') result = (char)(ch+32);
		else if(ch>='a' && ch<='z') result = (char)(ch-32);
		
		System.out.println((char)result);
	}
}

//대문자 A(65)~Z(90)
//소문자 a(97)~z(120)
//32차이