package p04;

public class ThreadStatusEx {

	public static void main(String[] args) {

		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		statePrintThread.start();

	}

}
