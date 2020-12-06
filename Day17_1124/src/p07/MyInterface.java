package p07;

public interface MyInterface {
	void method1(); // 2010~2019년 구현 클래스 공통, 2020 ~ 
	default void method2() {
		System.out.println("2020년도 이후에 구현 클래스 공통");
	}
	default void method3() {
		System.out.println("2030년도 이후에 구현 클래스 공통");
	}
	
	static void stMethod4() {
		System.out.println("정적 메소드");
	}
}
