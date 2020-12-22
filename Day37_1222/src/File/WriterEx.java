package File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx {

	public static void main(String[] args) throws IOException {

		// 자바에서 파일로 문자 보내기 (저장하기, 쓰기)
		Writer writer = new FileWriter("/Users/hongah/Desktop/Temp/test2.txt");
		char[] data = "홍길동".toCharArray();
		
		// #1
//		for(int i=0; i<data.length; i++) {
//			writer.write(data[i]);
//		}
		
		// #2
//		writer.write(data);
		
		// #3
		writer.write(data, 1, 2);
		
		writer.flush(); // 버퍼 안 자료 모두 출력
		writer.close(); // File 자원 반납
		
	}

}
