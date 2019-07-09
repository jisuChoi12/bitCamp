package kr.co.bit2;

public class WorkObject {
	public synchronized void methodA() throws InterruptedException {
		System.out.println("ThreadA의 methodA() 작업실행"); 
		notify(); // 일시정지 상태의 스레드를 실행 상태로
		wait(); // 실행 상태의 스레드를 일시정지 상태로
	}
	public synchronized void methodB() throws InterruptedException {
		System.out.println("ThreadB의 methodB() 작업실행"); 
		notify(); 
		wait();
	}
}

// notify와 wait가 없으면 methodA와 methodB가 뒤죽박죽으로 실행됨
// notify와 wait 때문에 methodA와 methodB가 번갈아가면서 실행