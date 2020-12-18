package Stream;

import java.util.stream.IntStream;

public class FromIntRange {
	
	public static int sum;
	
	public static void main(String[] args) {
		
		IntStream stream = IntStream.rangeClosed(1, 100);
		// 방법 1
//		stream.forEach(a -> sum += a);
//		System.out.println("총합: " + sum);
		// 방법 2
		int sum = stream.sum();
		System.out.println("총합: " + sum);
	}

}
