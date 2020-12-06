package p01;

public class OuterMain {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.ia = 30;
		outer.iaMethod();
		Outer.isa = 100;
		Outer.isaMethod();
		
		Outer.Inner in = outer.new Inner();
		
		in.iia = 40;
		in.iiaMethod();
		System.out.println(in.iia);
		
	}

}
