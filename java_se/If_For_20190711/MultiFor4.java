class MultiFor4 {
	public static void main(String[] args) {
		int m = 2;
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j <= 9; j++) {
				for (int dan = m; dan < m+3; dan++) {
					if(dan==10) break;
					System.out.print(dan+" * "+j+" = "+(dan*j)+"\t");
				}
				System.out.println();
			}
			m+=3;
			System.out.println();
		}
	}
}