package p05;

import java.util.Random;
import java.util.stream.DoubleStream;

public class RandomEx {

	public static void main(String[] args) {

//		Random r1 = new Random();
//		DoubleStream d1 = r1.doubles();
//		double[] dArr = d1.toArray();
//		for(double d : dArr)
//		System.out.println();
		
		int[] selectNumber = new int[6];
		Random r1 = new Random();
		System.out.println("선택번호: ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = r1.nextInt(45)+1;
			System.out.print(selectNumber[i]+ " ");
		}
		System.out.println();
	}

}
