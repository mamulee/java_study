package StreamEx;

import java.util.Arrays;
import java.util.List;

public class StreamEx02 {

	public static void main(String[] args) {
		// 평균 나이 출력

		List<Member> list = Arrays.asList(new Member("홍길동", 30),
				new Member("신용권", 40),
				new Member("감자바", 26)
				);

		double avg = list.stream()
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();
		System.out.println("평균 나이: "+avg);

	}

}

class Member {
	private String name;
	private int age;

	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
}