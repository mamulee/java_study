package Console;

import java.io.IOException;
import java.io.InputStream;

public class SystemInEx {

	public static void main(String[] args) throws IOException {

//		System.out.print("입력하세요 ==> ");
//		InputStream is = System.in;
//		char inputChar = (char) is.read();
//		System.out.println("출력: "+inputChar); // 1byte만 읽어와서 아무리 많이 입력해도 1글자만 보임

		// 한글과 같이 2바이트를 필요로 하는 유니코드
//		byte[] byteData = new byte[15];
//		int readByteNo = System.in.read(byteData);
		
		InputStream is = System.in;
		byte[] datas = new byte[100];
		System.out.print("이름: ");
		int nameBytes = is.read(datas); // 홍길동 + 캐리지리턴(13(char 숫자), 1byte) + 라인피드(10, 1byte) (==> 엔터)
		System.out.println(nameBytes);
		String name = new String(datas, 0, nameBytes);
		System.out.println(name);
	}

}
