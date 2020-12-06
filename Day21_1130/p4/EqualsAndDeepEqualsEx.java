package p4;

import java.util.Objects;

public class EqualsAndDeepEqualsEx {

	public static void main(String[] args) {
		Integer o1 = 1000;	//정수형 클래스 o1
		Integer o2 = 1000;
		System.out.println(o1.equals(o2));		//Object클래스의 메소드
		System.out.println(o1.equals(null));	
//		System.out.println(null.equals(o2));
//		System.out.println(null.equals(null));
		System.out.println("---------------");
		System.out.println(Objects.equals(o1,o2));
		System.out.println(Objects.equals(o1,null));
		System.out.println(Objects.equals(null,o2));
		System.out.println(Objects.equals(null,null));
		
		Integer[] arr1 = {1,3};
		Integer[] arr2 = {1,2};
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(null,null));


	}

}
