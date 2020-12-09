package HashSetEx;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx01 {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add("a");
		hashSet.add("c");
		hashSet.add("b");
		hashSet.add(null);
		hashSet.add("c");
		hashSet.add("c");
		
		Iterator<String> itr = hashSet.iterator();
		
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.print(s+" ");
		}
		System.out.println();
		
		// Set 안에 있는 객체 주소의 크기
		System.out.println(hashSet.size());
		
		hashSet.remove("c");
		itr = hashSet.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.print(s+" ");
		}
		System.out.println();
		
		
	}

}
