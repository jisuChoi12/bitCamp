import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

class NumberTest {
	public NumberTest(){
		// sub class�� �̿��� ����
		NumberFormat nf1 = new DecimalFormat();// abstract class(�θ�) = sub class(�ڽ�) -> ������
		// 3�ڸ����� , �Ҽ��� ���� 3��° �ڸ�����
		System.out.println(nf1.format(12345678.456789));
		System.out.println(nf1.format(12345678));
		System.out.println();
		
		NumberFormat nf2 = new DecimalFormat("#,###.#��");
		// 3�ڸ����� , �Ҽ��� ���� 1��° �ڸ����� ��� ��ȿ���ڰ� �ƴѰ��� ǥ��X
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();

		NumberFormat nf3 = new DecimalFormat("#,###.0��");
		// 3�ڸ����� , �Ҽ��� ���� 1��° �ڸ����� ��� 0�� ������ ǥ��
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();

		/*
		// �޼ҵ带 �̿��� ����
		NumberFormat nf4 = NumberFormat.getInstance(); 
		nf4.setMaximumFractionDigits(1); // �Ҽ��� ���� 1��° �ڸ����� ���
		nf4.setMinimumFractionDigits(1); // 0�� ������ ǥ��
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();
		*/

		NumberFormat nf4 = NumberFormat.getCurrencyInstance(); // �� ��
		nf4.setMaximumFractionDigits(1); // �Ҽ��� ���� 1��° �ڸ����� ���
		nf4.setMinimumFractionDigits(1); // 0�� ������ ǥ��
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();

		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US); // $ �޷� 
		nf4.setMaximumFractionDigits(1); // �Ҽ��� ���� 1��° �ڸ����� ���
		nf4.setMinimumFractionDigits(1); // 0�� ������ ǥ��
		System.out.println(nf5.format(12345678.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();

	} 

	public static void main(String[] args) {
		NumberTest nt = new NumberTest();
		//new NumberTest(); // �ܹ߼�, ����� ���ÿ� JVM�� ������(gc)
	}
}


//				#,###.##		#,###.00
// 1234.567		1,234.57		1,234.57
// 1234			1,234			1,234.00