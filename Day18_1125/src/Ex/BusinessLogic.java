package Ex;

import java.util.Scanner;

public class BusinessLogic {
	Scanner sc = new Scanner(System.in);
	Grade[] customer = new Grade[10];
	int choice;
	String answer;
	int index = 0;
	
	public void display() {
		System.out.println("----------------");
		System.out.println("무선 통신 요금 계산");
		System.out.println("----------------");
		System.out.println("1.입력 2.출력 3.종료");
		System.out.print("선택 ==> ");
		choice = sc.nextInt();
		
	}
	public void input() {
		do {
			System.out.println("----------------");
			System.out.println("    입 력");
			System.out.println("----------------");
			System.out.print("고객명: ");
			String n = sc.next();
			System.out.print("등급 코드: ");
			String g = sc.next();
			System.out.print("사용 시간: ");
			int h = sc.nextInt();

			if (g.equals("A")) {
				customer[index] = new A(n, h);
				customer[index].bill();
			}
			else if (g.equals("B")) {
				customer[index] = new B(n, h);
				customer[index].bill();
			}
			else if (g.equals("C")) {
				customer[index] = new C(n, h);
				customer[index].bill();
			}
			else if (g.equals("D")) {
				customer[index] = new D(n, h);
				customer[index].bill();
			}
			index++;
			System.out.print("계속 입력하시겠습니까?(Y/N): ");
			answer = sc.next();
		} while(answer.equals("y") || answer.equals("Y"));
	}
	
	public void output() {
		System.out.println("----------------");
		System.out.println("    출 력");
		System.out.println("----------------");
		System.out.println("고객명\t등급코드\t시간당단가\t기본요금\t사용시간\t할인요금\t이번달통신요금");
		for(int i=0; i<index; i++) {
			System.out.println(customer[i].name+"\t"+customer[i].grade+"\t"+customer[i].cost+"\t"+customer[i].charge+"\t"+customer[i].hour+"\t"+customer[i].discount+"\t"+customer[i].bill);
		}
	}
	
	
}
