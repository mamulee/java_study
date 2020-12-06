package p02;

public class MemberEx {

	public static void main(String[] args) {
		
		Member m = new Member("blue", "이파란");
		
		System.out.println(m);
		
	}

}

class Member {
	private String id;
	private String name;
	
	Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id + " " + name;
	}
}