package p04;

public class CalcThread extends Thread {

	String name;

	public CalcThread(String name) {
		this.name = name;

	}
	
	@Override
	public void run() {
		for(int i=0;i<2000000000;i++) {
			System.out.println(name);
		}
	}


}
