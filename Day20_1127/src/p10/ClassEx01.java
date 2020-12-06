package p10;

public class ClassEx01 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		Card c = new Card("HEART", 3);
		Card c2 = Card.class.newInstance();
		
		Class cobj = c.getClass();
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(cobj.getName());
		System.out.println(cobj.toGenericString());
		System.out.println(cobj.toString());
	}

}

final class Card {
	String kind;
	int num;
	
	Card() {
		this("SPADE", 1);
	}
	Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "kind: "+kind+", num: "+num;
	}
}