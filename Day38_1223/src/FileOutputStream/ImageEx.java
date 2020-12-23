package FileOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageEx {

	public static void main(String[] args) throws IOException {

		String originalFileName = "/Users/hongah/Desktop/Temp/img1.png";
		String targetFileName = "/Users/hongah/Desktop/Temp/copyImg1.png";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while ((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
	
		
		
		
	}

}
