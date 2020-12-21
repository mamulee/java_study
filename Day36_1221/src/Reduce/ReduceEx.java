package Reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceEx {

	public static void main(String[] args) {

		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 92),
				new Student("신용권", 95),
				new Student("감자바", 88)
				);

		int sum1 = studentList.stream()
				.mapToInt(Student :: getScore)
				.sum();

		int sum2 = studentList.stream()
				.map(Student :: getScore)
				.reduce((a, b) -> a+b)
				.get();

		int sum3 = studentList.stream()
				.map(Student :: getScore)
				.reduce(0, (a, b) -> a+b);

		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
		System.out.println("sum3: " + sum3);

//		String str = studentList.stream()
//				.map(Student :: getName)
//				.reduce((a,b) -> a+b)
//				.get();
		
	}

}
class Student {

	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() { return name; }
	public int getScore() { return score; }

}