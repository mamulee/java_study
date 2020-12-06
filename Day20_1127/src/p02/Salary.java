package p02;

import java.util.Scanner;

public class Salary {

	static int salary;
	static String idNumber;
	
	public static void main(String[] args) {
		try {
		input();
		salaryMethod();
		} catch(SalaryException e) {
			System.out.println(e.getMessage());
		} catch(SabunException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("종료.");
		}
	}

	private static void salaryMethod() throws SalaryException, SabunException {
		if(salary < 0) {
			throw new SalaryException("급여는 음수가 될 수 없습니다.");
		}
		if(idNumber.equals("1234")) {
			throw new SabunException("사번은 필수 입력입니다.");
		}
	}

	private static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("급여 입력: ");
		salary = sc.nextInt();
		System.out.print("사번 입력: ");
		idNumber = sc.next();
	}

}
