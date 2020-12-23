package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableWriterEx {

	public static void main(String[] args) throws Exception {

		// 직렬화
//		FileOutputStream fos = new FileOutputStream("/Users/hongah/Desktop/Temp/obj2.dat");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		
//		ClassA classA = new ClassA();
//		classA.field1 = 1;
//		classA.field2.field1 = 2;
//		classA.field3 = 3;
//		classA.field4 = 4;
//		
//		oos.writeObject(classA);
//		oos.flush();
//		oos.close();
//		fos.close();
//		
		// 역직렬화
//		FileInputStream fis = new FileInputStream("/Users/hongah/Desktop/Temp/obj2.dat");
//		ObjectInputStream ois = new ObjectInputStream(fis);
//
//		ClassA v = (ClassA) ois.readObject();
//		
//		System.out.println("field1: " + v.field1);
//		System.out.println("field2.field1: " + v.field2.field1);
//		System.out.println("field3: " + v.field3);
//		System.out.println("field4: " + v.field4);
		
		// --------------SerialVersionUID Example-------------------
		// 직렬화
		FileOutputStream fos = new FileOutputStream("/Users/hongah/Desktop/Temp/obj2.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos); 

		ClassC classC = new ClassC();
		classC.fieldC1 = 1;

		oos.writeObject(classC);

		oos.flush(); 
		oos.close(); 
		fos.close(); 
		
		// ------------------------------------------
		FileInputStream fis = new FileInputStream("/Users/hongah/Desktop/Temp/obj2.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);

		ClassC v = (ClassC) ois.readObject();
		System.out.println("fieldC1: " + v.fieldC1);
		
	}

}
