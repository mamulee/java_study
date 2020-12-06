package p6;

import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		try {
		String str1 = "홍길동";
		String str2 = null;
		System.out.println(Objects.isNull(str1));	//null입니까?
		System.out.println(Objects.isNull(str2));	
		System.out.println(Objects.nonNull(str1));	//null이 아닙니까?
		System.out.println(Objects.nonNull(str2));
		System.out.println(Objects.requireNonNull(str1));
		//System.out.println(Objects.requireNonNull(str2,"널이다"));
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2,"기본값"));
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}

		

	}

}
