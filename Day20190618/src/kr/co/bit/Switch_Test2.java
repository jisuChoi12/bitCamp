package kr.co.bit;

public class Switch_Test2 {

	public static void main(String[] args) {
		
		String operator = "%";
		//String operator = args[0];
		
		// switch��
		switch(operator) {
		case "+":
			System.out.println(5+5);
			break;
		case "-":
			System.out.println(5-5);
			break;
		case "x": case "X":
			System.out.println(5*5);
			break;
		case "/":
			System.out.println(5/5);
			break;
		case "%":
			System.out.println(5%2);
			break;
		default:
			System.out.println("�����ڰ� �����ϴ�.");
		}

	}

}
