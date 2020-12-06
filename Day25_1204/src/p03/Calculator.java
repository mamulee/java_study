package p03;

public class Calculator extends Thread {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) {
		System.out.println("여러 스레드가 출력할 수 있는 곳 1");

		synchronized (this) {
			// 임계 영역: 한 스레드만 실행할 수 있는 블록
			this.memory = memory;
			try {
				Thread.sleep(2000); // 2초 동안 일시정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":" + this.memory);
		}
		
		System.out.println("여러 스레드가 출력할 수 있는 곳 2");
	}
}
