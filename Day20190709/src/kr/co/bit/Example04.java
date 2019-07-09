package kr.co.bit;

import java.util.function.Function;

public class Example04 {
	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;
		
		functionA = m -> m.getAddress();
		functionB = m -> m.getCity();
		
		functionAB = functionA.andThen(functionB); // functionA의 뒤쪽 인자와 functionB 앞쪽 인자가 공통이여야한다
		city = functionAB.apply(
				new Member("김김김", "kim", new Address("한국","서울"))
				);
		System.out.println("거주도시: "+city);
	}
}
