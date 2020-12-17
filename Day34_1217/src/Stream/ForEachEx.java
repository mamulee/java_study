package Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ForEachEx {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("홍길동", "정현희", "김자바");
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}

		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name));
		
		
	}

}
