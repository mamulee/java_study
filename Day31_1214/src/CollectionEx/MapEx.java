package CollectionEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		Set<Map.Entry <String, Integer>> entryset = map.entrySet();

		Iterator<Map.Entry<String, Integer>> itr = entryset.iterator();
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		int avg = 0;
		while(itr.hasNext()) {
			Map.Entry<String, Integer> m = itr.next();
			if(m.getValue() > maxScore) {
				maxScore = m.getValue();
				name = m.getKey();
			}
			totalScore += m.getValue();
			avg = totalScore / entryset.size();

		}
		
		System.out.println("평균점수: "+avg);
		System.out.println("최고 점수: "+maxScore);
		System.out.println("최고 점수 아이디: "+name);
		
		System.out.println("==============");
		// 선생님 답:
		for(Map.Entry<String, Integer> entry : entryset) {
			if(entry.getValue() > maxScore) {
				maxScore = entry.getValue();
				name = entry.getKey();
			}
			totalScore += entry.getValue();
		}
		System.out.println("최고 점수: "+maxScore);
		System.out.println("최고 점수 아이디: "+name);
		System.out.println("평균 점수: "+(totalScore / map.size()));
	}

}
