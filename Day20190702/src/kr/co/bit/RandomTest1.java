package kr.co.bit;

import java.util.Random;

public class RandomTest1 {

	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(random.nextInt(101));
		System.out.println(random.nextInt(51));
		System.out.println(random.nextInt(21));
		System.out.println(random.nextInt());
		System.out.println(random.nextFloat());
		System.out.println(random.nextBoolean());
	}
}
