package p02;

import java.util.HashMap;

public class StudentEx {

	public static void main(String[] args) {
		
//		Student s1 = new Student("1234");
//		Student s2 = new Student("1234");
//		Student s3 = new Student("1111");
//		
//		System.out.println(s1.getStudentNum().equals(s2.getStudentNum()));
//		System.out.println(s1.getStudentNum().equals(s3.getStudentNum()));
		
		
		
		
		//Student 키로 총점을 저장하는 HashMap 객체 생성
		HashMap<Student, String>  hashMap = new HashMap<Student, String>();

		//new Student("1")의 점수 95 저장
		hashMap.put(new Student("1"), "95");

		//new Student("1")로 점수를 읽어옴
		String score = hashMap.get(new Student("1"));
		System.out.println(score);
	}

}

class Student {
	private String studentNum;
	

	Student() {
		
	}
	Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student st = (Student) obj;
			if(studentNum.equals(st.studentNum)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	
}