package CollectionEx;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {

		TreeSet<Studentt> treeSet = new TreeSet<Studentt>();
		
		treeSet.add(new Studentt("blue", 96));
		treeSet.add(new Studentt("hong", 86));
		treeSet.add(new Studentt("white", 92));
		
		Studentt st = treeSet.last();
		System.out.println("최고 점수: "+st.score);
		System.out.println("최고 점수 아이디: "+st.id);
	}

}

class Studentt implements Comparable {
	String id;
	int score;
	Studentt(String id, int score) {
		this.id = id;
		this.score = score;
	}
	@Override
	public int compareTo(Object o) {
		Studentt st = (Studentt) o;
		if (score < st.score) return -1;
		else if (score == st.score) return 0;
		else return 1;
	}
}