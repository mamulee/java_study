package p02;

public class ClassEx {

	public static void main(String[] args) {
		Car car = new Car();
		
		// Class c = new Class(); => 에러
		Class clazz1 = car.getClass(); // 생성자가 없는 경우의 클래스 API 사용 예시 
		String name = clazz1.getName();
		String sname = clazz1.getSimpleName();
		//Package pack = clazz1.getPackage();
		//String na = pack.getName();
		//위 두 개를 합쳐서:
		System.out.println(clazz1.getPackage().getName());
		// == System.out.println(na);
		
		System.out.println(name);
		System.out.println(sname);
	}

}

class Car {
	
}