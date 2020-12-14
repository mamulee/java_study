package CollectionEx;

import java.util.ArrayList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
		
		
		for(Board b : list) {
			System.out.println(b.getTitle() + " - "+b.getContent());
		}
		
	}

}

class Board {
	private String title;
	private String content;
	
	Board(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}

class BoardDao {
	public ArrayList getBoardList() {
		return new ArrayList<Board>();
	}
}