package p03;

public class LocalMemberOuter {
	int ia = 10;
	void iaMethod() {
		System.out.println("외부 "+ ia);
	}
	
	static int isa = 20;
	static void isaMethod() {
		
	}
	void InnerMethod() {
		int ii = 10;
		class LocalInner {
			// 클래스 정의
			int inna = 10;
			void innaMethod() {
				// 외부 클래스 멤버 변경
				ia += 10;
//				ii += 10;
//				System.out.println(ii); // 사용은 가능, 하지만 변경 불가
				System.out.println("로컬 이너 클래스 메소드");
			}
//			static int innsa = 20;
//			static void innsaMethod() {
//				
//			}
			public LocalInner() {
				
			}

		} // end localInner
		
		// localInner 클래스를 객체화 시켜 실행하는 코드 작성
		LocalInner li = new LocalInner();
		li.inna += 20;
		li.innaMethod();
		
	} // end innerMethod()

}
