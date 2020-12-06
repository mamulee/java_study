package p07;

public class ButtonEx {
	int a = 20;
	static int sa = 30;
	void aMethod() {
		new onClickListener() {
			
			@Override
			public void on() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void off() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	static void saMethod() { }
	
	interface onClickListener {
		default void dMethod() {
			// a += 10;
			sa += 20;
			// aMethod();
			saMethod();
		}
		void off();
		void on();
	}
}
