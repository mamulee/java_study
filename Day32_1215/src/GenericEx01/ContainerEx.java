package GenericEx01;

public class ContainerEx {

	public static void main(String[] args) {

		Container <String> container1 = new Container<String>();
		container1.set("홍길동");
		String str = container1.get();
		System.out.println(str);
		
		Container<Integer> container2 = new Container<Integer>();
		container2.set(6);
		int value = container2.get();
		System.out.println(value);
	}

}

class Container <T> {
	private T t;
	
	T get() {
		return t;
	}
	
	void set (T t) {
		this.t = t;
	}
}