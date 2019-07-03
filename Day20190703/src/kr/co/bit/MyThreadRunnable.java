package kr.co.bit;

public class MyThreadRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<=20; i++) {
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(10); // 잠깐동안 하나의 스레드 실행을 멈추고 그동안 다른 스레드를 실행 (번갈아가며 실행) 
				for(int j=1; j<=i; j++) {
					System.out.print("$");
				}
				System.out.println();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		MyThreadRunnable myThread1 = new MyThreadRunnable();
		Thread thread1 = new Thread(myThread1,"myThread1"); // 별도의 생성자*
		thread1.start();
		MyThreadRunnable myThread2 = new MyThreadRunnable();
		Thread thread2 = new Thread(myThread2,"myThread2");
		thread2.start();
				
	}
}

// 메소드 안에서 Thread 클래스의 메소드를 사용하려면 (static)Thread로 불러온다.
// Runnable 인터페이스를 이용해서 스레드를 구현했을때는 스레드 객체를 생성하려면 스레드 클래스에서
// 제공되는 별도의 생성자*를 사용해야한다.