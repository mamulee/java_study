package lambda1;

public class LocalVariableEx {

	static void method(int arg) {
		
		int localVar = 40;
		//localVar += 100;
		//arg -= 100;	=> 얘네는 final 특징을 가져서 바꿀 수 없다.
		
		MyFunctionalInterface fi = () -> {
			System.out.println("arg "+ arg);
			System.out.println("localVar: "+localVar);
		};
		fi.method1();
	}
	
	
	public static void main(String[] args) {

		LocalVariableEx l = new LocalVariableEx();
		l.method(20);
		method(500);
	
		
	}

}
