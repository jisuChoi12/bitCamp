import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

class CalendarMain {

	public CalendarMain(){
		Date date = new Date(); // ���� �ý����� �ð�
		System.out.println("���� ��¥ : "+date);

		SimpleDateFormat sdf = new SimpleDateFormat("y�� MM�� dd�� E���� HH:mm:ss");
		System.out.println("���� ��¥ : "+sdf.format(date));	
		
		// ���� �ý����� ��¥
		//Calendar calendar = new GregorianCalendar(); //sub class�� ���� ����
		Calendar calendar = Calendar.getInstance(); // method�� ���� ����
		int year = calendar.get(calendar.YEAR);
		int month = calendar.get(calendar.MONTH)+1;
		int day = calendar.get(calendar.DAY_OF_MONTH);
		int week = calendar.get(calendar.DAY_OF_WEEK); // �� �� ȭ...
		String weekDay=null;
		switch(week){
			case 1 : weekDay="�Ͽ���"; break;
			case 2 : weekDay="������"; break;
			case 3 : weekDay="ȭ����"; break;
			case 4 : weekDay="������"; break;
			case 5 : weekDay="�����"; break;
			case 6 : weekDay="�ݿ���"; break;
			case 7 : weekDay="�����"; break;
		}
		//int day = calendar.get(calendar.DATE);
		System.out.println("���� ��¥ : "+year+"�� "+month+"�� "+day+"�� "+weekDay);
	}
	public static void main(String[] args) {
		new CalendarMain();
	}
}
