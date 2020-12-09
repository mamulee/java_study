package HashSetEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx03 {

	public static void main(String[] args) {
		
		// 사용자 만든 클래스의멤버들을 Set 넣기
		Set<Person> set = new HashSet<Person>();
		Person p1 = new Person("강수진", 10);
		
		set.add(new Person("홍길동", 40));
		set.add(new Person("이순신", 30));
		set.add(new Person("정현희", 30));
		set.add(p1);
		set.add(new Person("홍길동", 30));
		set.add(new Person("홍길동", 30));
		
		Iterator<Person> itr = set.iterator();
		while(itr.hasNext()) {
			Person p = itr.next();
			System.out.println(p);
		}
		
		
		Set<Student> ss = new HashSet<Student>();
		ss.add(new Student("서울대", 2018, 10));
		ss.add(new Student("서울대", 2018, 20));
		ss.add(new Student("서울대", 2018, 15));
		ss.add(new Student("서울대", 2018, 10));
		ss.add(new Student("연세대", 2020, 30));
		ss.add(new Student("연세대", 2020, 30));
		ss.add(new Student("연세대", 2020, 30));
		ss.add(new Student("고려대", 2019, 10));
		ss.add(new Student("고려대", 2019, 10));
		
		Iterator<Student> itr1 = ss.iterator();
		while(itr1.hasNext()) {
			Student st = itr1.next();
			System.out.println(st);
		}
		
		
		
		
		
		
		
	}

}

class Person {
	String name;
	int age;
	
	public Person() {
		
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "이름: "+name+" 나이: "+ age;
	}
	
	@Override
	public int hashCode() {
		return (name+age).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			return name.equals(p.name) && age == p.age;
		}
		return false;
	}
}

class Student {
	String school;
	int stNum;
	int no;
	
	public Student() {
		
	}
	public Student(String school, int stNum, int no) {
		this.school = school;
		this.stNum = stNum;
		this.no = no;
	}
	
	@Override
	public int hashCode() {
		return (school+stNum+no).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student st = (Student) obj;
			return school.equals(st.school)
					&& stNum == st.stNum && no == st.no;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "학교: "+school+" 학번: "+stNum+" 번호: "+no;
	}
}