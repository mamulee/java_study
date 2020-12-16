package lambda4;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx {

	public static void main(String[] args) {

		Consumer<String> consumer = t -> System.out.println(t+"8");
		consumer.accept("java");

		// void accept(T t, U u);
		BiConsumer<String, String> biConsumer = (t, u) -> {
			System.out.println(t + u);
		};
		biConsumer.accept("Java", "8");

		// void accept(double value);
		DoubleConsumer doubleConsumer = t -> { 
			t += 100;
			System.out.println(t);
		};
		doubleConsumer.accept(100);
		
		// void accept(T t, int value);
		ObjIntConsumer<Car> objIntConsumer = (t, v) -> {
			System.out.println(t.getName());
			System.out.println(v);
		};
		Car car = new Car("소나타");
		objIntConsumer.accept(car, 100);
		
		// void accept (long value)
		LongConsumer longConsumer = t -> {
			System.out.println(t);
		};
		longConsumer.accept(10);
		
		
	}

}

class Car {
	String name;
	
	public String getName() {
		return name;
	}
	
	public Car(String name) {
		this.name = name;
	}
}