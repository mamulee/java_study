package lambdaEx;

import java.util.function.IntBinaryOperator;

public class lambdaEx02 {

	private static int[] scores = { 10, 50, 3 };

	public static int maxOrMin(IntBinaryOperator operator) {

		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		//최대값 얻기
		int max = maxOrMin( (t, v) -> {
			if (t >= v) return t;
			else return v;
		}
				);
		System.out.println("최대값: " + max);

		//최소값 얻기
		int min = maxOrMin( (t,v) -> {
			if (t<= v) return t;
			else return v;
		}
				);
		System.out.println("최소값: " + min);

	}

}
