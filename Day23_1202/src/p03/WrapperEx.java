package p03;

public class WrapperEx {

	public static void main(String[] args) {
		// Boxing
		int i = 100;
		Integer ii = new Integer(100);
		float f = 10.f;
		Float ff = new Float(10.5f);
		char c = 'a';
		Character cc = new Character('a');
		boolean b = true;
		Boolean bb = new Boolean(true);
		
		// Unboxing
		byte bii = ii.byteValue();
		int iv = ii.intValue();
		double dv = ii.doubleValue();
		float fv = ii.floatValue();
		
		System.out.println(bii+" "+iv+" "+dv+" "+fv);

		String s1 = "홍길동";
		String s2 = "1234";
		String s3 = "123-435";
		String s4 = "10.45";
		String s5 = "10000";
		String s6 = "true";

		int ip = Integer.parseInt(s2);
		double dp = Double.parseDouble(s4);
		long lp = Long.parseLong(s5);
		boolean bp = Boolean.parseBoolean(s6);
		System.out.println(ip + dp );
		System.out.println(lp);
		System.out.println(bp);

		int i1 = 100;
		double d1 = 10.5;
		boolean b1 = true;
		char c1 = 'a';
		byte by1 = 1;
		
		String si1 = Integer.toString(i1);
		String sdi1 = Double.toString(d1);
		System.out.println(si1 + sdi1); //연결임


	}

}
