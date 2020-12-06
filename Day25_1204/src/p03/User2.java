package p03;

public class User2 extends Thread {
	private Calculator calculator;

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		setName("User2"); // 스레드 이름 지정
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(50);
	}
}
