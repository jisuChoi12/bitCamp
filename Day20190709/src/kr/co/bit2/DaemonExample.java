package kr.co.bit2;

public class DaemonExample {
	public static void main(String[] args) throws InterruptedException{
		AutoSaveThread ast = new AutoSaveThread();
		ast.setDaemon(true); // ���� �����尡 ����Ǹ� �ش� �����尡 ����ȴ�
		ast.start();
		Thread.sleep(3000);
		System.out.println("���� ������ ����");
	}
}
