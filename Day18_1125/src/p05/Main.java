package p05;

public class Main {

	public static void main(String[] args) {
		
		// 일반적인 방법
//		Child1 c1 = new Child1();
//		Child2 c2 = new Child2();
//		
//		c1.p1();
//		c2.c2();
		
		int aa = 30;
		// 추상 클래스 부모를 익명 자식 객체로 만들기
		Parent p1 = new Parent() {
			int a = 10;
			@Override
			public void ap1() {
				System.out.println("익명 자식 객체 추상 메소드");
			}
			public void ss() {
				a += 20;
				// aa += 10; 변경 불가, 사용은 됨
			}
		};
		
		// 일반 클래스 부모를 익명 자식 객체로 만들기
		Parent2 p2 = new Parent2() {
			@Override
			public void p2() {
				// 필수 아님
				super.p2();
			}
		};
		
		
		
	}
}
