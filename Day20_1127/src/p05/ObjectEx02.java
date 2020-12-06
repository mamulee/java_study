package p05;

public class ObjectEx02 {

	public static void main(String[] args) {
		Value v1 = new Value("홍길동", 30);
		Value v2 = new Value("홍길동", 30);
		Value v3 = new Value("이순신", 30);
		
		if(v1.equals(v2)) {
		System.out.println("같다");
	}
	else {
		System.out.println("다르다");
	}
		if(v1.equals(v3)) {
		System.out.println("같다");
	}
	else {
		System.out.println("다르다");
	}
		
	}

}

class Value {
	String name;
	int v;
	
	public Value(String name, int v) {
		this.name = name;
		this.v = v;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Value) {
			Value value = (Value) obj;
			if(value.name.equals(name) && value.v == v) {
				return true;
			}
		}
		return false;
	}
}