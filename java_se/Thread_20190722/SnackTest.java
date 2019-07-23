import java.lang.Thread;

class SnackTest extends Thread {
	private String str;

	public SnackTest(String str) {
		this.str = str;
	}

	@Override
	public void run() { 
		for(int i=1; i<=5; i++) {
			System.out.println(str+ "\t i="+i+"\t"+Thread.currentThread());
		}
	}

	public static void main(String[] args) {
		// ������ ����
		SnackTest aa = new SnackTest("�����"); 
		SnackTest bb = new SnackTest("Ȩ����"); 
		SnackTest cc = new SnackTest("��īĨ"); 


		// ������ �̸� ����
		aa.setName("�����"); 
		bb.setName("Ȩ����");
		cc.setName("��īĨ");

		// �켱����(1~10)
		aa.setPriority(Thread.MIN_PRIORITY);
		bb.setPriority(Thread.MAX_PRIORITY); //bb.setPriority(10); 
		cc.setPriority(Thread.NORM_PRIORITY);

		// ������ ���� - (Runnable ����) �ü���� ��Ź�ϱ� ��ٸ�
		aa.start();
		try {
		aa.join(); // ������ ���̱� (aa�� ���������� �ٸ� ��������� ������)
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		bb.start();
		cc.start(); 
	}
}
