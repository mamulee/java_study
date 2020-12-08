package ArrayListEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx04 {

	public static void main(String[] args) {

		final int LIMIT = 10; // 자르고자 하는 글자의 개수를 지정한다.
		String source = "0123456789abcdefghijklmnopqrstuvwxyz!@#$%^&*()ZZZ"; 
		int length = source.length(); 
		System.out.println(length);
		
		List list = new ArrayList(length / LIMIT + 10);
		for(int i=0; i<length; i+= LIMIT) { //i = 0, 10, 20, 30, 40, 5번 반복
			if(i+LIMIT < length) {
					list.add(source.substring(i, i+LIMIT)); // 0부터 10미만, 10부터 20미만 ... 30부터 40미
			}
			else { // 40 ~ 나머지
				list.add(source.substring(i));
			}
		}
		
		for (int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}
