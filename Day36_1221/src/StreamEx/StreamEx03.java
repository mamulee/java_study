package StreamEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx03 {

	public static void main(String[] args) {

		List<Member1> list = Arrays.asList(
				new Member1("홍길동", "개발자"),
				new Member1("김나리", "디자이너"),
				new Member1("신용권", "개발자")
				);
		
		List<Member1> dList = list.stream()
		.filter(j -> j.getJob() == "개발자")
		.collect(Collectors.toList());
		dList.stream()
		.forEach(System.out :: println);
		
	}

}

class Member1 {
	private String name;
	private String job;
	
	Member1(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	String getName() {
		return name;
	}
	String getJob() {
		return job;
	}
	
	@Override
	public String toString() {
		return name+" "+job;
	}
}