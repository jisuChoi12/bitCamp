import java.util.Calendar;
import java.util.Scanner;

class CalendarMain2 {
	private int year;
	private int month;
	private int maxDay;
	private int weekDay;
	Calendar calendar = Calendar.getInstance(); // Calendar생성

	public CalendarMain2(){
		Scanner scan = new Scanner(System.in); 
		System.out.print("년도 입력 : "); 
		year = scan.nextInt();
		System.out.print("월 입력 : ");
		month = scan.nextInt();
	}

	public void calc(){
		calendar.set(year, month-1, 1); //JANUARY(0)~DECEMBER(11) .... 년,월,일
		maxDay = calendar.getActualMaximum(calendar.DAY_OF_MONTH); // 28,29(윤년),30,31
		weekDay = calendar.get(calendar.DAY_OF_WEEK); // 매달 1일이 무슨요일
	}

	public void display(){
		System.out.println("[ "+month+"월 ]");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		
		for(int i=1; i<weekDay; i++) {
			System.out.print("\t"); // 첫줄 빈칸
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

