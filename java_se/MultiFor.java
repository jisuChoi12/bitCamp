class MultiFor {
	public static void main(String[] args) {
		for(int a=2; a<=4; a+=2){ // a=2 a=4 두번
			for(int b=1; b<=3; b++){ // b=1 b=2 b=3 세번
				System.out.println("a="+a+" b="+b); // 총 6번
			}
			System.out.println();
		} //for a
	}
}
