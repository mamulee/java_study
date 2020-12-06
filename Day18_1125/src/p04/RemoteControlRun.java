package p04;

public class RemoteControlRun implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("구현 객체 켜기");
	}

	@Override
	public void turnOff() {
		System.out.println("구현 객체 끄기");
	}

}
