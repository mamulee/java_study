package HashSetEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetLotto {

	public static void main(String[] args) {

		Set<Integer> lotto = new HashSet<Integer>();
		int no;
		for(int i=0; lotto.size()<6; i++) {
			no = (int) (Math.random()*45 + 1);
			lotto.add(no);
		}
		System.out.println(lotto);
		
		// Set -> List 해서 순서 정렬하기 
		List<Integer> list1 = new ArrayList<Integer>(lotto);
		List<Integer> list2 = new LinkedList<Integer>(lotto);
		
		Collections.sort(list1);
		System.out.println(list1);
		
		Collections.sort(list2);
		System.out.println(list2);
		
		// list -> set 
		Set<Integer> set1 = new HashSet<Integer>(list1);
		Set<Integer> set2 = new LinkedHashSet<Integer>(list2);
		Set<Integer> set3 = new TreeSet<Integer>(list1);
		
	}

}
