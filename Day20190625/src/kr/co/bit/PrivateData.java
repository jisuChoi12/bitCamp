package kr.co.bit;

public class PrivateData {
	private int privateVar;
	public PrivateData() {
		privateVar = 10;
	}
	
	public int getPrivateVar() {
		return privateVar;
	}

	public void setPrivateVar(int privateVar) {
		this.privateVar = privateVar;
	}

	public static void main(String[] args) {
		PrivateData privateVar = new PrivateData();
		System.out.println(privateVar.privateVar);
	}
}
