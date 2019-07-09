package kr.co.bit;

public class StatePrintThread extends Thread{
	private Thread targetThread;
	public StatePrintThread(Thread taThread) {
		this.targetThread = targetThread;
	}
	
	@Override
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("Ÿ�� ������ ����: "+state);
			
			if(state==Thread.State.NEW)targetThread.start();
			if(state==Thread.State.TERMINATED) break;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
