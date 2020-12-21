package Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalEx01 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		// util.NoSuchElementException 발생
		//		double avg = list.stream()
		//				.mapToInt(Integer :: intValue)
		//				.average()
		//				.getAsDouble();

		// 오류 해결 
		// 방법 1: isPresent()
		OptionalDouble optional = list.stream()
				.mapToInt(Integer :: intValue)
				.average(); 
		if(optional.isPresent()) {
			System.out.println("방법1_평균: " + optional.getAsDouble());
		} else {
			System.out.println("방법1_평균: 0.0");
		}

		// 방법 2: orElse()
		double avg = list.stream()
				.mapToInt(Integer :: intValue)
				.average()
				.orElse(0.0);
		System.out.println("방법2_평균: " + avg);

		// 방법 3: ifPresent()
		list.stream()
		.mapToInt(Integer :: intValue)
		.average()
		.ifPresent(a -> System.out.println("방법3_평균: " + a));


	}

}
