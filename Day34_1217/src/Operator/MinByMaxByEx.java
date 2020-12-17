package Operator;

import java.util.function.BinaryOperator;

public class MinByMaxByEx {

	public static void main(String[] args) {

		BinaryOperator<Fruit> bo;
		Fruit f;
		
		bo = BinaryOperator.minBy((f1, f2) -> Integer.compare(f1.price, f2.price));
		f = bo.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
		System.out.println(f.name);
		
		bo = BinaryOperator.maxBy((f1, f2) -> Integer.compare(f1.price, f2.price));
		f = bo.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
		System.out.println(f.name);
	}

}

class Fruit {
	String name;
	int price;
	
	Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
}