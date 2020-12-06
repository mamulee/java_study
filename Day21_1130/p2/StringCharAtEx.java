package p2;

public class StringCharAtEx {

	public static void main(String[] args) {
		String ssn1 = "010624-1230123";
		String ssn2 = "010624-1230123";	//위 ssn1이랑 hashCode 같으므로 동등객체
		String ssn3 = new String("010624-1230123");
		
		char s1=ssn1.charAt(0);
		char s2=ssn1.charAt(1);
		System.out.print(s1);
		System.out.println(s2);
		
		
		if(ssn1==ssn2) {	//ssn1의 주소와 ssn2의 주소가 같니?
			System.out.println("같은 주민번호");
		}else {
			System.out.println("다른 주민번호");
		}
		if(ssn1==ssn3) {	//ssn1의 주소와 ssn3의 주소가 같니? 같지 않으므로 false
			System.out.println("같은 주민번호");
		}else {
			System.out.println("다른 주민번호");
		}
		if(ssn1.equals(ssn2)) {	//ssn1의 주소의 값과 ssn2의 주소의 값이 같니?
			System.out.println("같은 주민번호");
		}else {
			System.out.println("다른 주민번호");
		}
		if(ssn1.equals(ssn3)) {	//ssn1의 주소의 값과 ssn3의 주소의 값이 같니?
			System.out.println("같은 주민번호");
		}else {
			System.out.println("다른 주민번호");
		}


	}

}
