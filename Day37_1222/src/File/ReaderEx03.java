package File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx03 {

	public static void main(String[] args) throws IOException {

		Reader reader = new FileReader("/Users/hongah/Desktop/Temp/test1.txt");
		int readCharNo;
		char[] cbuf = new char[100]; // char배열 크기만큼만 글자 읽어오기 가능
		readCharNo = reader.read(cbuf, 0, 10);
		for(int i=0; i<cbuf.length; i++) {
			System.out.print(cbuf[i]);
		}

		reader.close();
		
	}

}
