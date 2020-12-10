package TreeSet;

import java.util.TreeSet;

public class TreeSetEx01 {

	public static void main(String[] args) {

		TreeSet<Integer> scores = new TreeSet<Integer>();

		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("가장 낮은 점수: "+ score);
		
		score = scores.last();
		System.out.println("가장 높은 점수: "+ score);
		
		score = scores.lower(95);
		System.out.println("95점 미만의 점수: "+ score);
		
		score = scores.floor(95);
		System.out.println("95점 이하의 점수: "+ score);
		
		score = scores.higher(95);
		System.out.println("95점 위의 점수: "+ score);
		
		score = scores.ceiling(95);
		System.out.println("95점 이상의 점수: "+ score);
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst(); // 검색 후 삭제
			System.out.println(score);
		}
		System.out.println(scores.isEmpty());
		
		
	}

}
