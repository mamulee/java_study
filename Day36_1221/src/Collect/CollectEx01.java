package Collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectEx01 {

	public static void main(String[] args) {

		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Student.Sex.MALE),
				new Student("김수애", 6, Student.Sex.FEMALE),
				new Student("신용권", 10, Student.Sex.MALE),
				new Student("박수미", 6, Student.Sex.FEMALE)
				);

		// 남자들만
		List<Student> maleList = totalList.stream()
				.filter(s -> s.getSex() == Student.Sex.MALE)
				.collect(Collectors.toList());
		maleList.stream()
		.forEach(System.out :: println);
		System.out.println();
		
		// 여자들만
		Set<Student> femaleList = totalList.stream()
				.filter(s -> s.getSex() == Student.Sex.FEMALE)
				.collect(Collectors.toCollection(HashSet :: new));
				//.collect(Collectors.toCollection(()->{return new HashSet<Student>();}) );
				//.collect(Collectors.toCollection(()->new HashSet<Student>()) );
		femaleList.stream()
		.forEach(System.out :: println);
		System.out.println();
		
		// 8점 이상
		List<Student> scoreList = totalList.stream()
				.filter(s -> s.getScore() >= 8)
				.collect(Collectors.toList());
		scoreList.stream()
		.forEach(System.out :: println);
		
		
	}

}

class Student {
	enum Sex {MALE, FEMALE}
	enum City{Seoul, Busan}

	private String name;
	private int score;
	private Sex sex;
	private City city;

	Student(String name, int score, Sex sex) {
		this.name = name;
		this.score = score;
		this.sex = sex;
	}
	Student(String name, int score, Sex sex, City city) {
		this.name = name;
		this.score = score;
		this.sex = sex;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public Sex getSex() {
		return sex;
	}
	public City getCity() {
		return city;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+score+" "+sex;
	}

}