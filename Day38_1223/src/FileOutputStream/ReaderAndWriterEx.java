package FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderAndWriterEx {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("/Users/hongah/Desktop/Temp/test2.txt");
		int readCharNo;
		char[] cbuf = new char[100];
		while( (readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		
		fr.close();
		
		
	}

}
