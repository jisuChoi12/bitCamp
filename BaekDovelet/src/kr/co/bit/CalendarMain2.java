package kr.co.bit;

import java.util.Calendar;
import java.util.Scanner;

class CalendarMain2 {
	private int year;
	private int month;
	private int maxDay;
	private int blankDays;
	Calendar calendar = Calendar.getInstance(); // Calendar����

	public CalendarMain2(){
		Scanner scan = new Scanner(System.in); 
		System.out.print("�⵵ �Է� : "); 
		year = scan.nextInt();
		System.out.print("�� �Է� : ");
		month = scan.nextInt();
	}

	public void calc(){
		calendar.set(year, month-1, 1); //JANUARY(0)~DECEMBER(11)
		maxDay = calendar.getActualMaximum(calendar.DAY_OF_MONTH); // �ش� �޿� ��ĥ���� �ִ��� (������� ����)
		blankDays = calendar.get(calendar.DAY_OF_WEEK)-1; // SUNDAY(1)~SATURDAY(7) ������ ������ �Ͽ��� �׷��� �Ͽ����� ������� 1�̴ϱ� 1 �� ���ֱ�
	}

	public void display(){
		System.out.println("[ "+month+"�� ]");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		for(int i=0; i< blankDays; i++) {
			System.out.print("\t"); // ù�� ��ĭ
		}
		for (int i = 1; i <= maxDay; i++) { // 1�Ϻ��� �ش� ���� ������ ��¥���� ���鼭
			int day = calendar.get(calendar.DAY_OF_MONTH); // �ش� �޿��� �� ���� ��¥�� ��������
			System.out.print(day); 
			calendar.add(calendar.DAY_OF_MONTH, 1); // 1�� ����
			if((blankDays+i)%7==0) {  // 7�ϸ��� �� �ٲ�, ù�ٿ� �� ĭ�� �ִٸ� �װ͵� ����
				System.out.println(); 
			}else {
				System.out.print("\t"); // �ƴ϶�� \t���� ���� ���߱�
			}
		}
	}

	public static void main(String[] args) {
		CalendarMain2 cm = new CalendarMain2();
		cm.calc();
		cm.display();
	}
}





