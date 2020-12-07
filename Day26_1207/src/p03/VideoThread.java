package p03;

public class VideoThread extends Thread {

	@Override
	public void run() {
		while(true) {
			System.out.println("동영상을 재생합니다.");
		}
	}
}
