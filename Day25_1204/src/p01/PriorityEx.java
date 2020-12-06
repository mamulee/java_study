package p01;

public class PriorityEx {

	public static void main(String[] args) {

		for(int i=1; i<=10; i++) {
			Thread thread = new CalcThread("thread"+i);
			if (i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);;
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);;
			}
	         thread.start(); //Runnable상태로 넣기 --> 스케쥴링(운영체제) --> Running
	         System.out.println();
		}
		
		
	}

}
