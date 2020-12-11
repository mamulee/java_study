package Collections;

import java.util.Stack;

public class StackEx01 {

	public static void main(String[] args) {

		Stack<Coin> coinBox = new Stack<Coin>();
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		System.out.println(coinBox.peek());
		System.out.println(coinBox.isEmpty());
		
//		while(!coinBox.isEmpty()) {
//			System.out.println(coinBox.pop());
//		}
//		System.out.println(coinBox.isEmpty());
	
	
	
	
	}

}

class Coin {
	int money;
	public Coin(int money) {
		this.money = money;
	}
	
	@Override
	public String toString() {
		return "꺼내온 돈: "+money;
	}
}