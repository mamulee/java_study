package p01;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeOperationEx {

	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재 날짜 시간 :" + now);

		LocalDateTime targetDateTime = now.plusYears(1)
				.minusMonths(2)
				.plusDays(3)
				.plusHours(4)
				.minusMinutes(5)
				.plusSeconds(6);
		System.out.println("연산 후 : "  +targetDateTime);

		LocalDateTime targetDateTime1 = now.plusYears(10);
		System.out.println("반납해 줄 기간: " + targetDateTime1);
	
		// 이번 해의 첫 일
		LocalDateTime tarDateTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println(tarDateTime);
	
		// 이번 달의 첫 요일
		tarDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.WEDNESDAY));
		System.out.println(tarDateTime);
	
	}

}
