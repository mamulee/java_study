package Looping;

import java.util.Arrays;

public class LoopingEx {

	public static void main(String[] args) {

		int[] intArr = {1, 2, 3, 4, 5};
		
		int total = Arrays.stream(intArr)
		.filter(a -> a%2 == 0)
		.peek(n -> System.out.println("peek")) // 여기까지만 하면 안 됨
		.sum(); // 최종 처리
		System.out.println("총 합: " +total);
		
		
	}

}
