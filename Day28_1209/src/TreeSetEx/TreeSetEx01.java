package TreeSetEx;

import java.util.TreeSet;

public class TreeSetEx01 {

	public static void main(String[] args) {


		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(0);
		ts.add(8);
		ts.add(9);
		ts.add(12);
		ts.add(8);
		ts.add(-10);
		ts.add(5);
		ts.add(0);
		
		System.out.println(ts); // 중위오더 순서대로 읽어서 출력
		
		// 문자형만 대문자 소문자 
		TreeSet<String> ts2 = new TreeSet<String>();
		ts2.add("ab");
		ts2.add("AB");
		ts2.add("한글");
		ts2.add("cd");
		ts2.add("!!");
		ts2.add("ef");
		ts2.add("ccc");
		ts2.add("d");
		System.out.println(ts2);
		System.out.println(ts2.subSet("a", true, "d", false));
		System.out.println(ts2.subSet("a", true, "d", true));
		
	}

}
