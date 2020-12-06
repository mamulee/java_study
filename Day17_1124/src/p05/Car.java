package p05;
// 비지니스 로직 부분 클래스
public class Car {
//	Tire frontLeftTire = new HankookTire();
//	Tire frontRightTire = new HankookTire();
//	Tire backLeftTire = new KumhoTire();
//	Tire  backRightTire = new KumhoTire();
	
//	Tire[] tires = {new HankookTire(), new HankookTire(), new HankookTire(), new HankookTire()};
	
	
	void run() {
		Tire[] tires = new Tire[4];
		tires[0] =  new HankookTire();
		tires[1] =  new HankookTire();
		tires[2] =  new HankookTire();
		tires[3] =  new HankookTire();
		
//		frontLeftTire.roll();
//		frontRightTire.roll();
//		backLeftTire.roll();
//		backRightTire.roll();
		
//		for (int i=0; i<tires.length; i++) {
//			tires[i].roll();
//		}
		
		for (Tire t : tires) {
			t.roll();
		}
		
		
	}
}
