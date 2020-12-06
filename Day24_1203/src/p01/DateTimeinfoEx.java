package p01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class DateTimeinfoEx {

	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재 날짜 : " + now);

		String strDateTime = now.getYear() + "년";// 누적하는것임
		strDateTime += now.getMonth() + "월";
		strDateTime += now.getDayOfMonth() + "일";
		strDateTime += now.getDayOfWeek() + " ";
		strDateTime += now.getHour () + "시";
		strDateTime += now.getMinute() + "분";
		strDateTime += now.getSecond() + "초";
		strDateTime += now.getNano() + "나노쵸";

		System.out.println(strDateTime);

		LocalDate nowDate = now.toLocalDate();
		if(nowDate.isLeapYear()) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}

		//협정 세계시와 존 오프셋
		ZonedDateTime utcDateTime = ZonedDateTime.now (ZoneId.of("UTC"));
		System.out.println("협정 세계시 : " + utcDateTime);
		ZonedDateTime seoulDateTime = ZonedDateTime.now (ZoneId.of("Asia/Seoul"));
		System.out.println("서울 타임존 : " + seoulDateTime);
		ZoneId seoulZonedID = seoulDateTime.getZone();
		System.out.println("서울 존 아이디 : " + seoulZonedID);
		ZoneOffset seoulZoneOffset = seoulDateTime.getOffset();
		System.out.println("서울 존 오프셋 :" + seoulZoneOffset + "\n");
		
		






	}

}
