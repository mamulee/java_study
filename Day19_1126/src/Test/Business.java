package Test;

import java.util.Scanner;

public class Business {
	Scanner sc = new Scanner(System.in);
	int choice;
	District[] dst = {new GangE(), new GangW(), new GangS(), new GangN()};
	static int cnt = 0;
	
	public void display() {
		System.out.println("-------------------------");
		System.out.println("배달 현황 프로그램");
		System.out.println("-------------------------");
		System.out.println("프로그래머: 홍아현");
		System.out.println();
		System.out.println("1.입력 2.출력 3.종료");
		System.out.print("선택 ==> ");
		choice = sc.nextInt();
	}
	
	public void input() {
		System.out.println("배달지구(1.강동지구 2.강서지구 3.강남지구 4.강북지구)");
		System.out.print("선택 ==> ");
		int c = sc.nextInt();
		System.out.print("배달 시간? ");
		int t = sc.nextInt();
		System.out.print("배달량 개수? ");
		int a = sc.nextInt();
		
		switch(c) {
		case 1:
			dst[0].input(a, t);
			cnt++;
			break;
		case 2:
			dst[1].input(a, t);
			cnt++;
			break;
		case 3:
			dst[2].input(a, t);
			cnt++;
			break;
		case 4:
			dst[3].input(a, t);
			cnt++;
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	
	}
	
	public void output() {
		System.out.println("1.지구별로 2.모든 지구 3.종료");
		System.out.print("선택 ==> ");
		int c = sc.nextInt();
		switch(c) {
		case 1:
			System.out.println("출력지구(1.강동지구 2.강서지구 3.강남지구 4.강북지구)");
			System.out.print("선택 ==> ");
			int cc = sc.nextInt();
			switch(cc) {
			case 1:
				System.out.println("--------");
				System.out.println("강동지구");
				System.out.println("--------");
				System.out.println("배달담당\t배달시간\t배달량\t배달요금");
				System.out.println("--------------------------------");
				dst[0].output();
				System.out.println();
				break;
			case 2:
				System.out.println("--------");
				System.out.println("강서지구");
				System.out.println("--------");
				System.out.println("배달담당\t배달시간\t배달량\t배달요금");
				System.out.println("--------------------------------");
				dst[1].output();
				System.out.println();
				break;
			case 3:
				System.out.println("--------");
				System.out.println("강남지구");
				System.out.println("--------");
				System.out.println("배달담당\t배달시간\t배달량\t배달요금");
				System.out.println("--------------------------------");
				dst[2].output();
				System.out.println();
				break;
			case 4:
				System.out.println("--------");
				System.out.println("강북지구");
				System.out.println("--------");
				System.out.println("배달담당\t배달시간\t배달량\t배달요금");
				System.out.println("--------------------------------");
				dst[3].output();
				System.out.println();
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
			break;
		case 2:
			System.out.println("--------------------------------");
			System.out.println("담당지구\n배달담당\t배달시간\t배달량\t배달요금");
			System.out.println("--------------------------------");
			for(int i=0; i<cnt; i++) {
				System.out.print(dst[i].Location+"\t");
				System.out.println();
				dst[i].output();
				System.out.println();
			}
			break;
		case 3:
			System.out.println("프로그램 종료.");
			break;
		default:
			System.err.println("잘못 입력하셨습니다.");
		}
	}
	
	
	
}
