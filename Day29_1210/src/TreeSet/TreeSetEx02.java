package TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx02 {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("apple");
		treeSet.add("forever"); 
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		
		System.out.println("c~f 사이의 단어 검색");
		//NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
		//NavigableSet<String> rangeSet = treeSet.headSet("c", true); // c 이전
		NavigableSet<String> rangeSet = treeSet.tailSet("c", true); // c 이후
	
		for(String word : rangeSet) {
			System.out.println(word);
		}
	}

}
