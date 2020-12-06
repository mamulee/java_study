package Ex;

public class B extends Grade {

	public B(String name, int hour) {
		this.name = name;
		this.hour = hour;
		this.grade = "B";
		this.cost = 81;
		this.charge = 12000;
		discount();
	}
	
}
