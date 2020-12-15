package Generic;

public class Course <T> {
	private String name;
	private T[] students;

	public Course(String name, int capacity) {
		this.name = name;
		this.students = (T[]) new Object[capacity];
		// 타입 파라미터로 배열을 생성하려면 new T[n]으로 할 수 없고,
		// (T[]) new Object(n)으로 해야 한다.
	}

	public String getName() {
		return this.name;
	}
	public T[] getStudents() {
		return this.students;
	}
	
	// 배열에 비어 있는 부분을 찾아서 수강생을 추가하는 메소드
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
	
}
