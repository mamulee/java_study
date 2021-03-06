package p11;

public class InterruptEx {

	public static void main(String[] args) {

		Thread pt = new PrintThread2(); // 다형성
		pt.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pt.interrupt();
		
		
	}

}

class PrintThread2 extends Thread{
	@Override
	public void run() {
		
		// 방법 1
//		try {
//			while(true) {
//				System.out.println("실행 중");
//				Thread.sleep(1);
//			}
//		} catch (InterruptedException e) {
//			System.out.println("예외 발생 종료");
//		}
		
		// 방법 2 
		while(true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) {
				break;
			}
		}
		
		System.out.println("자원정리");
		System.out.println("실행종료");
	}
}