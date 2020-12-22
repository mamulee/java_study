package File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {

	public static void main(String[] args) throws IOException {

		OutputStream os = new FileOutputStream("/Users/hongah/Desktop/Temp/test2.txt");
		byte[] data = "ABCD".getBytes();

		// #1
//		for(int i=0; i<data.length; i++) {
//			os.write(data[i]);
//		}
		
		// #2
//		os.write(data);
		
		// #3
		os.write(data, 0, 2); // 0번 인덱스부터 2개만 (2번까지가 아님)

		os.flush();
		os.close();



	}

}
