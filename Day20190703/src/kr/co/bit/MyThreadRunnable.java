package kr.co.bit;

public class MyThreadRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<=20; i++) {
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(10); // ��񵿾� �ϳ��� ������ ������ ���߰� �׵��� �ٸ� �����带 ���� (�����ư��� ����) 
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
		Thread thread1 = new Thread(myThread1,"myThread1"); // ������ ������*
		thread1.start();
		MyThreadRunnable myThread2 = new MyThreadRunnable();
		Thread thread2 = new Thread(myThread2,"myThread2");
		thread2.start();
				
	}
}

// �޼ҵ� �ȿ��� Thread Ŭ������ �޼ҵ带 ����Ϸ��� (static)Thread�� �ҷ��´�.
// Runnable �������̽��� �̿��ؼ� �����带 ������������ ������ ��ü�� �����Ϸ��� ������ Ŭ��������
// �����Ǵ� ������ ������*�� ����ؾ��Ѵ�.