package p06;

public class Outer {
	int o1 = 10;
	
	void o1Method() {

	}
	
	class Inner {
		int i1 = 20;
		int o1 = 30;
		void ilMethod() {
			System.out.println(this.o1 += 100);
			System.out.println(Outer.this.o1 += 100);
		}
	}
}
