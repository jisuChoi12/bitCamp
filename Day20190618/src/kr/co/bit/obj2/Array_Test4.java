package kr.co.bit.obj2;

public class Array_Test4 {
	
	public static void main(String[] args) {
		// new가 없으면 한쪽의 메모리 공간에서만 작업이 진행됨 stack
		// new가 있으면 메모리 공간이 동적영역인 heap을 카르켜서 그걸 활용  stack과heap
		String cities[] = {"서울","대구","춘천","울산","광주","천안"};
		String nations[] = new String[] {"대한민국","미국","영국","일본","프랑스"};
		//배열값 출력
		for(int i=0; i<cities.length; i++) {
			System.out.println("cities["+i+"]="+cities[i]);
		}
		for(int i=0; i<nations.length; i++) {
			System.out.println("nations["+i+"]="+nations[i]);
		}
	}
}
