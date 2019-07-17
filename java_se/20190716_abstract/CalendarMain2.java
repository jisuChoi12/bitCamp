import java.util.Calendar;
import java.util.Scanner;

class CalendarMain2 {
	private int year;
	private int month;
	private int maxDay;
	private int weekDay;
	Calendar calendar = Calendar.getInstance(); // Calendar����

	public CalendarMain2(){
		Scanner scan = new Scanner(System.in); 
		System.out.print("�⵵ �Է� : "); 
		year = scan.nextInt();
		System.out.print("�� �Է� : ");
		month = scan.nextInt();
	}

	public void calc(){
		calendar.set(year, month-1, 1); //JANUARY(0)~DECEMBER(11) .... ��,��,��
		maxDay = calendar.getActualMaximum(calendar.DAY_OF_MONTH); // 28,29(����),30,31
		weekDay = calendar.get(calendar.DAY_OF_WEEK); // �Ŵ� 1���� ��������
	}

	public void display(){
		System.out.println("[ "+month+"�� ]");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		
		for(int i=1; i<weekDay; i++) {
			System.out.print("\t"); // ù�� ��ĭ
		}
	
		for (int i = 1; i <= maxDay; i++) { 
			System.out.print(i+"\t"); 
			if(weekDay%7==0) {  
				System.out.println(); 
			}
			weekDay++;
		}
	}

	public static void main(String[] args) {
		CalendarMain2 cm = new CalendarMain2();
		cm.calc();
		cm.display();
	}
}

