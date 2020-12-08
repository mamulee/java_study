package p05;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx03 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Studentt> list2 = new ArrayList<Studentt>();
		
		list1.add(100);
		list1.add(200);
		list1.add(300);
		
		list2.add(new Studentt("2020", "홍길동"));
		list2.add(new Studentt("2019", "이순신"));
		list2.add(new Studentt("2019", "최경희"));
		
		list1.add(1, 100);
		
		list2.add(2, new Studentt("2018", "정현희"));
		
		// 최경희 출력
		System.out.println(list2.get(3).name);
		// 2018 출력
		System.out.println(list2.get(2).getNo());
		
		// 최경희 -> 최무선
		list2.set(3, new Studentt("2018", "최무선"));
		System.out.println(list2.get(3).name);
		// 2018 -> 2017
		list2.get(2).setNo("2017");
		System.out.println(list2.get(2).getNo());
		
		// 안 나옴 
//		int index = list2.indexOf("최무선");
//		System.out.println(index);
//		int i = list2.indexOf("2017");
//		System.out.println(i);
		// 다른 방법
		int i;
		for (i=0; i<list2.size(); i++) {
			if(list2.get(i).name.equals("최무선")) {
				break;
			}
		}
		System.out.println("찾은 인덱스: "+i);
		
	}

}

class Studentt {
	private String no;
	String name;
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public Studentt() {
		
	}
	public Studentt(String no, String name) {
		this.no = no;
		this.name = name;
	}
	
}

class Carr {
	
}