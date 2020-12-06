package p02;

import java.util.regex.Pattern;

public class PatternMatchEx {

	public static void main(String[] args) {

		String id = "5Angel1004";
		String regExp = "[a-zA-Z][a-zA-Z0-9] {7,11}";
		
		
		boolean isMatch = Pattern.matches(regExp, id);
		System.out.println(isMatch);
		if(isMatch) {
			System.out.println("Id로 사용할 수 있습니다.");
		}
		else {
			System.out.println("Id로 사용할 수 없습니다.");
		}
		
		
	}

}
