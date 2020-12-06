package p03;

public class Come extends Thread {
//	public void come() {
//		while(true) {
//			System.out.println("come");
//		}
//	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println("come");
		}
	}

}
