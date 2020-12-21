package StreamEx;

import java.util.Arrays;
import java.util.List;

public class StreamEx01 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("This is a java book", 
											"Lambda Expression",
											"Java8 support lambda expressions");
		
		
		list.stream()
		.filter(n -> n.toLowerCase().contains("java"))
		.forEach( n -> System.out.println(n));
		
		
	}

}
