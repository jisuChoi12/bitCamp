package kr.co.bit;

import java.util.function.IntSupplier;

public class Example10 {
	public static void main(String[] args) {
		IntSupplier is1 = () -> (int)(Math.random()*6)+1;
		System.out.println("´«ÀÇ ¼ö: "+ is1.getAsInt());
	}
}
