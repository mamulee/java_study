package p5;

import java.util.Objects;

public class Student {
	int sno;
	String name;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int sno, String name) {
		this.sno=sno;
		this.name=name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(sno,name);
	}
}
