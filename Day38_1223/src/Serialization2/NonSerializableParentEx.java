package Serialization2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NonSerializableParentEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("/Users/hongah/Desktop/Temp/obj2.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos); 

		Child child = new Child();
		child.field1 = "홍길동";
		child.field2 = "홍삼원";

		oos.writeObject(child);
		oos.flush(); oos.close(); fos.close(); 

		FileInputStream fis = new FileInputStream("/Users/hongah/Desktop/Temp/obj2.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Child v = (Child) ois.readObject();
		System.out.println("field1: " + v.field1);
		System.out.println("field2: " + v.field2);

		ois.close(); fis.close();
	}

}
