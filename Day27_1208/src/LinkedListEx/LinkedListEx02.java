package LinkedListEx;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx02 {

	public static void main(String[] args) {

		List<String> list = new LinkedList<String>();
		list.add("b");
		list.add(0, "a");
		list.add("c");
		list.add("c");
		
		LinkedList<String> linkedList = (LinkedList<String>) list;
		linkedList.addFirst("first");
		linkedList.addLast("last");
		linkedList.push("push");
		
		boolean offerB = linkedList.offer("offer");
		System.out.println(offerB+"~~~~");
		
		String el = linkedList.element(); // 첫번째 요소 꺼내기
		System.out.println(el+"!!!!");
		
		el = linkedList.getLast();
		System.out.println(el+" LAST!!");
		
		el = linkedList.peek(); // 첫번째 요소 꺼내기 
		System.out.println(el+" PEEK!!");
		
		el = linkedList.poll(); // 첫번째 요소 꺼낸 후 삭제
		System.out.println(el + " POLL!");
		
		el = linkedList.pop();
		System.out.println(el+" POP!"); // 첫번째 요소 꺼낸 후 삭제
		
		// 전체 출력
		Iterator<String> itr = linkedList.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}
		
		
		
	}

}
