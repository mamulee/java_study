package ArrayListEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx03 {

	public static void main(String[] args) {

		List<Double> d1 = new ArrayList<Double>();
		d1.add(3.3);
		d1.add(4.4);
		d1.add(5.5);
		
		List<Double> d2 = new ArrayList<Double>();
		d2.add(6.6);
		d2.add(7.7);
		d2.add(8.8);
		
		d1.addAll(d2);
		System.out.println(d1);
		
		System.out.println(d1.containsAll(d2));
		
//		d1.retainAll(d2);
//		System.out.println(d1);
		
		d1.removeAll(d2);
		System.out.println(d1);
		
	}

}
