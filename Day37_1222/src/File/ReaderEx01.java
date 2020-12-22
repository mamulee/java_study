package File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx01 {

	public static void main(String[] args) throws IOException {

		Reader reader = new FileReader("/Users/hongah/Desktop/Temp/test1.txt");
		int readData;
		
		while(true) {
			readData = reader.read();
			if(readData == -1) break;
			System.out.print((char)readData);
		}
		reader.close();
		
		
	}

}
