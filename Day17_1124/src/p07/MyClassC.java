package p07;

public class MyClassC implements MyInterface {

	@Override
	public void method1() {
		System.out.println("C: 2030년 코드");
	}
	
	@Override
	public void method3() {
		MyInterface.stMethod4();
	}
	
	
}
