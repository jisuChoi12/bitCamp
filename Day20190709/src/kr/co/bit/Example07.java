package kr.co.bit;

import java.util.function.IntBinaryOperator;

public class Example07 {
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		// ���� �޼ҵ� ����
		operator = (x,y) -> Calculator.staticMethod(x, y);
		System.out.println("���1:"+operator.applyAsInt(1, 2));
		
		operator = Calculator :: staticMethod;
		System.out.println("���2:"+operator.applyAsInt(1, 6));
		
		// �ν��Ͻ� �޼ҵ� ����
		Calculator obj = new Calculator();
		operator = (x,y) -> obj.instanceMethod(x, y);
		System.out.println("���3:"+operator.applyAsInt(2, 2));
		
		operator = obj :: instanceMethod;
		System.out.println("���3:"+operator.applyAsInt(2, 3));
	}
}
