package p01;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceEx {

	public static void main(String[] args) {

		List<Student> list = Arrays.asList( new Student("홍길동", 10),
											new Student("신용권", 20),
											new Student("유미선", 30)
											);
		
		// 오리지널 스트림
		double avg = list.stream().mapToInt(Student :: getScore).average().getAsDouble();
		System.out.println("평균 점수: "+avg);
		
		long count = list.stream().filter(m -> m.getName().equals("홍길동")).count();
		System.out.println(count);
	
	}

}

class Student {
	String name;
	int score;
	
	Student (String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	String getName() {
		return name;
	}
	int getScore() {
		return score;
	}
}