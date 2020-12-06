package Test;

public class District implements Delivery {
	String Location;
	String name;
	int[] amount;
	int[] time;
	int[] priceAmount;
	int[] priceTime;
	int[] priceTotal;
	
	static int cnt = 0;
	@Override
	public int costAmountMethod(int amount) {
		int priceAmount = 0;
		if(amount>=0 && amount<=100) {
			priceAmount = 1000;
		}
		else if (amount>=101 && amount<=200) {
			priceAmount = 2000;
		}
		else if (amount>=201 && amount<=300) {
			priceAmount = 3000;
		}
		else if (amount>=301) {
			priceAmount = 4000;
		}
		return priceAmount;
	}
	@Override
	public int costTimeMethod(int time) {
		int priceTime = 0;
		if(time <1 ) {
			priceTime = 1000;
		}
		else if(time>=1 && time < 2) {
			priceTime = 2000;
		}
		else if(time>=2 && time < 3) {
			priceTime = 3000;
		}
		else if(time >= 3) {
			priceTime = 4000;
		}
		return priceTime;
	}
	@Override
	public int costTotalMethod(int priceAmount, int priceTime) {
		return priceAmount + priceTime;
	}
	
	public void input(int amount, int time) {
		
	}
	public void output() {
		
	}
}
