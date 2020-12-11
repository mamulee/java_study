package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx01 {

	public static void main(String[] args) {

		String[] data = { "A","K","A","K","D","K","A","K","K","K","Z","D" };
		HashMap map = new HashMap();
		
		for (int i=0; i<data.length; i++) {
			if(map.containsKey(data[i])) {
				
				Integer value = (Integer) map.get(data[i]);
				map.put(data[i], new Integer(value.intValue()+1));
			
			}else {
				map.put(data[i], 1);
			}
			
		}
		
		Iterator itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			
			int value = ((Integer) entry.getValue()).intValue();
			System.out.println(entry.getKey()+" : "+printBar('#', value)+" "+value);
		}
		
	
		
	} // end main
	
	public static String printBar(char ch, int value) {
		char[] bar = new char[value];
		
		for(int i=0; i<bar.length; i++) {
			bar[i] = ch;
		}
		
		return new String(bar);
	}

}
