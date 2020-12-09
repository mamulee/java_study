package LinkedListEx;

import java.util.LinkedList;

public class LinkedListEx01 {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("a");
		list.add("c");
		list.add("d");
		list.add(2,"a");
		list.removeFirstOccurrence("a");
		System.out.println(list);
		
	}

}
