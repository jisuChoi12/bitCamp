package kr.co.bit2;

public class WorkObject {
	public synchronized void methodA() throws InterruptedException {
		System.out.println("ThreadA�� methodA() �۾�����"); 
		notify(); // �Ͻ����� ������ �����带 ���� ���·�
		wait(); // ���� ������ �����带 �Ͻ����� ���·�
	}
	public synchronized void methodB() throws InterruptedException {
		System.out.println("ThreadB�� methodB() �۾�����"); 
		notify(); 
		wait();
	}
}

// notify�� wait�� ������ methodA�� methodB�� ���׹������� �����
// notify�� wait ������ methodA�� methodB�� �����ư��鼭 ����