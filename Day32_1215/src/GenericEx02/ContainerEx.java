package GenericEx02;

public class ContainerEx {

	public static void main(String[] args) {

		Container <String, String> container1 = new Container <String, String> ();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		System.out.println(name1 + " "+ job);

		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		System.out.println(name2 + " " + age);
	}

}

class Container <K, V> {
	private K key;
	private V value;
	
	void set(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	K getKey() {
		return this.key;
	}
	V getValue() {
		return this.value;
	}
}