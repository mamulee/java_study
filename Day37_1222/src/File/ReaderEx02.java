package File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx02 {

	public static void main(String[] args) throws IOException {

		Reader reader = new FileReader("/Users/hongah/Desktop/Temp/test1.txt");
		int readCharNo;
		char[] cbuf = new char[1]; // 1이상이면 상관 없음, 어차피 밑에 String data에 넣으니까 글자 있는대로 다 읽어올 수 있음
		String data = "";
		
		while(true) {
			readCharNo = reader.read(cbuf);
			if(readCharNo == -1) break;
			data += new String(cbuf, 0, readCharNo);
		}
		System.out.println(data);
		
		reader.close();
		
	}

}
