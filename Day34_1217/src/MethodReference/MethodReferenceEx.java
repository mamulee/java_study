package MethodReference;

import java.util.function.IntBinaryOperator;

public class MethodReferenceEx {

	public static void main(String[] args) {

		IntBinaryOperator operator;
		
		// 정적 메소드 참조
		operator = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("결과 : "+operator.applyAsInt(1, 2));
		// 간단히: 
		operator = Calculator :: staticMethod;
		System.out.println("결과 : " + operator.applyAsInt(1, 2) );
		
		//인스턴스 메소드 참조
		Calculator obj = new Calculator();
		
		operator = (x, y) -> obj.instanceMethod(x, y);
		System.out.println("결과: " + operator.applyAsInt(1, 2));
		
		operator = obj :: instanceMethod;
		System.out.println("결과: " + operator.applyAsInt(1, 2));
		
	}

}

class Calculator {
	
	public static int staticMethod(int x, int y) {
		return x+y;
	}
	
	public int instanceMethod(int x, int y) {
		return x+y;
	}
}