package VectorEx;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx01 {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		list.set(3, new Board("제목6", "내용6", "글쓴이6"));
		list.add(2, new Board("제목7", "내용7", "글쓴이7"));
		list.remove(4);
		
		// 전체 출력 방법 1
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).subject);
		}
		System.out.println();
		// 전체 출력 방법 2
		Iterator<Board> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			Board b = iterator.next();
			System.out.println(b.subject);
		}
		
		Vector<Board> vlist = (Vector) list;
		int ca = vlist.capacity();
		System.out.println("기본 기억 용량: "+ ca);	
		vlist.trimToSize();
		ca = vlist.capacity();
		System.out.println("트림한 기본 기억 용량: "+ca);
		
	}

}

class Board {
	String subject;
	String content;
	String writer;
	
	public Board() {
		
	}
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
}