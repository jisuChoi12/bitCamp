package kr.co.bit2;

public class AutoSaveThread extends Thread{
	public void save() {System.out.println("�۾� ������ ������.");}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000); // 1�� ������
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
			save();
		}
	}
}
