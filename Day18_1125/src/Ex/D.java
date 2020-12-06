package Ex;

public class D extends Grade {

	public D(String name, int hour) {
		this.name = name;
		this.hour = hour;
		this.grade = "D";
		this.cost = 52;
		this.charge = 20000;
		discount();
	}

}
