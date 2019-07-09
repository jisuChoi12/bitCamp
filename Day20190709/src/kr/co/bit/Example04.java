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
		
		functionAB = functionA.andThen(functionB); // functionA�� ���� ���ڿ� functionB ���� ���ڰ� �����̿����Ѵ�
		city = functionAB.apply(
				new Member("����", "kim", new Address("�ѱ�","����"))
				);
		System.out.println("���ֵ���: "+city);
	}
}
