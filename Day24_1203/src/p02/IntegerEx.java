package p02;

public class IntegerEx {

	public static void main(String[] args) {

		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2); // true
		System.out.println(obj3 == obj4); // false
		
		// Integer 값의 범위: -128 ~ +127까지는 값을 비교
		// 범위를 벗어나면 == 로 주소 비교
		
	}

}
