import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

class CalendarMain {

	public CalendarMain(){
		Date date = new Date(); // 현재 시스템의 시간
		System.out.println("오늘 날짜 : "+date);

		SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일 E요일 HH:mm:ss");
		System.out.println("오늘 날짜 : "+sdf.format(date));	
		
		// 현재 시스템의 날짜
		//Calendar calendar = new GregorianCalendar(); //sub class를 통한 생성
		Calendar calendar = Calendar.getInstance(); // method를 통한 생성
		int year = calendar.get(calendar.YEAR);
		int month = calendar.get(calendar.MONTH)+1;
		int day = calendar.get(calendar.DAY_OF_MONTH);
		int week = calendar.get(calendar.DAY_OF_WEEK); // 일 월 화...
		String weekDay=null;
		switch(week){
			case 1 : weekDay="일요일"; break;
			case 2 : weekDay="월요일"; break;
			case 3 : weekDay="화요일"; break;
			case 4 : weekDay="수요일"; break;
			case 5 : weekDay="목요일"; break;
			case 6 : weekDay="금요일"; break;
			case 7 : weekDay="토요일"; break;
		}
		//int day = calendar.get(calendar.DATE);
		System.out.println("오늘 날짜 : "+year+"년 "+month+"월 "+day+"일 "+weekDay);
	}
	public static void main(String[] args) {
		new CalendarMain();
	}
}
