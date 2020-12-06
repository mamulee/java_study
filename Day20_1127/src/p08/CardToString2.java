package p08;

import java.util.Date;

public class CardToString2 {

	public static void main(String[] args) {

		Card card = new Card();
		
		System.out.println(card.toString());
		
		Date date = new Date();
		System.out.println(date);
		String name = "이순신";
		String name1 = new String("이순명");
		System.out.println(name);
		System.out.println(name1);
	}
	
}
