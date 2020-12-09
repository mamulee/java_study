package TreeSetEx;

import java.util.TreeSet;

public class ComparableEx02 {

	public static void main(String[] args) {

		TreeSet<Student> ts = new TreeSet<Student>();

		ts.add(new Student("서울대", "홍길동", "이순신", 10));
		ts.add(new Student("연세대", "김길동", "박순신", 20));
		ts.add(new Student("연세대", "박길동", "이순신", 30));

		System.out.println(ts);
	}

}

class Student implements Comparable<Student> {
	String school;
	String teacher;
	String name;
	int grade;
	
	public Student(String school, String teacher, String name, int grade) {
		this.school = school;
		this.teacher = teacher;
		this.name = name;
		this.grade = grade;
	}

	@Override
	public int compareTo(Student o) {
		if(grade < o.grade) return 1;
		else if (grade == o.grade) return 0;
		else return -1;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+grade;
	}
	
	
}