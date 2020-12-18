package Stream3;

import java.util.Arrays;
import java.util.List;

public class FlatMapEx {

	static double sum=0;
	
	public static void main(String[] args) {

//		List<String> list = Arrays.asList("java8 lambda", "stream mapping");
//		list.stream().flatMap(data -> Arrays.stream(data.split(" ")))
//		.forEach(System.out :: println);

		List<String> list1 = Arrays.asList("1.1, 2.2, 3.3, 4.4");

		list1.stream().flatMapToDouble(data -> 
		{ String[] strArr = data.split(",");
		double[] doubleArr = new double[strArr.length];
		for(int i=0; i<strArr.length; i++) {
			doubleArr[i] = Double.parseDouble(strArr[i].trim());
		}
		return Arrays.stream(doubleArr);
		})
		.forEach(n -> System.out.println(sum += n));


		
	}

}
