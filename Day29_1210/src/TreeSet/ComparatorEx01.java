package TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorEx01 {

	public static void main(String[] args) {

		Set<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
		
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));
		treeSet.add(new Fruit("포도", 5000));
		
		System.out.println(treeSet);
		
	}

}

class Fruit {
	String name;
	int price;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name + " " + price;
	}

	
}

class DescendingComparator implements Comparator { 

	public int compare(Object o1, Object o2) {
		Fruit fruit1 = (Fruit) o1;
		Fruit fruit2 = (Fruit) o2;
		if(fruit1.price < fruit2.price) return 1;
		else if(fruit1.price == fruit2.price) return 0;
		else return -1;

	}
}