package Ex;

public class A extends Grade {

	public A(String name, int hour) {
		this.name = name;
		this.hour = hour;
		this.grade = "A";
		this.cost = 86;
		this.charge = 10000;
		discount();
	}

}
