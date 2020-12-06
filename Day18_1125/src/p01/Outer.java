package p01;
// 인스턴스 내부 클래스 예제
public class Outer {
	// 인스턴스 멤버
	int ia = 10;
	void iaMethod() {
		// 내부 클래스 멤버 사용하기
//		Inner in = new Inner();
//		in.iia += 10;
//		in.iiaMethod();
		System.out.println("이곳은 외부클래스의 메소드 부분입니다. " + ia);
	}
	// 정적 멤버
	static int isa = 20;
	static void isaMethod() {
		
	}
	class Inner {
		//자신의 멤버
		int iia = 30;
		void iiaMethod() {
			// 밖에 있는 클래스 멤버 사용
			ia += 30;
			isa += 40;
			iaMethod();
			isaMethod();
			System.out.println("이곳은 내부 클래스 부분입니다." + iia);
		}
//		static int iisa = 40;
//		static void iisaMethod() {
//			
//		}
	}
	
	
	
	
}
