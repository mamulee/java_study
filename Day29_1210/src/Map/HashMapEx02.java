package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx02 {

	public static void main(String[] args) {

		Map<Person, Integer> map = new HashMap<Person, Integer>();
		
		map.put(new Person(123, "서울", "홍길동"), 100);
		map.put(new Person(234, "인천", "김길동"), 90);
		map.put(new Person(345, "부천", "박길동"), 200);
		map.put(new Person(123, "서울", "홍길동"), 300);
		
		System.out.println(map.get(new Person(123, "서울", "홍길동")));
		
		Set<Map.Entry<Person, Integer>> entrySet = map.entrySet();
		
		Iterator<Map.Entry<Person, Integer>> itr = entrySet.iterator();
		while(itr.hasNext()) {
			Map.Entry<Person, Integer> n = itr.next();
			System.out.println(n);
		}
	}

}

class Person {
	int tel;
	String city;
	String name;
	int pointJumsu;
	
	public Person(int tel, String city, String name) {
		this.tel = tel;
		this.city = city;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return (tel+city+name).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			return tel==p.tel && city.equals(p.city) && name.equals(p.name);
		}
		return false;
	}
	
	@Override
	public String toString() {
		return tel + " " + city + " " + name;
	}
}