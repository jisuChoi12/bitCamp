interface InterA {
	public static final String NAME="AAA";
	public int AGE = 25; // static final 생략 가능 - 인터페이스 안에는 상수만 들어가기 때문에
	public abstract void aa(); 
	public void bb(); // abstract 생략 가능 - 인터페이스 안에는 추상메소드만 들어가기 때문에
}
