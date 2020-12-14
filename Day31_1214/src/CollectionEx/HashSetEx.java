package CollectionEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {

		Set<Student> set = new HashSet<Student>();
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "정현희"));
		set.add(new Student(3, "최민우"));
		
		Iterator<Student> itr = set.iterator();
		while(itr.hasNext()) {
			Student st = itr.next();
			System.out.println(st.studentNum+" : "+st.name);
		}

	}

}

class Student {
	int studentNum;
	String name;
	
	Student (int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return (studentNum + name).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student st = (Student) obj;
			if(studentNum == st.studentNum && name.equals(st.name)) {
				return true;
			}
		}
		
		return false;
	}
}