package ArrayListEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx02 {

	public static void main(String[] args) {

		List list1 = new ArrayList();
		list1.add(10);
		list1.add(null);
		list1.add("A");
		list1.add(null);

		boolean ie = list1.isEmpty();
		System.out.println(ie);

		if (! list1.isEmpty()) {
			for(int i=0; i<list1.size(); i++) {
				System.out.print(list1.get(i)+" ");
			}
		}
		System.out.println();
		list1.clear();
		System.out.println("===clear===");
		if (! list1.isEmpty()) {
			for(int i=0; i<list1.size(); i++) {
				System.out.print(list1.get(i)+" ");
			}
			System.out.println();
		}else {
			System.out.println("없습니다.");
		}

		ie = list1.isEmpty();
		System.out.println(ie);
	}

}
