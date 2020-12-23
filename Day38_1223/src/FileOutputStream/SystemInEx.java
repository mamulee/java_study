package FileOutputStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SystemInEx {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		String inputData = sc.next();
		
		File file = new File("/Users/hongah/Desktop/Temp/keyIn.txt");
		FileWriter fw = new FileWriter(file, true);
		fw.write(inputData);
		fw.flush();
		fw.close();

		// 띄어쓰기는 안 먹히네,,
		
	}

}
