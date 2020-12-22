package Console;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOutEx {

	public static void main(String[] args) throws IOException, InterruptedException {

		OutputStream os = System.out;

		for(byte b=48; b<58; b++) {
			os.write(b);
		}
		os.write(10); // 줄바꿈

		for(byte b=97; b<123; b++) {
			os.write(b);
			Thread.sleep(100);
			os.flush();
		}
		os.write(10);

		String hangul = "가나다라마바사아자차카타파하";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);

		os.flush();
		os.close();

	}

}
