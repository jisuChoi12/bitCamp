/*
for을 이용하요 합을 구하시오
[실행결과]
-1+2-3+4-5+6-7+8-9+10=5
*/

class ForTest2 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++){
			if(i%2==0){ //짝수
				System.out.print("+"+i);
				sum+=i;
			}
			else{
				System.out.print("-"+i);
				sum-=i;
			}
		}
		System.out.println("="+sum);
	}
}
