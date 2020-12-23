package WrapperStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamEx {

	public static void main(String[] args) throws IOException, Exception {

		// 직렬화
		FileOutputStream fos = new FileOutputStream("/Users/hongah/Desktop/Temp/test2.txt");
		// 보조 기반 스트림
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		
		oos.writeObject(10);
		oos.writeObject(3.14);
		oos.writeObject(new int[] { 1, 2, 3 });
		oos.writeObject(new String("홍길동"));
		
		oos.flush(); oos.close(); fos.close();
		
		// 역직렬화
		FileInputStream fis = new FileInputStream("/Users/hongah/Desktop/Temp/test2.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Integer obj1 = (Integer) ois.readObject();
		Double obj2 = (Double) ois.readObject();
		int[] obj3 = (int[]) ois.readObject();
		String obj4 = (String) ois.readObject();
		
		ois.close(); fis.close();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3[0] + "," + obj3[1] + "," + obj3[2]);
		System.out.println(obj4);

	}

}
