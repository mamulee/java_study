package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx01 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("홍길동", 100);
		map.put("김길동", 80);
		map.put("박길동", 90);
		map.put("이길동", 90);
		map.put("최길동", 100);
		
		// 객체 출력
		int score = map.get("홍길동");
		System.out.println(score);
		
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(1, "홍길동");
		
		Map<Integer, Double> map3 = new HashMap<Integer, Double>();
		map3.put(1, 1.1);
		
		// 모두 출력
		// 먼저 모든 키의 값을 구해야 한다
		Set<String> keys = map.keySet();
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.print(key+ " " + map.get(key));
			System.out.println();
		}
		System.out.println("===============");
		for(String s : keys) {
			System.out.print(s+ " " + map.get(s));
			System.out.println();
		}
		
		// Map 안의 객체의 수 
		System.out.println(map.size());
		
		// entrySet
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		Iterator<Map.Entry<String, Integer>> it = entrySet.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> n = it.next();
			System.out.println(n);
			
			String s = n.getKey();
			System.out.println("Key: "+ s);
			int i = n.getValue();
			System.out.println("Value: "+ i);
		}
		System.out.println("==================");
		for(Map.Entry<String, Integer> en : entrySet) {
			System.out.println(en);
		}
		
		
	}

}
