package p05;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx01 {

	public static void main(String[] args) {

		ArrayList<Object> al = new ArrayList<Object>();
		// 혹은 다형성 이용
		List l = new ArrayList();
		
		al.add(new Integer(10));
		al.add(new Integer(20));
		al.add(10);
		al.add(1.1);
		al.add(3.3);
		al.add(true);
		al.add(false);
		al.add(new Car());
		al.add(new Student());
		al.add(new Car());
		al.add(new Car());
		al.add(3, 10); // 값이 인덱스 3에 들어가고 원래 3의 값부터 나머지는 다 뒤로 밀
		
		// ArrayLiat 안에 있는 내용 출력
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
	}

}

class Car {
	
}
class Student {
	
}
