package Ex;

public class Main {

	public static void main(String[] args) {
		boolean x = true;
		BusinessLogic b = new BusinessLogic();
		
		while(x) {
			b.display();
			
			switch(b.choice) {
			case 1:
				b.input();
				break;
			case 2:
				b.output();
				break;
			case 3:
				x = false;
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
