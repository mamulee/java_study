package p03;

public class ThreadEx01 {

	public static void main(String[] args) {
	
		MusicThread m = new MusicThread();
		VideoThread v = new VideoThread();
		
		// #1
//		m.start();
//		v.start();
		
		// #3
		v.setPriority(10);
		
		// #4
		m.setDaemon(true);
		
		// #5
		ThreadGroup movieGrp= new ThreadGroup("Movie");

        Thread m1 = new Thread(movieGrp, m);
        Thread v1 = new Thread(movieGrp, v);
        
        m1.start();
		
        System.out.println(m1.getThreadGroup().getName());
	}

}
