package Stream3;

import java.util.Arrays;
import java.util.List;

public class FilteringEx {

	public static void main(String[] args) {

		List <String> names = Arrays.asList("홍길동", "신용권", "김자바", "신용권", "신민철");
		// 중복 제거
		names.stream().distinct().forEach(n -> System.out.println(n));
		System.out.println();
		
		// "신"을 포함한 이름 가져오기
		names.stream()
		.filter(n -> n.startsWith("신"))
		.forEach(System.out :: println);
		System.out.println();
		// "동"으로 끝나는 이름 찾기
		names.stream().filter(n->n.endsWith("동"))
		.forEach(System.out::println);
		System.out.println();
		
	}

}
