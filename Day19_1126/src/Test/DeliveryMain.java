package Test;

public class DeliveryMain {

	public static void main(String[] args) {
		Business b = new Business();
		boolean flag = true;
		
		while (flag) {
			b.display();
			
			switch(b.choice) {
			case 1:
				b.input();
				break;
			case 2:
				b.output();
				break;
			case 3:
				flag = false;
				System.out.println("프로그램 종료.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

}
