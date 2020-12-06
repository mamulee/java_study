package p01;

import java.io.FileNotFoundException;

public class ExceptionEx01 {

	public static void main(String[] args) {
		
		int a = 10;
		try {
			int[] arr = new int[5];
			arr[5] = 30; // 예외가 발생하면 아래부분이 수행되지 않는다.
			int c = a / 0;
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("배열 첨자 오류");
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("산술적 오류");
		}catch(Exception e) {
			System.out.println("모든 예외 처리");
		}
		finally {
			System.out.println("DB 닫기");
			System.out.println("연결된 자원 해제");
		}

	
	
	
	}

}
