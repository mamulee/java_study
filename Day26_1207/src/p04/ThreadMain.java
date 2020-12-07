package p04;

public class ThreadMain {

	public static void main(String[] args) {

		Movie m = new Movie();
		
		Producer p = new Producer(m);
		Consumer c = new Consumer(m);
		
		p.start();
		c.start();
		
	}

}
