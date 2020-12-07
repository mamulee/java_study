package p04;

public class Consumer extends Thread {
	private Movie m;
	
	public Consumer(Movie m) {
		this.m = m;
	}
	
	@Override
	public void run() {
		while(true) {
			m.music();
		}
	}
}
