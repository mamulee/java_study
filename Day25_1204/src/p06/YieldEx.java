package p06;

public class YieldEx {

	public static void main(String[] args) {
	      ThreadA threadA = new ThreadA(); //스레드의 NEW 상태
	      ThreadB threadB = new ThreadB();
	      
	      threadA.start(); //RUNNABLE 상태
	      threadB.start();
	      
	      try {
	         Thread.sleep(3000);
	      } catch (InterruptedException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	      threadA.work = false;
	      try {
	         Thread.sleep(3000);
	      } catch (InterruptedException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	      threadA.work = true;
	}

}
