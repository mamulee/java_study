package GenericEx02;

public class CompareMethodEx {

	public static void main(String[] args) {

		Pair<Integer, String> p1 = new Pair<Integer, String> (1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String> (1, "사과");
	
		// Util의 메소드가 static이 아닐 경우
		Util util = new Util();
		boolean result = util.compare(p1, p2);
		
		if(result) {
			System.out.println("논리적으로 동등한 객체");
		}
		else {
			System.out.println("논리적으로 동등하지 않은 객체");
		}
	
		
		Pair<Integer, Boolean> p3 = new Pair <Integer, Boolean> (10, true);
		Pair<Integer, Boolean> p4 = new Pair <Integer, Boolean> (10, false);
		result = util.compare(p3, p4);
		if(result) {
			System.out.println("논리적으로 동등한 객체");
		}
		else {
			System.out.println("논리적으로 동등하지 않은 객체");
		}
		
		Pair <Car, Integer> p5 = new Pair<Car, Integer> (new Car("소나타"), 10);
		Pair <Car, Integer> p6 = new Pair<Car, Integer> (new Car("소나타"), 10);
		result = util.compare(p5, p6);
		if(result) {
			System.out.println("논리적으로 동등한 객체");
		}
		else {
			System.out.println("논리적으로 동등하지 않은 객체");
		}
	
	}

}

class Car {
	String name;
	int num;
	Car(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return (name + num).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			Car c = (Car) obj;
			if(name.equals(c.name) && num == c.num) {
				return true;
			}
		}
		return false;
	}
}
