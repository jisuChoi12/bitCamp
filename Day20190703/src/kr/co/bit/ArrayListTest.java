package kr.co.bit;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("�ѱ�");
		array.add("�̱�");
		array.add("�߱�");
		System.out.println("ArrayList�� ��� �߰��ϰ� ���");
		for(int i=0; i<array.size(); i++) {
			System.out.println(array.get(i));
		}
		System.out.println();
		array.remove(0); //�ε��� 0 ��ġ�� �ִ� "�ѱ�"
		array.remove("�̱�"); //"�̱�"�� �ε��� 2��ġ�� ����
		System.out.println("ArrayList���� ��� �����ϰ� ���");
		for(int i=0; i<array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
}

// ArrayList�� List�������̽����� �����
// ��Ҹ� �߰��ϸ� ���ʴ�� 0�� �ε��� ��ġ���� ��Ұ� �߰��ȴ�.
// ArrayList��ü�� �߰��� ��Ҹ� �߰��ϴ� �۾��� ����������
// �߰��Ǵ� ��� ���� ��Ұ����� �� ĭ ���� ��ġ�� ���� ����Ǵ� �۾��� �̷������ �ϹǷ� ��ȿ�����̴�. (LinkedList�� �� ȿ����)
// �������� ����/�˻�/�߰�/���� �Ǵ� �ڿ������� �߰�/������ �����Ҷ� ȿ�����̴�.