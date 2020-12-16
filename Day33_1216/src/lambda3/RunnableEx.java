package lambda3;

public class RunnableEx {

	public static void main(String[] args) {

		Runnable r = () -> {
			for(int i=0; i<10; i++) {
				System.out.println(i);
			}
		};
		
		Thread thread = new Thread(r);
		thread.start();
		
		Thread t = new Thread( () -> {
			for(int i=0; i<10; i++) {
				System.out.println(i);
			}
		});
		
		t.start();
		
		
	}

}
