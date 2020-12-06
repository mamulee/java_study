package p01;

public class BusinessLogic {
	void start() {
		RemoteControl rc = null;
		RemoteControl rc1 = null;
		
		rc = new SmartTelevision();
		rc.turnOn();
		rc.setVolume(7);
		rc.setMute(true);
		rc.turnOff();
		
		// search() 호출하기
		// down casting 하기
		SmartTelevision sm = (SmartTelevision) rc;
		sm.search("KBS");
		
		rc1 = new Audio();
		rc1.turnOn();
		rc1.setVolume(8);
		rc1.setMute(true);
		rc1.turnOff();
		
		Audio ad = (Audio) rc1;
		ad.search("FM");
		ad.chatting("오디오를 객치화 한 자료입니다~~");
	}
}
