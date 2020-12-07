package p02;

import java.util.Map;
import java.util.Set;

import p01.AutoSaveThread;

public class ThreadInfoEx {

	public static void main(String[] args) {
		
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		
		autoSaveThread.setName("AutoSaveThread"); // 스레드 이름 만들기
		autoSaveThread.setDaemon(true); // 데몬 스레드 만들기
		
		// 스레드 동작 시키기 (RUNNABLE 상태)
		autoSaveThread.start();
		
		// 프로세스의 모든 스레드 상황을 구해주는 메소드
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		// map계열에서 key값들을 리턴해 주는 메소드
		Set<Thread> threads = map.keySet();
		
		for(Thread t : threads) {
			System.out.println("Name: "+t.getName()+ (t.isDaemon()? " 데몬":" 주"));
			System.out.println("\t 소속 그룹: "+ t.getThreadGroup().getName());
		}
	
	}
}
