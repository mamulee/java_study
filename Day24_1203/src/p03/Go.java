package p03;

public class Go extends Thread {
//	public void go() {
//		while(true) {
//			System.out.println("go");
//		}
//	}

	@Override
	public void run() {
		while(true) {
			System.out.println("Go!");
		}
	}

}
