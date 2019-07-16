package kr.co.bit;

import java.util.Calendar;
import java.util.Scanner;

class CalendarMain2 {
	private int year;
	private int month;
	private int maxDay;
	private int blankDays;
	Calendar calendar = Calendar.getInstance(); // Calendar생성

	public CalendarMain2(){
		Scanner scan = new Scanner(System.in); 
		System.out.print("년도 입력 : "); 
		year = scan.nextInt();
		System.out.print("월 입력 : ");
		month = scan.nextInt();
	}

	public void calc(){
		calendar.set(year, month-1, 1); //JANUARY(0)~DECEMBER(11)
		maxDay = calendar.getActualMaximum(calendar.DAY_OF_MONTH); // 해당 달에 며칠까지 있는지 (윤년까지 포함)
		blankDays = calendar.get(calendar.DAY_OF_WEEK)-1; // SUNDAY(1)~SATURDAY(7) 한주의 시작은 일요일 그런데 일요일의 상수값이 1이니까 1 씩 빼주기
	}

	public void display(){
		System.out.println("[ "+month+"월 ]");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i=0; i< blankDays; i++) {
			System.out.print("\t"); // 첫줄 빈칸
		}
		for (int i = 1; i <= maxDay; i++) { // 1일부터 해당 달의 마지막 날짜까지 돌면서
			int day = calendar.get(calendar.DAY_OF_MONTH); // 해당 달에서 그 날의 날짜를 가져오고
			System.out.print(day); 
			calendar.add(calendar.DAY_OF_MONTH, 1); // 1씩 증가
			if((blankDays+i)%7==0) {  // 7일마다 줄 바꿈, 첫줄에 빈 칸이 있다면 그것도 포함
				System.out.println(); 
			}else {
				System.out.print("\t"); // 아니라면 \t으로 간격 맞추기
			}
		}
	}

	public static void main(String[] args) {
		CalendarMain2 cm = new CalendarMain2();
		cm.calc();
		cm.display();
	}
}





