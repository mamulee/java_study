package p04;

import java.util.Scanner;

public class StackManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringStack ss = new StringStack(5);
		
		System.out.print(">> ");
		for(int i=0; i<ss.element.length; i++) {
			String text = sc.next();
			ss.push(text);
		}
		
		for (int i=0; i<ss.element.length; i++) {
			System.out.print(ss.pop()+" ");
		}
		
	}

}
