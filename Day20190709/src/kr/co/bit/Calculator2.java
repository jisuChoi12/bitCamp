package kr.co.bit;

public class Calculator2 {
	private int memory;

	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) throws InterruptedException { //synchronized �� �ڿ��� �� �����常
		this.memory = memory;
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName()+" : "+this.memory);
	}
}
