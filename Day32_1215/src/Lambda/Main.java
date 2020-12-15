package Lambda;

public class Main {

	public static void main(String[] args) {
		
		//일반 구현 객체로 객체화
		RunImEx r = new RunImEx();
		
		// 익명 구현 객체
//		RunIm r2 = new RunIm() {
//			
//			@Override
//			public void abMethod() {
//				System.out.println("람다식");
//			}
//		};
		
		// 람다식으로 간단히
		RunIm r2 = () -> { System.out.println("람다식");};
		r2.abMethod();
		r2 = () -> { System.out.println("바보");};
		r2.abMethod();
	}

}
