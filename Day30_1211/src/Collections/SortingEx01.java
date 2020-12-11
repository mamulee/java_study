package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortingEx01 {

	public static void main(String[] args) {

		LinkedList<String> l = new LinkedList<String>();
		
		l.add("김철수");
		l.add("김영희");
	
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		Collections.sort(l);
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		
		
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(100);
		h.add(78);
		h.add(89);
		
		for(int s : h) {
			System.out.print(s+" ");
		}
		System.out.println();
		// set -> list
		ArrayList<Integer> list = new ArrayList<Integer>(h);
		Collections.sort(list);
		for(int s : list) {
			System.out.print(s+" ");
		}
		
		
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		map.put("a", 10);
//		map.put("d", 20);
//		map.put("b", 30);
//		// Map -> List
//		Collection c = map.values();
//		List list1 = (List) c;
//		
//		Collections.sort(list1); 안 됨 엉망진창 뭐 하고 있는 건지
		
	}

}
