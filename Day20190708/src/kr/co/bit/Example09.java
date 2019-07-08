package kr.co.bit;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class Example09 {
	public static void main(String[] args) {
		Consumer<String> con1 = t -> System.out.println(t+"8");
		con1.accept("java");
		
		BiConsumer<String, String> con2 = (t,u) -> System.out.println(t+u);
		con2.accept("java", "8");
		
		DoubleConsumer con3 = d -> System.out.println("java"+d);
		con3.accept(8.0);
		
		ObjIntConsumer<String> con4 = (t,i) -> System.out.println(t+i);
		con4.accept("java", 8);
	}
}

// consumer은 리턴타입이 없으니까 안쪽에서 모든 작업이 끝나는 경우