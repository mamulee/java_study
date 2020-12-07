package p03;

public class MusicThread extends Thread {

	@Override
	public void run() {
		while(true) {
			System.out.println("음악을 재생합니다.");
		}
	}
}
