package WrapperStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamEx {

	public static void main(String[] args) throws IOException {
		//      FileOutputStream fos = new FileOutputStream("c:/temp/test3.txt");
		//      BufferedOutputStream bos = new BufferedOutputStream(fos);
		//      PrintStream pos = new PrintStream(bos);

		PrintStream pos = new PrintStream(new BufferedOutputStream(new FileOutputStream("/Users/hongah/Desktop/Temp/test3.txt")));

		pos.println("프린터 보조 스트림");
		pos.println(true);
		pos.print(10);
		pos.printf("%d",100);
		pos.print(500);

		pos.flush();   //운영체제에서 지원하는 버퍼메모리에 있는 것 모두 내보내기
		pos.close();

	}

}
