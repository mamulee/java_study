package p01;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableEx {

	public static void main(String[] args) {

		Member m1 = new Member(1, "홍길동", "123");
		Member m2 = new Member(3, "박길동", "234");
		Member m3 = new Member(2, "김길동", "567");
		Member[] members = {m1, m2, m3};
		Arrays.sort(members);
		for(Member m : members) {
			System.out.print(m);
		}
		
	}

}

// 사용자(프로그래머)가 정렬할 기준을 정해 주는 프로그램 작성
class Member implements Comparable<Member> {
	int sno;
	String sname;
	String stel;
	public Member() {
		
	}
	public Member(int sno, String sname, String stel) {
		this.sno = sno;
		this.sname = sname;
		this.stel = stel;
	}

	// 문자열 정렬
//	@Override
//	public int compareTo(Member o) {
//		return sname.compareTo(o.sname);
//	}
	
	// 숫자 정렬
	@Override
	public int compareTo(Member o) {
		if (sno == o.sno) return 0;
		else if (sno < o.sno) return -1;
		else return 0;
//		return sname.compareTo(o.sname);
	}
	
	@Override
	public String toString() {
		return sno + " " + sname + " " + stel+"\n";
	}
}