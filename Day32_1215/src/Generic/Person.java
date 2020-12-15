package Generic;

public class Person {
	String job;
	
	public Person(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return job;
	}
	
}
