package kr.co.bit2;

public class DaemonExample {
	public static void main(String[] args) throws InterruptedException{
		AutoSaveThread ast = new AutoSaveThread();
		ast.setDaemon(true); // 메인 스레드가 종료되면 해당 스레드가 종료된다
		ast.start();
		Thread.sleep(3000);
		System.out.println("메인 스레드 종료");
	}
}
