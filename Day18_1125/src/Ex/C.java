package Ex;

public class C extends Grade {
	
	public C(String name, int hour) {
		this.name = name;
		this.hour = hour;
		this.grade = "C";
		this.cost = 104;
		this.charge = 15000;
		discount();
	}

}
