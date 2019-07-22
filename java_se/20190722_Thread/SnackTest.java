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
		// 스레드 생성
		SnackTest aa = new SnackTest("새우깡"); 
		SnackTest bb = new SnackTest("홈런볼"); 
		SnackTest cc = new SnackTest("포카칩"); 


		// 스레드 이름 변경
		aa.setName("새우깡"); 
		bb.setName("홈런볼");
		cc.setName("포카칩");

		// 우선순위(1~10)
		aa.setPriority(Thread.MIN_PRIORITY);
		bb.setPriority(Thread.MAX_PRIORITY); //bb.setPriority(10); 
		cc.setPriority(Thread.NORM_PRIORITY);

		// 스레드 시작 - (Runnable 상태) 운영체제가 발탁하길 기다림
		aa.start();
		try {
		aa.join(); // 스레드 죽이기 (aa가 끝날때까지 다른 스레드들은 대기상태)
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		bb.start();
		cc.start(); 
	}
}
