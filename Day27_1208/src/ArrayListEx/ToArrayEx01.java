package ArrayListEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayEx01 {

	public static void main(String[] args) {

		// ArrayList -> 배열
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("강경오");
		list1.add("고희광");
		list1.add("김상윤");
		list1.add("김이준");
		list1.add("문우경");

		String[] nameArray = list1.toArray(new String[list1.size()]); // String[] = object[]
		System.out.println(nameArray[0]);
		
		// 배열 -> ArrayList
		String[] arr1 = {"홍길동", "정현희", "이순신"};
		List<String> convertArr = Arrays.asList(arr1);
//		convertArr.add("새로운 신입생");
		// add, remove는 사용 불가
		
		System.out.println(convertArr.get(0));
		
		convertArr.set(0, "신입생");
		System.out.println(convertArr.get(0));
		
	}

}
