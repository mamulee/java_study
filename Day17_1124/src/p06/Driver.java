package p06;

public class Driver {
//	public void drive(Vehicle vehicle) {
//		vehicle.run();
//	}
	
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
			bus.run();
		}
		else if (vehicle instanceof Taxi) {
			Taxi taxi = (Taxi) vehicle;
			taxi.run();
		}
		else if (vehicle instanceof Vehicle) {
			vehicle.run();
		}
	}
	
}
