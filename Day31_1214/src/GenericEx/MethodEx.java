package GenericEx;

public class MethodEx {

	public static void main(String[] args) {

		Boxx<Integer> box1 = Util.<Integer> boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);

		Boxx<String> box2 = Util.<String> boxing("홍길동");
		String stringValue = box2.get();
		System.out.println(stringValue);
	}

}

class Util {
	static <T> Boxx <T> boxing(T t) {
		Boxx <T> box = new Boxx <T> ();
		box.set(t);
		return box;
	}
}

class Boxx <T> {
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}