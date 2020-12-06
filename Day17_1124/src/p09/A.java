package p09;

public class A {
	// 클래스 안에 넣을 수 있는 멤버
	int number;
	static int snumber;
	static final int MAX = 100;
	int[] jumsu = new int[10];
	
	public A() {
		
	}
	
	void method() {
//		bnumber = 60;
//		System.out.println(bMAX);
//		bjumsu[0] = 90;
//		B b = new B();
//		// 객체 생성을 해야 사용 가능
//		b.bMethod();
	}
	static void smethod() {
		
	}
	
	class B {
		int bnumber;
		// static int sbnumber;
		static final int bMAX = 100;
		int[] bjumsu = new int[10];
		
		public B() {
			
		}
		
		void bMethod() {
			number = 50;
			snumber = 50;
			System.out.println(MAX);
			jumsu[0] = 10;
			method();
		}
		
//		static void sbMethod() {
//			
//		}
	}
	
}
