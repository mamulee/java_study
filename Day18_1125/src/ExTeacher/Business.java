package ExTeacher;

import java.util.Scanner;

public class Business {
	Scanner sc = new Scanner(System.in);
	WirelessClass[] wir = {new AGrade(), new BGrade(), new CGrade(), new DGrade()};
	
	void start() {
		menuDisplay();
	}
	void menuDisplay() {
		boolean flag = true;
		int choice;
		while(flag) {
			System.out.println("-----------------");
			System.out.println("1입력 2.출력 3.종료");
			System.out.println("-----------------");
			System.out.print("선택은? ");
			choice = sc.nextInt();
			switch(choice) {
			case 1: input(); break;
			case 2: output(); break;
			case 3: flag = false; break;
			}
		}
	}
	
	void input() {
		System.out.print("고객명은? ");
		String custname = sc.next();
		System.out.print("등급은? ");
		String grade = sc.next();
		System.out.print("사용 시간? ");
		int useTime = sc.nextInt();
		switch(grade) {
		case "A":
		case "a": wir[0].input(custname, useTime); break;
		case "B":
		case "b": wir[1].input(custname, useTime); break;
		case "C":
		case "c": wir[2].input(custname, useTime); break;
		case "D":
		case "d": wir[3].input(custname, useTime); break;
		default: break;
		}
	}
	
	void output() {
		   System.out.println("------------------------------------------------------");
		   System.out.println("고객명 등급코드 시간당단가 기본요금 사용시간 할인요금 이번달통신요금");
		   System.out.println("------------------------------------------------------");
		   wir[0].output();
		   wir[1].output();
		   wir[2].output();
		   wir[3].output();
	}
}
