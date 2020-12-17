package lambdaEx;

import java.util.function.ToIntFunction;


public class lambdaEx03 {

	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	};

	public static double avg(ToIntFunction<Student> function) {
		int count = 0, sum = 0;
		for (Student student : students) {
			sum += function.applyAsInt(student);
			count++;
		}
		// count 말고 걍 students.length 하믄 됨
		return (double) sum / count;
	}
	
	public static void main(String[] args) {
		double englishAvg = avg( s -> s.getEnglishScore() );
		System.out.println("영어 평균 점수: " + englishAvg);
		
		englishAvg = avg(Student :: getEnglishScore);
		System.out.println("영어 평균 점수: " + englishAvg);
		
		double mathAvg = avg( s -> s.getMathScore() );
		System.out.println("수학 평균 점수: " + mathAvg);
		
		mathAvg = avg(Student :: getMathScore);
		System.out.println("수학 평균 점수: " + mathAvg);

		
	}

}

class Student {
	private String name;
	private int englishScore;
	private int mathScore;

	public Student(String name, int englishScore, int mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	public String getName() { return name; }
	public int getEnglishScore() { return englishScore; }
	public int getMathScore() { return mathScore; }

}