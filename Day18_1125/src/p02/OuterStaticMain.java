package p02;

import p02.OuterStatic.InnerStatic;

// import p02.OuterStatic.InnerStatic;

public class OuterStaticMain {

	public static void main(String[] args) {
		
		OuterStatic.InnerStatic sin = new OuterStatic.InnerStatic();
		// InnerStatic sin1 = new InnerStatic();
		
		sin.iia = 300;
		sin.iiaMethod();
		InnerStatic.iisa = 100;
		InnerStatic.iisaMethod();
		
		
	}

}
