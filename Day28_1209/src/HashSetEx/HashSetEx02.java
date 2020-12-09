package HashSetEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx02 {

	public static void main(String[] args) {

		Object[] objArr = {1, 1.1, "a", 'a', true, "a", 1};
		Set<Object> hs = new HashSet<Object>();
		for (int i=0; i<objArr.length; i++) {
			hs.add(objArr[i]);
		}
		
		for(Object o : hs) {
			System.out.print(o+" ");
		}
		System.out.println();
		
		int[] intArr = {100, 90, 80, 70, 100, 40, 90};
		Set<Integer> is = new HashSet<Integer>();
		for(int i=0; i<intArr.length; i++) {
			is.add(intArr[i]);
		}
		Iterator<Integer> itr = is.iterator();
		while(itr.hasNext()) {
			Integer i = itr.next();
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
