
// 난수를 100개 발생해서 출력하시오

class ForTest {
	public static void main(String[] args) {
		int count = 0;
		for(int i=1; i<100; i++){
//			int num = (int)(Math.random()*100)+1; //1-100
//			System.out.print(num+" ");
			int num = (int)(Math.random()*25)+65; //65-90 (A-Z)
			System.out.print((char)num+" ");
			if(i%10==0) System.out.println();
			if(num=='A') count++;
		}
		System.out.println();
		System.out.println("A는 총 "+count+"개");
	}
}


// Math.random()....
// new Random....
