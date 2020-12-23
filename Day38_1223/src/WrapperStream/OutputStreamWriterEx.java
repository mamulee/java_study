package WrapperStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterEx {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("/Users/hongah/Desktop/Temp/fileoutput.txt");
		Writer writer = new OutputStreamWriter(fos);

		String data = "데이터 출력 스트림을 문자 출력 스트림으로 변환";
		writer.write(data);

		writer.flush();
		writer.close();
		fos.close();
	}

}
