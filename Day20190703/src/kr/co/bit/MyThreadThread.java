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
	
//	������ Ŭ������ �ִ� start �޼ҵ带 ��� �޾Ƽ� �ڵ������� ���. �ڵ��ʿ�x
//	public void start() {
//		run();
//	}
	
//	������ Ŭ������ ������ �����ϱ�
	@Override
	public void run() {
		for(int i=0; i<=20; i++) {
			try {
				System.out.println(currentThread().getName());
				sleep(10); // ��񵿾� �ϳ��� ������ ������ ���߰� �׵��� �ٸ� �����带 ���� (�����ư��� ����) 
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
//		�ΰ��� ��ü�� ���ÿ� ���� (������ϱ� ����ó��)
		MyThreadThread myThread1 = new MyThreadThread("myThread1");
		myThread1.start();
		MyThreadThread myThread2 = new MyThreadThread("myThread2");
		myThread2.start();
	}
}

// THREAD
// ������� �ڹٿ��� �����ϴ� ��ǥ���� ����߿� �ϳ��� ������ �۾��̳� ���� �ɸ��� �۾��� ������� ������ ó����
// ������ �������� �� �ִ�. Ư�� ��Ʈ��ũ���� ���� ���δ�.
// ������� �ϳ��� ���μ��� �ȿ��� �������� �۾��� ó���ϴ� �ϳ��� ����
// Ŭ���̾�Ʈ �κ��� �ڵ�,���� �κ��� �ڵ�� ����������.
// Ŭ���̾�Ʈ -> ���� | ���� -> Ŭ���̾�Ʈ �� �� �۾��� ������ ������ ó���ϸ� ������ �ΰ��� 
// ���ÿ� �۾��� �����ϴ� ��ó�� ó���� �� �� �ִ�.

// THREAD CLASS�� ��ӹ޾� THREAD �����ϱ�
// ������ Ŭ������ ��ӹ޾� Ŭ������ �����ϸ� �ش� Ŭ���� ��ü�� �����尡 �ȴ�.
// ������ ��ü�� �����Ҷ� �ش� Ŭ������ �����ڸ� ȣ���ؼ� �ٷ� ������ �� �ִ�.
// ������ ��ü�� ������ �� �����Ϸ��� ������ Ŭ������ ���� �Ǿ� �ִ� start�޼ҵ带 ȣ��