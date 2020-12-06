package p02;

public class StringBuilderEx {

	public static void main(String[] args) {
		
		// 1 12 123 123...100
		String str = "";
		for(int i=1; i<=100; i++) {
			str += i;
		}
		System.out.println(str);
		
		// 개선된 방법
		// 1234...
		StringBuilder str1 = new StringBuilder();
		for (int i=1; i<=100; i++) {
			str1.append(i);
		}
		String st = str1.toString();
		System.out.println(st);
		
	}

}
