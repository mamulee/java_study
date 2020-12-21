package StreamEx;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEx04 {

	public static void main(String[] args) {
		
		List<Member2> list = Arrays.asList(
				new Member2("홍길동", "개발자"),
				new Member2("김나리", "디자이너"),
				new Member2("신용권", "개발자")
				);
		
		Map<String, List<Member2>> grouping = list.stream()
				.collect(Collectors.groupingBy(Member2 :: getJob));
		
		System.out.print("[개발자] ");
		grouping.get("개발자").stream().forEach(s -> System.out.print(s.getName() + " "));
		System.out.println();
		System.out.print("[디자이너] ");
		grouping.get("디자이너").stream().forEach(s -> System.out.print(s.getName() + " "));
		System.out.println();
	}

}

class Member2 {
	private String name;
	private String job;
	
	Member2(String name, String job) {
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