package p05;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {

		char[] charArr1 = {'J', 'A', 'V', 'A'};
		byte[] byteArr1 = {1, 0, 1}	;
		double[] doubleArr1 = {1.1, 2.2, 3.3, 4.4, 5.5};
		Car[] CarArr1 = {new Car(), new Car()};
		
		int[] intArr1 = new int[3];
		intArr1[0] = 1;
		intArr1[1] = 2;
		intArr1[2] = 3;
		// int[] intArr1 = {1, 2, 3};		
		
		char[] copyChar = Arrays.copyOf(charArr1, charArr1.length);
		byte[] copyByte = Arrays.copyOf(byteArr1, byteArr1.length);
		double[] copydouble = Arrays.copyOf(doubleArr1, doubleArr1.length);
		Car[] copyCar = Arrays.copyOf(CarArr1, CarArr1.length);
		int[] copyint = Arrays.copyOf(intArr1, intArr1.length);
		
		for (char c: charArr1) {
			System.out.print(c+" ");
		}
		System.out.println();
		System.out.println("복사한 자료: ");
		for (char c : copyChar) {
			System.out.print(c+" ");
		}
		System.out.println();
		
		double[] dcor = Arrays.copyOfRange(doubleArr1, 2, 4); // 2번 인덱스부터 4번 인덱스보다 작은 것까
		for(double d : dcor) {
			System.out.print(d+" ");
		}
		System.out.println();
		
		char[] arr4 = new char[charArr1.length]; // [4]
		char[] arr5 = {'P', 'r', 'o'};
		char[] arr6 =new char[7];
		
		System.arraycopy(charArr1, 0, arr4, 0, charArr1.length);
		
		for(char c : arr4) {
			System.out.print(c+" ");
		}
		System.out.println();
		
		System.arraycopy(arr4, 0, arr6, 0, arr4.length);
		System.arraycopy(arr5, 0, arr6, 4, arr5.length);
		for(char c : arr6) {
			System.out.print(c+" ");
		}
		System.out.println();
		
	}

}

class Car {
	
}