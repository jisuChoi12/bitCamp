package kr.co.bit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorListIterator {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("�౸");
		array.add("�߱�");
		array.add("��");
		array.add("�豸");
		array.add("����");
		
		Iterator<String> iterator = array.iterator();
		
		System.out.println("Iterator�� �̿��� ���");
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+"\t");
		}
		System.out.println();
		
		ListIterator<String> listIterator = array.listIterator();
		
		System.out.println("ListIterator�� �̿��� ������ ���");
		while(listIterator.hasNext()) {
			System.out.print(listIterator.next()+"\t");
		}
		System.out.println();
		System.out.println("ListIterator�� �̿��� �Ĺ��� ���");
		while(listIterator.hasPrevious()) {
			System.out.print(listIterator.previous()+"\t");
		}
	}
}

// Iterator�� ListIterator�� Ư�� �÷����� ��Ҹ� ���������� ������ �� �ְ� �������ִ� �������̽���. 
// Iterator: ���������θ� �̵� ---> .next()
// ListIterator: ������,�Ĺ��� ��� �̵� ---> .next() .previous()
// ListIterator�� List �������̽� Ÿ���� �÷��ǿ����� ��밡��
// while�� �ȿ��� hasNext()�޼ҵ带 ����� array�ȿ� �ִ� �����͵��� ��� �޾ƿ� �� �ִ�. 
// for���� ����ؼ� ����... ��°��� ������ �����Ͱ� ������ Iterator,ListIterator�� �� ȿ����
// for���� 2�� �迭�濡 �ִ� �����͸� �������� ���� 0,1,2�� �迭���� ��� ���İ����Ѵٸ�
// Iterator/ListIterator�� ����ϸ� next()�޼ҵ尡 �ٷ� �� �迭���� ����Ű�� �����̴�.