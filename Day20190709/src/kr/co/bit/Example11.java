package kr.co.bit;

public class Example11 {

	public static void main(String[] args) throws InterruptedException{
		SumThread st = new SumThread();
		st.start();
		
		st.join(); // st라는 스레드의 종료를 메인 스레드가 기다린다 -> 종료되면 join을 빠져나감. join은 조심해서 쓰기 -> st라는 스레드의 작업량이 너무 많으면 메인스레드가 멈춰버림
		System.out.println("1~100합: "+st.getSum());
	}

}
