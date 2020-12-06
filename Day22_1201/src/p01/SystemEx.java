package p01;

import java.io.InputStream;
import java.io.PrintStream;

public class SystemEx {

	public static void main(String[] args) {
		// 필드
		InputStream is = System.in;
		PrintStream ps = System.err;
		PrintStream os = System.out;

		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		System.out.println(osName);
		System.out.println(userName);
		long ct = System.currentTimeMillis();
		long nt = System.nanoTime();
		System.gc(); // 쓰레기 수집 요청
		System.exit(0); // 닫기 
		
	}

}
