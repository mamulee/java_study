package Grouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndReductionEx {

	public static void main(String[] args) {
		
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Student.Sex.MALE,Student.City.Busan),
				new Student("김수애", 6, Student.Sex.FEMALE,Student.City.Seoul),
				new Student("신용권", 10, Student.Sex.MALE,Student.City.Busan),
				new Student("박수미", 6, Student.Sex.FEMALE,Student.City.Seoul),
				new Student("박수호", 6, Student.Sex.MALE,Student.City.Seoul)
				);
		
		// 성별로 평균 점수 구하기
		Map<Student.Sex, Double> mapBySex = totalList.stream()
				.collect(Collectors.groupingBy(Student :: getSex, 
						Collectors.averagingDouble(Student :: getScore)));
		
		System.out.println("남학생의 평균 점수: "+mapBySex.get(Student.Sex.MALE));
		System.out.println("여학생의 평균 점수: "+mapBySex.get(Student.Sex.FEMALE));
		System.out.println();
		
		// 성별 인원 수 구하기
		Map<Student.Sex, Long> mapBySexC = totalList.stream()
				.collect(Collectors.groupingBy(Student :: getSex,
						Collectors.counting()));
		
		System.out.println("남학생 수: "+mapBySexC.get(Student.Sex.MALE));
		System.out.println("여학생의 수: "+mapBySexC.get(Student.Sex.FEMALE));
		
		// 성별을 쉼표로 구분하는 이름을 저장하는 Map
		
		// 내가 걍 한 거, 리스트로 만든 거임
//		Map<Student.Sex, List<String>> mapBySex2 = totalList.stream()
//				.collect(Collectors.groupingBy(Student :: getSex,
//						Collectors.mapping(Student :: getName, Collectors.toList())));
//
//		System.out.println("남학생 이름 : " + mapBySex2.get(Student.Sex.MALE));
//		System.out.println("여학생 이름 : " + mapBySex2.get(Student.Sex.FEMALE));
		
		Map<Student.Sex, String> mapByName = totalList.stream()
				.collect(
				Collectors.groupingBy(
				Student :: getSex, 
				Collectors.mapping(
				Student :: getName,
				Collectors.joining(", ")
				)));

				System.out.println("남학생 전체 이름: " + mapByName.get(Student.Sex.MALE));
				System.out.println("여학생 전체 이름: " + mapByName.get(Student.Sex.FEMALE));
		
	}

}
