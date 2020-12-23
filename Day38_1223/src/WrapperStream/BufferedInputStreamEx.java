package WrapperStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamEx {

	public static void main(String[] args) throws IOException {

		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("/Users/hongah/Desktop/Temp/img1.png");
		start = System.currentTimeMillis();
		while(fis1.read() != -1) { }
		end = System.currentTimeMillis();
		System.out.println("사용하지 않았을 때: "+(end - start) + "ms");
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream("/Users/hongah/Desktop/Temp/img1.png");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while(fis2.read() != -1) { }
		end = System.currentTimeMillis();
		System.out.println("사용했을 때: "+(end - start) + "ms");
		fis2.close();
		
	}

}
