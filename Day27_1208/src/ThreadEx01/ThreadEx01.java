package ThreadEx01;

import java.util.Map;
import java.util.Set;

public class ThreadEx01 {

	public static void main(String[] args) {

		Music music = new Music();
		Movie movie = new Movie();
		
		movie.setPriority(10);
		music.setDaemon(true);
		
		ThreadGroup threadGroup = new ThreadGroup("Movie");
		Thread m1 = new Thread(threadGroup, music);
		Thread m2 = new Thread(threadGroup, movie);
		m1.start();
		m2.start();
		
		Map map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		for(Thread t : threads) {
			System.out.println(t.getName() + (t.isDaemon()? " 데몬":" 주"));
			System.out.println("소속 그룹: "+ t.getThreadGroup().getName());
		}

		
	}

}
