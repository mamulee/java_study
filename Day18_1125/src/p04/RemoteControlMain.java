package p04;

public class RemoteControlMain {

	public static void main(String[] args) {

		// RemoteControlRun rcr = new RemoteControlRun();
		RemoteControl rcr = new RemoteControl() {
			int a = 10;
			// static int sa = 20; 구현 객체 클래스명이 없기 때문에 사용 불가
			
			@Override
			public void turnOn() {
				System.out.println("익명 객체 켜기");
			}

			@Override
			public void turnOff() {
				System.out.println("익명 객체 끄기");
			}
			
		};
		rcr.turnOn();
		
		Searchable sc = new Searchable() {
			int sss = 100;
			@Override
			public void s2() {
				cc();
				s1();
				sss += 10;
			}
			
			@Override
			public void s1() {
				// TODO Auto-generated method stub
				
			}
			void cc() {
				
			}
		};
	}

}
