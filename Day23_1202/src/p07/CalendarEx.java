package p07;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEx {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		System.out.println(now);
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		year = now.get(5);
		System.out.println(year);
		
		int month = now.get(2);
		System.out.println(month+1);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		if(week == Calendar.MONDAY) {
			System.out.println("월");
		}
		else {
			System.out.println("월요일이 아닙니다.");
		}
		
		int am_pm = now.get(Calendar.AM_PM);
		System.out.println(am_pm);
		System.out.println(Calendar.AM_PM);
		System.out.println(Calendar.AM);
		System.out.println(Calendar.PM);

		//오전인지 오후인지 나타내는 프로그램
		if (Calendar.AM == now.get (Calendar.AM_PM))
			System.out.println("오전입니다.");
		else 
			System.out.println("오후입니다.");


		System.out.print(now.get(Calendar.HOUR_OF_DAY)+"시 ");
		System.out.print(now.get(Calendar.MINUTE)+"분 ");
		System.out.println(now.get(Calendar.SECOND)+"초");
		
//		String[] availableDs = TimeZone.getAvailableIDs();
//		for(String id : availableDs) {
//			System.out.println(id);
//		}
		
	}

}
