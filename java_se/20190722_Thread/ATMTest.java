import java.util.Scanner;

class ATMTest implements Runnable {
	private long depositeMoney = 100000; // �ܾ�
	private long balance; // ã���� �ϴ� �ݾ�

	public static void main(String[] args) {
		ATMTest atm = new ATMTest(); 
		// ������ ����
		Thread mom = new Thread(atm, "mom"); // static ���� this ���� ����
		Thread son = new Thread(atm, "son"); // ���� �ڿ�
		// ������ ����
		mom.start();
		son.start();
	}

	//public synchronized void run(){ // ����ȭo
	public void run(){ // ����ȭo
		synchronized(this) { // ����ȭo mom, son ���� ���� �ּҰ��� ������ �����ϱ�
			Scanner scan = new Scanner(System.in);
			System.out.println(Thread.currentThread().getName()+"�� �ȳ��ϼ���");
			System.out.print("ã���� �ϴ� �ݾ�: ");
			balance = scan.nextLong();
			withDraw(); // ȣ�� 
		}
	}

	public void withDraw(){

		if(depositeMoney >= balance) {
			if(balance%10000==0){
				depositeMoney -= balance;
				System.out.println("�ܾ��� "+depositeMoney+"�� �Դϴ�.");
			} else {
				System.out.println("���� ������ �Է��ϼ���");
			}
		} else { System.out.println("�ܾ� �ʰ�"); }
	}
}
