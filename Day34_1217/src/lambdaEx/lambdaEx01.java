package lambdaEx;

import java.util.function.IntSupplier;

public class lambdaEx01 {

	public static int method(int x, int y) {
		IntSupplier supplier = () -> {
			//x *= 10;
			//int result = x + y; final 변수들이라 못 바꿈
			int result = x*10 + y;
			return result;
		};

		int result = supplier.getAsInt();
		return result;
	}

	public static void main(String[] args) {
		System.out.println(method(3,5));
	}

}
