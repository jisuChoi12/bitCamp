package kr.co.bit2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Example02 {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2); // 2���� ���� �� �ִ� Thread pool ����
		
		for (int i = 0; i < 10; i++) {
			Runnable runnable = () -> {
				ThreadPoolExecutor tpe = (ThreadPoolExecutor) es;
				int poolSize = tpe.getPoolSize();
				String threadName = Thread.currentThread().getName();
				System.out.println("[�� ������ ����: "+poolSize+"] [�۾� ������ �̸�: "+threadName+"]");
//				int value = Integer.parseInt("");
			};
			es.execute(runnable);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		es.shutdown(); // ��������
	}
}

// newFixedThreadPool(n);
// ���������� ������ ���� n���̻����δ� �����带 ���� �� ����
