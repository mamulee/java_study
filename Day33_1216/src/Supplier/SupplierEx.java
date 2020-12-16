package Supplier;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierEx {

	public static void main(String[] args) {

		// T get();
		Supplier<String> ssupplier = () -> {
			String name = "홍길동";
			return name;
		};
		System.out.println(ssupplier.get());

		Supplier<String> sc = () -> {
			Car car = new Car();
			car.setName("소나타");
			return car.getName();
		};
		System.out.println(sc.get());

		Supplier<Car> suc = () -> {
			Car car = new Car();
			car.setName("소나타");
			return car;
		};
		System.out.println(suc.get());

		BooleanSupplier bs = () -> {
			Car c = new Car();
			c.setName("벤츠");
			return (c.getName().equals("소나타"));
		};
		System.out.println(bs.getAsBoolean());

		DoubleSupplier ds = () -> {
			double d = 30000000 * 0.0225;
			return d;
		};
		System.out.println(ds.getAsDouble());

		IntSupplier is = () -> {
			int price = 30000000;
			return price;
		};
		System.out.println(is.getAsInt());

		// 선생님 답
		Car car = new Car();
		car.setPrice(30000000);
		Supplier<String> supplier = ()->{
			car.setName("소나타");
			return car.getName();
		};

		System.out.println(supplier.get());
		// boolean getAsBoolean();
		BooleanSupplier booleanSupplier = ()->{
			boolean result;
			if(car.getName().equals("소나타"))
				result = true;
			else result = false;
			return result;
		};
		System.out.println(booleanSupplier.getAsBoolean());
		//double getAsDouble();
		DoubleSupplier doubleSupplier = ()-> {
			return car.getPrice() * 0.025;
		};
		System.out.println("가격은 " + doubleSupplier.getAsDouble());
		//int getAsInt();
		IntSupplier intSupplier = ()->{
			return car.getPrice();
		};
		System.out.println("가격 : " + intSupplier.getAsInt());


	}

}

class Car {
	String name;
	int price;
	double tax;

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public int getPrice() {
		return price;
	}
	public double getTax() {
		return tax;
	}



	@Override
	public String toString() {
		return name;
	}


}