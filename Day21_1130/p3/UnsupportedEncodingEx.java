package p3;

import java.io.UnsupportedEncodingException;

public class UnsupportedEncodingEx {
	public static void main(String[] args) {
		String str = "안녕하세요.";
		
		String s1 = str.substring(2);
		System.out.println(s1);
		
		String s2 = str.substring(0,2);	//0~2(미만까지) 
		System.out.println(s2);
		
		String strr = "   띄어 쓰기   ";
		System.out.println(strr.length());
		String trimS1 = strr.trim();
		System.out.println(strr.length());
		System.out.println(trimS1);
		
		int ii=10;
		double dd=10.24;
		Car c = new Car();
		//참조변수의 자료형을 Stirng으로 바꾸기
		String sc = String.valueOf(c);
		System.out.println(sc);
		String sii=String.valueOf(ii);	//10 --> "10"
		String sdd=String.valueOf(dd);	//10.24 --> "10.24"
		System.out.println("--------");
		System.out.println(ii+dd);		//숫자니까 연산가능
		System.out.println(sii+sdd);	//문자니까 붙여 출력
		
		
		
		String rstr = str.replace('안', '감');
		System.out.println(rstr);
		
		String rastr = str.replaceAll("안녕", "수고");
		System.out.println(rastr);
		
		int i = str.indexOf("하");
		System.out.println(i);
		
		if(i==-1) {
			System.out.println("해당 문자는 없습니다.");
		}
		
		//기본문자셋
		//2진수 배열 바꾼 것은 시스템 파일로 만들거나 네트워크로 보낼 때
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1.length);	//인코딩 10진수 --> 2진수 byte[]
		for(byte b:bytes1) {
			System.out.print(b);
		}
		System.out.println();
		String str1 = new String(bytes1);	//디코딩 2진수배열 --> 10진수
		System.out.println(str1);
		
		//한글 완성형으로
		try {
		byte[] bytes2 = str.getBytes("EUC-KR");
		System.out.println(bytes1.length);
		for(byte b:bytes2) {
			System.out.print(b);
		}
		String str2 = new String(bytes2,"EUC-KR");
		System.out.println(str2);
		}catch(UnsupportedEncodingException e) {
			
		}
		//UTF-8로
		try {
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println(bytes3.length);
			for(byte b:bytes3) {
				System.out.print(b);
			}
			String str3 = new String(bytes3,"UTF-8");
			System.out.println(str3);
			}catch(UnsupportedEncodingException e) {
				
			}
	}
}
class Car{
	
}