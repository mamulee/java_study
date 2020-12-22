package Grouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingEx01 {

	public static void main(String[] args) {
		List<Student> totalList=Arrays.asList(
				new Student("홍길동", 10, Student.Sex.MALE,Student.City.Busan),
				new Student("김수애", 6, Student.Sex.FEMALE,Student.City.Seoul),
				new Student("신용권", 10, Student.Sex.MALE,Student.City.Busan),
				new Student("박수미", 6, Student.Sex.FEMALE,Student.City.Seoul),
				new Student("박수호", 6, Student.Sex.MALE,Student.City.Seoul)
				);

		/*
		Stream<Student> totalStream = totalList.stream();

		//Student객체가 입력되어서 Student.City가 리턴됨 Function<T,K>
		Function<Student, Student.City> classisfier = Student::getCity;

		//Student객체가 입력되어서 Student의 name이 리턴됨 
		Function<Student, String> mapper = Student::getName;

		//이름을 List에 수집하는 Collector를 얻는다.
		Collector<String, ?, List<String>> collector1 = Collectors.toList();

		//Collectors의 mapping() 메소드로  Student 이름을 List에 수집하는 Collector를 얻는다.
		//Collector<T,A,D>
		Collector<Student, ?, List<String>> collector2 = Collectors.mapping(mapper, collector1);

		//Student.City가 키이고 그룹핑된 이름 List가 값이 Map을 생성하는 Collector를 얻는다
		Collector<Student, ?, Map<Student.City, List<String>>> collector3 =
				Collectors.groupingBy(classisfier,collector2);
		//T를 K로 매핑하고  K키에 저장된 D객체에 T를 누적한 Map생성
		//Student를 String(도시명) 으로 매핑하고 도시명키에 저장된  List<String>객체에 Student를 누적한 Map생성

		//Stream의 collect()메소드로 Student를  Student.City별로 그룹핑해서 Map을 얻는다.
		Map<Student.City, List<String>> mapByCity = totalStream.collect(collector3);
		 */

		Map<Student.City, List<String>> mapByCity = totalList.stream()
				.collect(Collectors.groupingBy(Student :: getCity, 
						Collectors.mapping(Student :: getName, Collectors.toList())));


		System.out.println("서울에 사는 사람 이름 : " + mapByCity.get(Student.City.Seoul));
		System.out.println();
		System.out.println("부산에 사는 사람 이름 : " + mapByCity.get(Student.City.Busan));

	}

}
