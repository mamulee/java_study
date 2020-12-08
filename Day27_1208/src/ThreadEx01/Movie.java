package ThreadEx01;

public class Movie extends Thread {
	
	@Override
	public synchronized void run() {
//		while(true) {
//			System.out.println("동영상을 재생합니다.");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		printMethodMv();
		
	}
	
	public synchronized void printMethodMv() {
		while(true) {
			System.out.println("동영상을 재생합니다.");
			notify();
			try {
				wait(1000);
			} catch (InterruptedException e) {

			}
		}
	}
	
}
