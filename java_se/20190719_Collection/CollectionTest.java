import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class CollectionTest {
	// ���� 
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//�������̽�             ����Ŭ����
		Collection coll = new ArrayList(); // upcasting
		// ���׸�
		//Collection<Object> coll = new ArrayList<Object>(); // ArrayList list = new ArrayList(); -> ������ 
		coll.add("a"); 
		coll.add("b");
		coll.add("c");
		coll.add(1.12);
		coll.add(8);
		coll.add("a"); // �ߺ����,�������
		coll.add("d");

		// Collection���� get�޼ҵ尡 ���� ��� iterator
		Iterator it = coll.iterator(); // �������̽��� �Լ��� ���ؼ� ���� 
		while(it.hasNext()){ // ������ ���� �׸��� ������ true ������ false
			System.out.println(it.next()); // �׸��� ������ �������� �̵�
		}
	}
}
