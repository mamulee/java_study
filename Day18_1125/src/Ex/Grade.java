package Ex;

public class Grade implements GradeCode {
	String name;
	String grade;
	int cost;
	int charge;
	int hour;
	double discount;
	double bill;
	
	public void discount() {
		this.discount = this.charge * 0.1;
	}
	public void bill() {
		this.bill = this.cost * this.hour + this.charge - this.discount;
	}
}
