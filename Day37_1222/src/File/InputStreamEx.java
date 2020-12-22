package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {

	public static void main(String[] args) throws IOException {

		InputStream is = new FileInputStream("/Users/hongah/Desktop/Temp/test1.txt");

		// 1 바이트씩 읽어옴, 영어만 가능 한글은 깨짐 (2바이트라)
		//		int readByte;
		//		while(true) {
		//			readByte = is.read();
		//			if(readByte == -1) break;
		//			System.out.print((char)readByte);
		//		}
		//		is.close();

		// 한글을 읽으려면 배열 사용 
		//		int readByteNo;
		//		byte[] readBytes = new byte[10];
		//		String data = "";
		//		
		//		while(true) {
		//			readByteNo = is.read(readBytes);
		//			if(readByteNo == -1) break;
		//			data += new String(readBytes, 0, readByteNo);
		//		}
		//		System.out.println(data);
		//		is.close();

		int readByteNo;
		byte [] readBytes = new byte [8];
		readByteNo = is.read(readBytes,2,3); 
		for(int i=0; i<readBytes.length; i++) {
			System.out.print((char)readBytes[i]);
		}
		System.out.println();
		is.close();
	}

}
