package kr.co.bit;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendaTest {

	public static void main(String[] args) {
		Calendar myCalendar = Calendar.getInstance(); //getInstance()로 만들어진 객체를 가지고 오기만 한다
		//값설정 (설정 안하면 현재시간)
		myCalendar.set(Calendar.YEAR, 2019);
		myCalendar.set(Calendar.MONTH, 6);
		myCalendar.set(Calendar.DAY_OF_MONTH, 2);
		myCalendar.set(Calendar.HOUR_OF_DAY, 12);
		myCalendar.set(Calendar.MINUTE, 15);
		myCalendar.set(Calendar.SECOND, 30);
		//출력형식 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
		Date date = myCalendar.getTime();
		DateFormat df = DateFormat.getDateTimeInstance();
		//출력
		System.out.println(sdf.format(date));
		System.out.println(df.format(date));		
	}
}
