package p06;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {

		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		System.out.println(now);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		SimpleDateFormat sdf1 = new SimpleDateFormat("MMM d일 EEE요일");
		
		String strNow2 = sdf.format(now);
//		String strNow3 = sdf.format(strNow1);
		String strNow3 = sdf1.format(now);
		
		System.out.println(strNow2);
		System.out.println(strNow3);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("365일 중 오늘은 D일째입니다.");
		String strNow4 = sdf2.format(now);
		System.out.println(strNow4);
	}

}
