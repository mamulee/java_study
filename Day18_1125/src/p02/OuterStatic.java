package p02;

public class OuterStatic {
	int ia = 10;
	void iaMethod() {
//		iia += 50;
//		iiaMethod();
//		iisa = 100;
//		iisaMethod();
		// 사용 불가
		InnerStatic.iisa = 100; // 가능
		System.out.println("외부 "+ ia);
	}
	
	static int isa = 20;
	static void isaMethod() {
		
	}
	
	static class InnerStatic{
		// 인스턴스 자신의 멤버
		int iia = 30;
		void iiaMethod() {
			iia -= 10;
			// ia += 30;
			isa += 40;
			// iaMethod();
			isaMethod();
		}
		// 정적 멤버
		static int iisa = 40;
		static void iisaMethod() {
			// ia += 30;
			isa += 40;
			// iaMethod();
			isaMethod();
		}
	}
}
