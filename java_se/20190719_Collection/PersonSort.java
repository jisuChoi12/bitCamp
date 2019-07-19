import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;


class PersonSort {
	public static void main(String[] args) {
		String[] strarr = {"orange","apple","banana","pear","peach","applemango"};
		Arrays.sort(strarr);
		for(String data : strarr){
			System.out.print(data+"\t");
		}
		System.out.println();

		PersonDTO aa = new PersonDTO("aaa",25);
		PersonDTO bb = new PersonDTO("bbb",30);
		PersonDTO cc = new PersonDTO("ccc",32);

		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);


		Collections.sort(list);
		// Comporable �⺻ ���ı����� ����
		System.out.println("���̷� ����: "+list); // ���̷� �������� ��������

		//------------------------------------------------------------

		// Comparator �⺻ ���ı��� �ܿ� �ٸ� �������� �����ϰ��� �Ҷ� ���
		Comparator<PersonDTO> com = new Comparator<PersonDTO>(){ // Comparator�� �������̽� �͸� inner Ŭ������ ���
			@Override
			public int compare(PersonDTO p1, PersonDTO p2){
				// String Ŭ�������� Comparable<String>�� �����ϱ�
				//return p1.getName().compareTo(p2.getName()); // ��������
				return p2.getName().compareTo(p1.getName()); // ��������	
				//return p1.getName().compareTo(p2.getName())*1; // ��������
			}
		};

		Collections.sort(list, com);
		System.out.println("�̸����� ����: "+list);
	}
}
