package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx02 {

	public static void main(String[] args) {

		if(args.length != 1) {
			System.out.println("사용 방법은 java 파일명 input.txt");
			System.exit(0);
		}
		
		Properties prop = new Properties();
		String inputFile = args[0];
		
		try {
			prop.load(new FileInputStream(inputFile));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 뭘 한 건지 도대체,,,,,,,
	}

}
