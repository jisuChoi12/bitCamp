package kr.co.bit;

public class Card {
	String kind;
	int num;
	public Card() {
		kind=null;
		num=0;
	}
	
	public static int width;
	public static int height;
	static {
		width=100;
		height=250;
	}
	
	public void set() {
		int lv=0;
		System.out.println(lv);
		
		//int lv;
		//System.out.println(lv); 지역변수는 초기화를 하지 않으면 사용할 수 없다
	}
	
	public static void main(String[] args) {
		Card card1 = new Card();
		card1.kind="SPADE";
		card1.num=4;
		System.out.print(card1.kind+":"+card1.num+""+" 가로길이:"+Card.width+" 세로길이:"+Card.height);
		
		Card card2 = new Card();
		card2.kind="HEART";
		card2.num=7;
		System.out.println(card2.kind+":"+card2.num+""+" 가로길이:"+Card.width+" 세로길이:"+Card.height);
	}
}
