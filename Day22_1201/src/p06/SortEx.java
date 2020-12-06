package p06;

import java.util.Arrays;

public class SortEx {

	public static void main(String[] args) {
		
		int[] scores = {99, 98, 87, 100};
		double[] avg = {4.5, 1.2, 100, -10.0};
		String[] stringArr = {"김수진", "황수연", "김미", "박수진"};
		
		for(int s : scores) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("sort 후 --- ");
		Arrays.sort(scores);
		Arrays.sort(scores);
		for(int s : scores) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("---------------");
		Arrays.sort(avg);
		Arrays.sort(avg);
		for(double s : avg) {
			System.out.print(s + " ");
		}
		System.out.println();
		Arrays.sort(stringArr);
		for(String s : stringArr) {
			System.out.print(s + " ");
		}
	}

}

class Member {
	int sno;
	
}
