package Serialization2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Child extends Parent implements Serializable {

	public String field2;
	
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(field1); // 부모 객체 필드값 출력 
		out.defaultWriteObject(); // 자식 객체 필드값 직렬화
	}
	
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		field1 = in.readUTF(); // 부모 객체 필드값 읽기
		in.defaultReadObject(); // 자식 객체의 필드값 역직렬화
	}
	
}
