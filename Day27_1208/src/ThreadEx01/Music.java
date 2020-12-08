package ThreadEx01;

public class Music extends Thread {

	@Override
	public synchronized void run() {
//		while(true) {
//			System.out.println("음악을 재생합니다.");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		printMethodMs();
	}
	
	public synchronized void printMethodMs() {
		while(true) {
			System.out.println("음악을 재생합니다.");
			notify();
			try {
				wait(1000);
			} catch (InterruptedException e) {

			}
		}
	}
	
	
}
