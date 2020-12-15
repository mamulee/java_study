package Lambda2;

public class Main {

	public static void main(String[] args) {

		MyFunctionalInterface fi1 = new MyFunctionalInterface() {
			
			@Override
			public void method() {
				System.out.println("익명 구현 객체");
				
			}
		};
		
		// 람다식
		MyFunctionalInterface fi2 = () -> {
			System.out.println("람다식");
		};
		
		fi1.method();
		fi2.method();
		
		
		
	}

}
