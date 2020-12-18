package Stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayEx {

	public static void main(String[] args) {

		// 배열 만들기
		String[] strArray = {"홍길동", "신용권", "김미나"};
		// 오리지널 스트림 얻기
		// 방법 1:
		Stream<String> strStream1 = Arrays.stream(strArray);
		// 방법 2:
		Stream<String> strStream2 = Stream.of(strArray);
		// 출력
		strStream1.forEach(a -> System.out.print(a+" "));
		System.out.println();
		strStream2.forEach(a -> System.out.print(a + " "));
		System.out.println();
		
		int [] intArray = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(i -> System.out.print(i + ", "));

	}

}
