import java.util.Scanner;

class ATMTest implements Runnable {
	private long depositeMoney = 100000; // 잔액
	private long balance; // 찾고자 하는 금액

	public static void main(String[] args) {
		ATMTest atm = new ATMTest(); 
		// 스레드 생성
		Thread mom = new Thread(atm, "mom"); // static 에는 this 값이 없다
		Thread son = new Thread(atm, "son"); // 같은 자원
		// 스레드 시작
		mom.start();
		son.start();
	}

	//public synchronized void run(){ // 동기화o
	public void run(){ // 동기화o
		synchronized(this) { // 동기화o mom, son 둘이 같은 주소값을 가지고 있으니까
			Scanner scan = new Scanner(System.in);
			System.out.println(Thread.currentThread().getName()+"님 안녕하세요");
			System.out.print("찾고자 하는 금액: ");
			balance = scan.nextLong();
			withDraw(); // 호출 
		}
	}

	public void withDraw(){

		if(depositeMoney >= balance) {
			if(balance%10000==0){
				depositeMoney -= balance;
				System.out.println("잔액은 "+depositeMoney+"원 입니다.");
			} else {
				System.out.println("만원 단위로 입력하세요");
			}
		} else { System.out.println("잔액 초과"); }
	}
}
