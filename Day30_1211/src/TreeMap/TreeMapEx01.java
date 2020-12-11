package TreeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx01 {

	public static void main(String[] args) {

		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(87, "홍길동");
		scores.put(98, "이동수");
		scores.put(75, "박길순");
		scores.put(95, "신용권");
		scores.put(80, "김자바");
		
//		Map.Entry<Integer, String> entry = null;
//		
//		entry = scores.firstEntry();
//		System.out.println("가장 낮은 점수: " +entry);
//		
//		entry = scores.lastEntry();
//		System.out.println("가장 높은 점수: " + entry);
//		
//		entry = scores.lowerEntry(95);
//		System.out.println("95 바로 밑 점수: "+ entry);
//		
//		entry = scores.higherEntry(95);
//		System.out.println("95 바로 위 점수: " + entry);
		
		
		NavigableMap<Integer, String> dm = scores.descendingMap();
		Set<Map.Entry<Integer, String>> dmEntry = dm.entrySet();
		for(Map.Entry<Integer, String> e : dmEntry) {
			System.out.println(e.getKey()+" - "+e.getValue());
		}
		
		
	}

}
