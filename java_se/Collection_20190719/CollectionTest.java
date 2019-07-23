import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class CollectionTest {
	// 억제 
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//인터페이스             완전클래스
		Collection coll = new ArrayList(); // upcasting
		// 제네릭
		//Collection<Object> coll = new ArrayList<Object>(); // ArrayList list = new ArrayList(); -> 같은거 
		coll.add("a"); 
		coll.add("b");
		coll.add("c");
		coll.add(1.12);
		coll.add(8);
		coll.add("a"); // 중복허용,순서대로
		coll.add("d");

		// Collection에는 get메소드가 없음 대신 iterator
		Iterator it = coll.iterator(); // 인터페이스를 함수를 통해서 생성 
		while(it.hasNext()){ // 지정한 곳에 항목이 있으면 true 없으면 false
			System.out.println(it.next()); // 항목을 꺼내고 다음으로 이동
		}
	}
}
