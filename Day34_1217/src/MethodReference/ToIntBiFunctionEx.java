package MethodReference;

import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionEx {

	public static void main(String[] args) {
		ToIntBiFunction<String,String> function;

		function = (a, b) -> a.compareToIgnoreCase(b);
		print(function.applyAsInt("Java8", "cAVA8"));

		function = String :: compareToIgnoreCase;
		print(function.applyAsInt("cava8", "JAVA8"));

		ToIntBiFunction<Integer, Integer> f;
		f = Integer :: compareTo;
		print1(f.applyAsInt(500, 200));
	}

	public static void print(int order) {
		if(order<0) { System.out.println("사전순으로 먼저 옵니다."); }
		else if(order == 0) { System.out.println("동일한 문자열입니다."); }
		else { System.out.println("사전순으로 나중에 옵니다."); }
	}

	public static void print1(int order) {
		if(order<0) { System.out.println("작음"); }
		else if(order == 0) { System.out.println("같음"); }
		else { System.out.println("큼"); }
	}
}
