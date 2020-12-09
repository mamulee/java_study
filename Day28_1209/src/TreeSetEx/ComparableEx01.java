package TreeSetEx;

import java.util.Set;
import java.util.TreeSet;

public class ComparableEx01 {

	public static void main(String[] args) {

		Set<Person> treeset = new TreeSet<Person>();

		treeset.add(new Person("홍길동", 30));
		treeset.add(new Person("홍길동", 20));
		treeset.add(new Person("이길동", 10));
		treeset.add(new Person("박길동", 30));
		treeset.add(new Person("정길동", 10));
		
		System.out.println(treeset);
		
	}

}

class Person implements Comparable<Person> {
	String name;
	int age;
	
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name+" "+age;
	}

	
//=============오름차순=========================
//	@Override
//	public int compareTo(Person o) {
//		// 나이 순 정렬 
//		if (age < o.age) return -1;
//		else if (age == o.age) return 0;
//		else return 1;
//	}
	
//	@Override
//	public int compareTo(Person o) {
//		// 이름 순 정렬
//		if (name.hashCode() < o.name.hashCode()) return -1;
//		else if (name.hashCode() == o.name.hashCode()) return 0;
//		else return 1;
//	}
	
//	@Override
//	public int compareTo(Person o) {
////		// 합치기 흠,,, 이름 순 이후에 나이 순으로 정렬되네
////		if (age < o.age || name.hashCode() < o.name.hashCode()) return -1;
////		else if (age == o.age || name.hashCode() == o.name.hashCode()) return 0;
////		else return 1;
//		
//		// 이것도 마찬가지
//		if( (name.hashCode() + age) < (o.name.hashCode()+o.age)) return -1;
//		else if( (name.hashCode() + age) == (o.name.hashCode()+o.age))  return 0;
//		else return 1;
//	}

//==================내림차순============================
	@Override
	public int compareTo(Person o) {
		if( (name.hashCode() + age) < (o.name.hashCode()+o.age)) return 1;
		else if( (name.hashCode() + age) == (o.name.hashCode()+o.age))  return 0;
		else return -1;
	}
}