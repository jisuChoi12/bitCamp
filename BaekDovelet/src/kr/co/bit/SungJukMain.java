package kr.co.bit;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/*
�������� ���α׷�

1. ��ȣ, �̸�, ����, ����, ���������� �Է��Ͽ� ������ ����� ���Ͻÿ�
2. �� ��ɿ� ���� 3���� Ŭ������ ������ �ۼ��Ͻÿ�
     SungJukDTO.java
     SungJukAction.java
     SungJukMain.java
3.����� �Ҽ����� 3°�ڸ����� ���
  �Ҽ����� �ڸ����� 0�̸� ������� �ʴ´�
  92.000 �� 92�� ����Ͻÿ�
4. ��ȣ�� �ߺ������ʰ� �Է��Ѵ�

menu()
*****************
   1. �Է�
   2. ���
   3. �˻�
   4. ����
   5. ����
   6. ��
*****************
   ��ȣ : 8
1~6�߿� �����ϼ���

insertArticle()
��ȣ �Է� :
�̸� �Է� :
���� �Է� :
���� �Է� :
���� �Է� :

printArticle()
��ȣ	�̸�	����	����	����	����	���
15		ȫ�浿	90		92		91		xxx		xx.xxx
30		��ġ	85		92		100		xxx		xx.xxx

searchArticle()
�˻� �� �̸� �Է� : �ڳ�
ã���� �ϴ� �̸��� �����ϴ�

�˻� �� �̸� �Է� : ȫ�浿
��ȣ	�̸�	����	����	����	����	���
15		ȫ�浿	90		92		91		xxx		xx.xxx
16		ȫ�浿	89		45		78		xxx		xx.xxx

deleteArticle() - �Ȱ��� �̸��� ������ ��� ����
���� �� �̸� �Է� : ȫ�浿
�����͸� �����Ͽ����ϴ�

sortArticle()
1. �̸����� ��������
2. �������� ��������
3. �����޴�
 ��ȣ �Է� : 

*/

class SungJukDTO implements Comparable<SungJukDTO> {
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;

	public SungJukDTO(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getNo() { return no; }

	public String getName() { return name; }

	public int getKor() { return kor; }

	public int getEng() { return eng; }

	public int getMath() { return math; }
	
	public int getTotal() {
		this.total = kor+eng+math;
		return total;
	}
	
	public double getAvg() {
		avg = (double)total/3.0;
		return avg;
	}

	@Override
	public int compareTo(SungJukDTO o) { // ���� ��������
		if(this.total< o.total) { return 1; }
		else if(this.total> o.total) { return -1;}
		else return 0;
	}

	@Override
	public String toString() {
		getTotal();
		getAvg();
		return no + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math
				+ "\t" + total + "\t" + new DecimalFormat("#.###").format(avg);
	}
}

//-------------------------------------------------------------------------------

class SungJukAction {
	private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();
	private SungJukDTO sungJukDTO;
	private Scanner scan = new Scanner(System.in);
	int no;
	String name = null;
	int kor;
	int eng;
	int math;
	int select;
	int total;

	public void menu() {
		while (true) {
			System.out.println();
			System.out.println("********�޴�*********");
			System.out.println("  1. �Է�");
			System.out.println("  2. ���");
			System.out.println("  3. �˻�");
			System.out.println("  4. ����");
			System.out.println("  5. ����");
			System.out.println("  6. ��");
			System.out.println("********************");
			System.out.print("��ȣ: ");
			select = scan.nextInt();
			System.out.println();
			if (select < 1 || select > 6) {
				System.out.println("1~6�߿� �����ϼ���");
			}
			if (select == 1) { insertArticle(); } 
			else if (select == 2) {	printArticle(); } 
			else if (select == 3) {	searchArticle(); }
			else if (select == 4) {	deleteArticle(); } 
			else if (select == 5) { sortArticle();} 
			else if (select == 6) { System.exit(1); }
		}
	}

	public void insertArticle() {
		System.out.println("*******�Է�*******");
		System.out.print("��ȣ �Է�: ");
		no = scan.nextInt();
		System.out.print("�̸� �Է�: ");
		name = scan.next();
		System.out.print("���� �Է�: ");
		kor = scan.nextInt();
		System.out.print("���� �Է�: ");
		eng = scan.nextInt();
		System.out.print("���� �Է�: ");
		math = scan.nextInt();

		sungJukDTO = new SungJukDTO(no, name, kor, eng, math);
		list.add(sungJukDTO);

	}

	public void printArticle() {
		System.out.println("*******���*******");
		System.out.println("��ȣ \t�̸�\t����\t����\t����\t����\t���");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public void searchArticle() {
		int count = 0;
		System.out.println("*******�˻�*******");
		System.out.print("ã�� �̸��� �Է��ϼ���: ");
		name = scan.next();
//		for (int i = 0; i < list.size(); i++) {
//			if(name.equals(list.get(i).getName())) {
//				count++;
//				if(count==1) { System.out.println("��ȣ \t�̸�\t����\t����\t����\t����\t���"); }
//				System.out.println(list.get(i).toString());
//			}
//		}
//		if(count==0) { System.out.println("ã���� �ϴ� �̸��� �����ϴ�"); }
		
		for (SungJukDTO data : list) {
			if(name.equals(data.getName())) {
				count++;
				if(count==1) { System.out.println("��ȣ \t�̸�\t����\t����\t����\t����\t���");	}
				System.out.println(data);
			}
		}
		if(count==0) { System.out.println("ã���� �ϴ� �̸��� �����ϴ�"); }
	}

	public void deleteArticle() {
		int count = 0;
//		int sw = 0;
		System.out.println("*******����*******");
		System.out.print("������ �̸��� �Է��ϼ���: ");
		name = scan.next();
//		for (int i = 0; i < list.size(); i++) {
//			if(name.equals(list.get(i).getName())) {
//				list.remove(i);
//				--i;
//				count++;
//			} 
//		}
//		if(count!=0) { System.out.println("�����͸� �����Ͽ����ϴ�"); }
//		else if(count==0) { System.out.println("�����Ϸ��� �̸��� �����ϴ�"); }
		
		Iterator<SungJukDTO> it = list.iterator();
		while(it.hasNext()) {
			sungJukDTO = it.next();
			if(name.equals(sungJukDTO.getName())) {
				it.remove(); // remove �޼ҵ�� next()�� ȣ���� �����͸� �����Ѵ�
				count++;
//				sw=1;
			}
		}
		if(count!=0) { System.out.println("�����͸� �����Ͽ����ϴ�"); }
		if(count==0) { System.out.println("�����Ϸ��� �̸��� �����ϴ�"); }
//		if(sw==1) { System.out.println("�����͸� �����Ͽ����ϴ�"); }
//		if(sw==0) { System.out.println("�����Ϸ��� �̸��� �����ϴ�"); }
		
	}

	public void sortArticle() {
		while(true){
			System.out.println("*******����*******");
			System.out.println("1. �̸����� ��������");
			System.out.println("2. �������� ��������");
			System.out.println("3. �����޴�");
			System.out.print("��ȣ �Է�: ");
			select = scan.nextInt();
			if(select==1) {
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {
					@Override
					public int compare(SungJukDTO o1, SungJukDTO o2) {
						return o1.getName().compareTo(o2.getName());
					}
				};
				Collections.sort(list, com);
				System.out.println("�̸����� ��������");
//				System.out.println("��ȣ \t�̸�\t����\t����\t����\t����\t���");
//				for (int i = 0; i < list.size(); i++) {
//					System.out.println(list.get(i).toString());
//				}
				printArticle();
			}
			else if (select==2) {
				Collections.sort(list);
				System.out.println("�������� ��������");
//				System.out.println("��ȣ \t�̸�\t����\t����\t����\t����\t���");
//				for (int i = 0; i < list.size(); i++) {
//					System.out.println(list.get(i).toString());
//				}
				printArticle();
			}
			else if(select==3) {
//				return;
				break;
			}			
		}
	}
}

//--------------------------------------------------------------------

class SungJukMain {
	public static void main(String[] args) {
		SungJukAction act = new SungJukAction();
		act.menu();
	}
}
