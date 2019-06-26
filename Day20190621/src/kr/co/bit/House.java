package kr.co.bit;

public class House {
	public int price;
	public int size;
	public String dong;
	public String Kind;
	
	@Override
	public String toString() {
		return "House [가격=" + price + ", 크기=" + size + ", 동=" + dong + ", 종류=" + Kind + "]";
	}
	public House() {
		this(100,32,"동판교","아파트");
	}
	public House(int price) {
		this(price,32,"동판교","아파트");
	}
	public House(int price, int size) {
		this(price,size,"동판교","아파트");
	}
	public House(int price, int size, String dong) {
		this(price,size,dong,"아파트");
	}
	public House(int price, int size, String dong, String kind) {
		this.price=price;
		this.size=size;
		this.dong=dong;
		this.Kind=kind;
	}
	public static void main(String[] args) {
		House house1 = new House();
		System.out.println(house1.toString());
		House house2 = new House(100000);
		System.out.println(house2.toString());
		House house3 = new House(200000,64,"서초");
		System.out.println(house3.toString());
		House house4 = new House(300000,74,"서초","빌라");
		System.out.println(house4.toString());
	}
}
