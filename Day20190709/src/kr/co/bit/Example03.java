package kr.co.bit;

import java.util.function.Consumer;

public class Example03 {
	public static void main(String[] args) {
		Consumer<Member> consumerA = m -> System.out.println("consumerA: "+m.getName());
		Consumer<Member> consumerB = m -> System.out.println("consumerB: "+m.getId());
	
		Consumer<Member> consumerAB = consumerA.andThen(consumerB); // consumerA Ω««‡«œ∞Ì consumerB Ω««‡
		consumerAB.accept(new Member("±Ë±Ë±Ë","kim",null));
	}
}
