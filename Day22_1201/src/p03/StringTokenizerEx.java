package p03;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		
		String text = "홍길동/이수홍/박연수;정현희";
		
		StringTokenizer st = new StringTokenizer(text, "/|;");
		int count = st.countTokens();
		System.out.println("토큰의 개수: "+ count);
		
		for(int i=0; i<count; i++) {
			String tokenValue = st.nextToken();
			System.out.println(tokenValue);
			boolean hmt = st.hasMoreTokens();
			System.out.println("남아 있는 토큰이 있으면 true: "+hmt);
		}
		while(st.hasMoreTokens()) {
			String tokenValue = st.nextToken();
			System.out.println(tokenValue);
		}
	}

}
