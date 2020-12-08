package ArrayListEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list1 = new ArrayList<String>();
		
		list1.add("강경오");
		list1.add("고희광");
		list1.add("김상윤");
		list1.add("김이준");
		list1.add("문우경");
		
		System.out.println("학생 이름을 입력하세요: ");
		String cityName = sc.next();
		if(list1.contains(cityName)) {
			System.out.println("우리반 학생입니다.");
		}
		else {
			System.out.println("우리반 학생이 아닙니다.");
		}

	}

}
