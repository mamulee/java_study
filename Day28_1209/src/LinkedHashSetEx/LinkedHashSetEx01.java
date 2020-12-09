package LinkedHashSetEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx01 {

	public static void main(String[] args) {

		//배열 값 넣기 - 자료형 다양한 것
		Object[] objArr = {1, 1.1, "a", 'a',true, "a", 1};
		int[] intArr = {100,90,80,70,100,40,90};
		//우리 회사에 직위는? 사장, 과장, 대리, 팀장, 사원 
		String[] strArr = {"사장", "과장", "대리", "팀장",
				"사원", "사장", "과장","사장", "과장","대리", "팀장", "사원"};
		//원장 데이터에서 중복된 것을 제외하고 1개의 결과만을 취합해서 정보를 만들 때 주로 사용함

		//objArr 배열의 자료를 HashSet에 넣기 
		Set h   = new LinkedHashSet(); // 순서 보장 확인
		
		Set<Integer> ih   = new HashSet<Integer>();
		Set<String> sh   = new HashSet<String>();
		for(int i=0;i<objArr.length;i++) {
			h.add(objArr[i]);
		}
		for(int i=0;i<intArr.length;i++) {
			ih.add(intArr[i]);
		}
		for(int i=0;i<strArr.length;i++) {
			sh.add(strArr[i]);
		}
		//출력하기
		Iterator it = h.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.print(o+" ");
		}
		System.out.println();
		
		Iterator ith = ih.iterator();
		while(ith.hasNext()) {
			Integer o = (Integer) ith.next();
			System.out.print(o+" ");
		}
		System.out.println();
		
		Iterator its = sh.iterator();
		while(its.hasNext()) {
			String o = (String) its.next();
			System.out.print(o+" ");
		}

	}

}
