package p06;

public class Main {

	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner oi = o.new Inner();
		
		oi.ilMethod();
	}

}
