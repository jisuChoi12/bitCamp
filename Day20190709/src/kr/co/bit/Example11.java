package kr.co.bit;

public class Example11 {

	public static void main(String[] args) throws InterruptedException{
		SumThread st = new SumThread();
		st.start();
		
		st.join(); // st��� �������� ���Ḧ ���� �����尡 ��ٸ��� -> ����Ǹ� join�� ��������. join�� �����ؼ� ���� -> st��� �������� �۾����� �ʹ� ������ ���ν����尡 �������
		System.out.println("1~100��: "+st.getSum());
	}

}
