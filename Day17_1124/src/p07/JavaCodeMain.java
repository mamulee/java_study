package p07;

public class JavaCodeMain {

	public static void main(String[] args) {
		
		MyInterface ma = new MyClassA();
		MyInterface mb = new MyClassB();
		MyInterface mc = new MyClassC();
		MyInterface mf = new MyInterface() {
			
			@Override
			public void method1() {
				System.out.println("인스턴스의 메소드");
			}
		}; // 익명 구현 객체
		
		ma.method1();
		ma.method2();
		ma.method3();
		System.out.println();
		mb.method1();
		mb.method2();
		mb.method3();
		System.out.println();
		mc.method1();
		mc.method2();
		mc.method3();
		System.out.println();
		mf.method1();
		mf.method2();
		mf.method3();
		
		
	}

}
