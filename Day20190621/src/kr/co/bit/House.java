package kr.co.bit;

public class House {
	public int price;
	public int size;
	public String dong;
	public String Kind;
	
	@Override
	public String toString() {
		return "House [����=" + price + ", ũ��=" + size + ", ��=" + dong + ", ����=" + Kind + "]";
	}
	public House() {
		this(100,32,"���Ǳ�","����Ʈ");
	}
	public House(int price) {
		this(price,32,"���Ǳ�","����Ʈ");
	}
	public House(int price, int size) {
		this(price,size,"���Ǳ�","����Ʈ");
	}
	public House(int price, int size, String dong) {
		this(price,size,dong,"����Ʈ");
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
		House house3 = new House(200000,64,"����");
		System.out.println(house3.toString());
		House house4 = new House(300000,74,"����","����");
		System.out.println(house4.toString());
	}
}
