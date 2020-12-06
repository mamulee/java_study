package Test;

public interface Delivery {
	int costAmountMethod(int amount);
	int costTimeMethod(int time);
	int costTotalMethod(int priceAmount, int priceTime);
}
