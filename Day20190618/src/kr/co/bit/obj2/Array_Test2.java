package kr.co.bit.obj2;

public class Array_Test2 {
	public static void main(String[] args) {
		//배열선언
		int arrayNum[];
		String names[];
		//배열객체생성
		arrayNum = new int[3];
		names = new String[3];
		//초기화
		arrayNum[0]=1;
		arrayNum[1]=2;
		arrayNum[2]=3;
		names[0]="홍길동";
		names[1]="전우치";
		names[2]="윤종혁";
		//값 출력
		for(int i=0; i<3; i++) {
			System.out.println("arrayNum["+i+"]="+arrayNum[i]);
			System.out.println("names["+i+"]="+names[i]);
		}
	}	
}

