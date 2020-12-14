package GenericEx;

public class BoxEx {

	public static void main(String[] args) {

		// Object
//		Box box1 = new Box();
//		box1.setObject("사과");
//		box1.setObject("포도");
//		
//		Box box2 = new Box();
//		box2.setObject("바나나");
		
		// generic 사용
		Box box1 = new Box();
		Box<Apple> box2 = new Box<Apple>();
		
		box2.setT(new Apple());
		// box2.setT(new Banana()); // 안 됨
	
		Box<Banana> box3 = new Box<Banana>();
		box3.setT(new Banana());
	
	}

}

class Box<T>{
//	private Object object;
//
//	public Object getObject() {
//		return object;
//	}
//
//	public void setObject(Object object) {
//		this.object = object;
//	}
	
	private T t;
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

class Apple {
	
}

class Banana {
	
}