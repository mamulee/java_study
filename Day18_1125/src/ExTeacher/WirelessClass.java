package ExTeacher;

public class WirelessClass implements WirelessInterface {
	String[] custName;
	String gradeCode;
	int unitPrice;
	int basePrice;
	int discountRate;
	int[] useTime;
	int[] communicationFee;

	@Override
	public int discountRateMethod(int basePrice) {
		return (int) (basePrice * 0.1);
	}

	@Override
	public int communicationFeeMethod(int unitPrice, int useTime, int basePrice, int discountRate) {
		return (int)(unitPrice * useTime + basePrice - discountRate);
	}
	
	public void input (String custName, int useTime) {
		
	}
	public void output() {
		
	}
	
	
}
