package p02;

public class ThreadNameEx {

	public static void main(String[] args) {

		Thread ct = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: " + ct);
		
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		System.out.println(threadA.getId()+" "+threadA.getName()+" "+threadA.getPriority());
		System.out.println(threadB.getId()+" "+threadB.getName()+" "+threadB.getPriority());
		
		StackTraceElement[] st = threadA.getStackTrace();
		for(StackTraceElement s: st) {
			System.out.println(s.toString());
		}
		
	}

}
