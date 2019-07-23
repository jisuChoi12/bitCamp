class WhileTest {
	public static void main(String[] args) {
		char ch='A';
		int count=0;
		while(ch<='Z'){
			System.out.print(ch);
			count++;
			ch = (char)(ch+1);
			if(count%7==0){
				System.out.println();
			}
		}
	}
}

// A-Z(65-90)를 출력하되 1줄에 7개씩 출력하시오
