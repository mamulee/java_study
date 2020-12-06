package p06;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Vehicle bus1 = new Bus();
		Taxi taxi = new Taxi();
		Vehicle taxi1 = new Taxi();
		
//		driver.drive(bus);
//		driver.drive(taxi);
//		
//		bus.checkFare();
//		// bus1.checkFare(); // 안 됨
//		Bus bus2 = (Bus) bus1;
//		bus2.checkFare();
		
		driver.drive(bus1);
		driver.drive(taxi1);
		
		Vehicle v = new Vehicle() {

			@Override
			public void run() {
				System.out.println("달린다.");
			}
			
		};
		
		
	}

}
