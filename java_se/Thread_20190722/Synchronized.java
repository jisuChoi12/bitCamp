class Synchronized extends Thread{
	private static int count;

	//public synchronized void run() { // 동기화x
	public void run() { 
		//synchronized(this){ 동기화x aa bb cc 각각 다른 주소값을 가지고 있기때문에 
		synchronized(Synchronized.class) {
			for(int i=1; i<=5; i++){
				count++;
				System.out.println(Thread.currentThread().getName()+" : "+count);
				try{
					Thread.sleep(100);
				} catch (InterruptedException e) { e.printStackTrace(); }
			}
		}
	}

	public static void main(String[] args) {
		// 스레드 생성
		Synchronized aa = new Synchronized();
		Synchronized bb = new Synchronized();
		Synchronized cc = new Synchronized();
		// 스레드 이름 
		aa.setName("aa");
		bb.setName("bb");
		cc.setName("cc");
		// 스레드 시작
		aa.start();
		bb.start();
		cc.start();
	}
}