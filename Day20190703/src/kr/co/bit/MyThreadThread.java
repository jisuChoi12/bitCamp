package kr.co.bit;

public class MyThreadThread extends Thread {
	
	public MyThreadThread(String name) {
		super(name);
	}

//	public void run() {
//		for(int i=0; i<5; i++) {
//			System.out.print(i);
//		}
//	}
	
//	스레드 클래스에 있는 start 메소드를 상속 받아서 자동적으로 사용. 코딩필요x
//	public void start() {
//		run();
//	}
	
//	스레드 클래스로 스레드 생성하기
	@Override
	public void run() {
		for(int i=0; i<=20; i++) {
			try {
				System.out.println(currentThread().getName());
				sleep(10); // 잠깐동안 하나의 스레드 실행을 멈추고 그동안 다른 스레드를 실행 (번갈아가며 실행) 
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
//		두개의 객체가 동시에 실행 (스레드니까 병행처리)
		MyThreadThread myThread1 = new MyThreadThread("myThread1");
		myThread1.start();
		MyThreadThread myThread2 = new MyThreadThread("myThread2");
		myThread2.start();
	}
}

// THREAD
// 스레드는 자바에서 제공하는 대표적인 기능중에 하나로 복잡한 작업이나 오래 걸리는 작업을 스레드로 나누어 처리해
// 성능을 향상시켜줄 수 있다. 특히 네트워크에서 많이 쓰인다.
// 스레드는 하나의 프로세스 안에서 실질적인 작업을 처이하는 하나의 단위
// 클라이언트 부분의 코드,서버 부분의 코드로 나누어진다.
// 클라이언트 -> 서버 | 서버 -> 클라이언트 이 두 작업을 스레드 단위로 처리하면 스레드 두개가 
// 동시에 작업을 수행하는 것처럼 처리해 줄 수 있다.

// THREAD CLASS를 상속받아 THREAD 생성하기
// 스레드 클래스를 상속받아 클래스를 정의하면 해당 클래스 자체가 스레드가 된다.
// 스레드 객체를 생성할때 해당 클래스의 생성자를 호출해서 바로 생성할 수 있다.
// 스레드 객체를 생성한 후 실행하려면 스레드 클래스에 정의 되어 있는 start메소드를 호출