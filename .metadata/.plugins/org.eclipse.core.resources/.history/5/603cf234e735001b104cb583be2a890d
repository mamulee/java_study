package p07;

public class JoinEx {

	public static void main(String[] args) {
		
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("합: " + sumThread.getSum());
	}

}
