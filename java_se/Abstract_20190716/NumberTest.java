import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

class NumberTest {
	public NumberTest(){
		// sub class를 이용한 생성
		NumberFormat nf1 = new DecimalFormat();// abstract class(부모) = sub class(자식) -> 다형성
		// 3자리마다 , 소수점 이하 3번째 자리까지
		System.out.println(nf1.format(12345678.456789));
		System.out.println(nf1.format(12345678));
		System.out.println();
		
		NumberFormat nf2 = new DecimalFormat("#,###.#원");
		// 3자리마다 , 소수점 이하 1번째 자리까지 출력 유효숫자가 아닌것은 표시X
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();

		NumberFormat nf3 = new DecimalFormat("#,###.0원");
		// 3자리마다 , 소수점 이하 1번째 자리까지 출력 0을 강제로 표시
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();

		/*
		// 메소드를 이용한 생성
		NumberFormat nf4 = NumberFormat.getInstance(); 
		nf4.setMaximumFractionDigits(1); // 소수점 이하 1번째 자리까지 출력
		nf4.setMinimumFractionDigits(1); // 0을 강제로 표시
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();
		*/

		NumberFormat nf4 = NumberFormat.getCurrencyInstance(); // ￦ 원
		nf4.setMaximumFractionDigits(1); // 소수점 이하 1번째 자리까지 출력
		nf4.setMinimumFractionDigits(1); // 0을 강제로 표시
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();

		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US); // $ 달러 
		nf4.setMaximumFractionDigits(1); // 소수점 이하 1번째 자리까지 출력
		nf4.setMinimumFractionDigits(1); // 0을 강제로 표시
		System.out.println(nf5.format(12345678.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();

	} 

	public static void main(String[] args) {
		NumberTest nt = new NumberTest();
		//new NumberTest(); // 단발성, 실행과 동시에 JVM이 제거함(gc)
	}
}


//				#,###.##		#,###.00
// 1234.567		1,234.57		1,234.57
// 1234			1,234			1,234.00