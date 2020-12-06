package p03;

import java.util.Arrays;

public class ObjectEx {
	
	public static void main(String[] args) {
		
		Value v1 = new Value(10, 30);
		Value v2 = new Value(10, 30);
		Value v3 = new Value(20, 30);
		
//		if(v1.equals(v2)) {
//			System.out.println("같다");
//		}
//		else {
//			System.out.println("다르다");
//		} // 주소가 달라서 다르다라고 나온다.
//		// 값을 비교하고 싶으면, equals를 오버라이
		
		if(v1.equals(v2)) {
		System.out.println("같다");
	}
	else {
		System.out.println("다르다");
	}
		if(v1.equals(v3)) {
		System.out.println("같다");
	}
	else {
		System.out.println("다르다");
	}
		
	}
}

class Value {
	int v1;
	int v2;
	public Value(int v1, int v2) {
		this.v1 = v1;
		this.v2 = v2;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Value) {
			Value value = (Value) obj;
			if (v1 == value.v1 && v2 == value.v2) {
				return true;
			}
		}
		return false;
	}
}
