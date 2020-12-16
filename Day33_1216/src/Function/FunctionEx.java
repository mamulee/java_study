package Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToIntFunction;

public class FunctionEx {

	private static List<Student> list = Arrays.asList( new Student("홍길동",90, 96),
														new Student ("신용권", 95, 93)
														);
	public static void printString(Function<Student, String> function) { // Function<T, R>
		for(Student student : list) {
			// R apply (T t)
			System.out.print(function.apply(student)+" ");
		}
		System.out.println();
		}
	
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student : list) {
			System.out.print(function.applyAsInt(student)+ " ");
		}
		System.out.println();
	}

	public static void printBiFu(BiFunction<String, Integer, String> bf) {
		System.out.println(bf.apply("소나타", 300));
	}
	
	public static void printDouble(ToDoubleBiFunction<Integer, Double> dbf) {
		System.out.println(dbf.applyAsDouble(10, 20.5));
	}
	
	public static void main(String[] args) {

		System.out.println("학생 이름: ");
		printString ( t -> t.getName());
		
		System.out.println("영어 점수: ");
		printInt ( t -> t.getEnglishScore());
		
		System.out.println("수학 점수: ");
		printInt ( t -> t.getMathScore());
		
		printBiFu((t, v) -> t+" "+v+"만원");
		
		printDouble((t, v) -> t*v);
		
	}

}

class Student {
	private String name;
	private int englishScore;
	private int mathScore;

	public Student() {

	}

	public Student(String name, int englishScore, int mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}
	
	public String getName() {
		return name;
	}
	public int getEnglishScore() {
		return englishScore;
	}
	public int getMathScore() {
		return mathScore;
	}
}