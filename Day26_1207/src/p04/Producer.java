package p04;

public class Producer extends Thread {

	private Movie m;
	
	public Producer(Movie m) {
		this.m = m;
	}
	
	@Override
	public void run() {
		while(true) {
			m.video();
		}
	}
	
}
