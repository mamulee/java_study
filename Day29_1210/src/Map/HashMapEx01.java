package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx01 {

	public static void main(String[] args) {

		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(2020, "홍길동"), 100);
		map.put(new Student(2019, "김길동"), 80);
		map.put(new Student(2018, "홍길동"), 90);
		map.put(new Student(2017, "홍길동"), 100);

		System.out.println(map.get(new Student(2018, "홍길동")));
		
	}

}

class Student {
	int sno;
	String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return (sno+name).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student) obj;
			return sno == s.sno && name.equals(s.name);
		}
		return false;
	}
}