package kr.co.bit2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Example02 {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2); // 2개를 받을 수 있는 Thread pool 생성
		
		for (int i = 0; i < 10; i++) {
			Runnable runnable = () -> {
				ThreadPoolExecutor tpe = (ThreadPoolExecutor) es;
				int poolSize = tpe.getPoolSize();
				String threadName = Thread.currentThread().getName();
				System.out.println("[총 스레드 개수: "+poolSize+"] [작업 스레드 이름: "+threadName+"]");
//				int value = Integer.parseInt("");
			};
			es.execute(runnable);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		es.shutdown(); // 완전종료
	}
}

// newFixedThreadPool(n);
// 실질적으로 제한한 개수 n개이상으로는 스레드를 가질 수 없다
