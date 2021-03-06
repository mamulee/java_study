package p02;

import java.util.Arrays;

public class BinarySearchEx {

	public static void main(String[] args) {
		
		try {
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores,97);
		System.out.println("찾는 자료의 인덱스는 "+ index);
		System.out.println(scores[index]);
		
		String[] names = {"홍길동", "박동수", "김민수"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "박동수");
		System.out.println("찾는 자료의 인덱스는 "+ index);
		System.out.println(names[index]);
		
		Member m1 = new Member(1, "홍길동", "222333");
		Member m2 = new Member(3, "김길동", "123456");
		Member m3 = new Member(6, "박길동", "121212");
		Member m4 = new Member(2, "최길동", "777233");
		Member[] m = {m1, m2, m3, m4};
		Arrays.sort(m);
		index = Arrays.binarySearch(m, m2);
		System.out.println("찾는 자료의 인덱스는 "+ index);
		System.out.println(m[index].name+ " "+ m[index].tel);
		
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("찾는 자료가 없습니다.");
		}
		
		
		
	}

}

class Member implements Comparable<Member>{
	int no;
	String name;
	String tel;
	
	Member() {
		
	}
	Member(int no, String name, String tel) {
		this.no = no;
		this.name = name;
		this.tel = tel;
	}
	
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}
	
}
