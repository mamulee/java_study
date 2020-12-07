package p05;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx02 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("서울");
		list.add("LA");
		list.add("인천");
		list.add("부산");
		list.add("서울");
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		// 인천의 인덱스 번호 출력
		int index = list.indexOf("인천");
		System.out.println(index);
		
		if(index == -1) {
			System.out.println("없는 주소입니다.");
		}
		else {
			System.out.println(index + 1 + "번째 주소입니다.");
		}
		
		// 인천의 lastIndexOf()를 출력
		int lastIndex = list.lastIndexOf("서울");
		System.out.println(lastIndex);
		
		// 삭제하기
		list.remove(1);
		list.remove("부산");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		// 전체 다 삭제
		list.removeAll(list);
		System.out.println("=====전체 삭제=====");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}

}
