package kr.co.bit.obj2;

import java.util.ArrayList;

// ���ȣ�迭�� �÷��� Ŭ����(ArrayList)
// �÷��� Ŭ������ ������ �޼ҵ� �߽�
public class Array_Test1 {

	public static void main(String[] args) {
		
		
		/* ���ڿ� �迭
		 * String[] ar = new String[3]; ar[0]="�ȳ��ϼ���"; ar[1]="�����մϴ�"; ar[2]="�п��Դϴ�";
		 * for(int i=0; i<ar.length; i++) { System.out.println(ar[i]); }
		 * //System.out.println(ar[0]); //System.out.println(ar[1]);
		 * //System.out.println(ar[2]);
		 */		
		
		// ���� �迭
		int[] num;
		num = new int[3]; 
		num[0]=10;
		num[1]=20;
		num[2]=30;
		for(int i=0; i<num.length; i++) { //�����϶� length
			System.out.println(num[i]);
		}
		//System.out.println(num[0]);
		//System.out.println(num[1]);
		//System.out.println(num[2]);
		
		
		/* �̷������� �ϸ�x <>�� ����� ����ȭ �ؾ���
		 * ArrayList list = new ArrayList(); list.add("���ڿ�"); list.add(1);
		 * list.add(1.5);
		 */
		
		// �����Ͱ� �����¸�ŭ ������ �ڵ����� ���� ����. �������� ����
		// ������ Ȯ���� �� �̸�<>�ȿ� Ÿ���� ����ȭ�ؼ� �����Ȱ� �ܿ��� ���� ���ϰ� �Ѵ�.		
		ArrayList<Integer> numList = new ArrayList<Integer>(); // <>�ȿ��� Ŭ������ �´�. �⺻���� �ȵ�
		numList.add(10);
		numList.add(20);
		numList.add(30);
		for(int i=0; i<numList.size(); i++) { //�Լ��϶� size 
			System.out.println(numList.get(i));
		}
		//System.out.println(numList.get(0));
		//System.out.println(numList.get(1));
		//System.out.println(numList.get(2));
	}

}
