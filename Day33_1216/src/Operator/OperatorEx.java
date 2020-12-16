package Operator;

import java.util.function.IntBinaryOperator;

public class OperatorEx {

	private static int[] scores = {92, 95, 87};

	private static int maxOrMin (IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	private static int neitherMinOrMax (IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	// 희광 답
	private static int notMinandMax(IntBinaryOperator operator) {
		for (int i = 0; i < scores.length; i++) {
			int a = operator.applyAsInt(scores[i], scores[0]);
			int b = operator.applyAsInt(scores[i], scores[1]);
			int c = operator.applyAsInt(scores[i], scores[2]);
			if(a == b && b == c) continue;
			if((a == b && b != c) || (a != b && b == c)) return scores[i];

		}
		int result = scores[0];
		operator.applyAsInt(result, scores[1]);
		return result;
	}

	public static void main(String[] args) {

		int max = maxOrMin ( (a,b) -> {
			if(a>=b) return a;
			else return b;
		});
		System.out.println(max);

		int min = maxOrMin ( (a,b) -> {
			if(a<=b) return a;
			else return b;
		});
		System.out.println(min);

		// 최대도 최소도 아니게
		int neither = neitherMinOrMax ( (a, b) -> {
			if(a != max && a != min) return a;
			else return b;
		});
		System.out.println(neither);

		// 희광 답
		int result = notMinandMax((a, b) ->{
			if(a >= b) return b;
			else return a;
		});
		System.out.println(result);



	}

}
