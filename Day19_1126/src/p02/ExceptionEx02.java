package p02;

public class ExceptionEx02 {

	public static void main(String[] args) {

//		try {
//			method1();
//			method2();
//		} catch(ArithmeticException e) {
//			System.out.println("숫자 예외~");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열 첨자 예외~");
//		}
//		finally {
//			System.out.println("데이터 베이스 종료.");
//			System.out.println("로그아웃");
//		}
		
		
		method1();
		method2();
		
		
		
	}

	private static void method2() throws ArithmeticException, ArrayIndexOutOfBoundsException {
		a();

	}

	private static void a() throws ArithmeticException, ArrayIndexOutOfBoundsException {
		b();
		int[] arr = new int[5];
		arr[5] = 10;
	}

	private static void method1() {
		b();

	}

	private static void b() throws ArithmeticException {
		int a = 10;
		int c = a / 0; // 예외 발생	

	}

}
