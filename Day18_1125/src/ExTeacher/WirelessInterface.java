package ExTeacher;

public interface WirelessInterface {
	int discountRateMethod(int basePrice); // 할인 요금
	int communicationFeeMethod(int unitPrice, int useTime, int basePrice, int discountRate); // 통신 요금
}
