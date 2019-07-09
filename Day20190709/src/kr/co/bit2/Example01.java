package kr.co.bit2;

public class Example01 {
	public static void main(String[] args) {
		WorkObject shareObj = new WorkObject();
		
		ThreadA tha = new ThreadA(shareObj);
		ThreadB thb = new ThreadB(shareObj);
		
		tha.start();
		thb.start();
	}
}

// stop() interrupt()는 되도록 사용X