package p7;
//오름차순 : ㄱ~ㅎ return o1.name.compareTo(o2.name);	//문자열 비교
//내름차순 : ㅎ~ㄱ return o2.name.compareTo(o1.name);	//문자열 비교
import java.util.Comparator;
import java.util.Objects;

public class CompareExample {
//객체 비교하기
	public static void main(String[] args) {
		Student s1 = new Student(3,"김명수");
		Student s2 = new Student(5,"홍지연");
		Student s3 = new Student(2,"최수진");
		
		int result=Objects.compare(s1,s2,new StudentComparator());
		if(result==0)System.out.println("s1과 s2가 같은번호");
		else if(result<0) System.out.println("s1과 s2의 앞번호");
		else System.out.println("s1과 s2의 뒷번호");
		

	}


static class Student{
	int sno;	//번호
	String name;
	public Student(int sno,String name) {
		this.sno=sno;
		this.name=name;
		
	}
}
static class StudentComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
//		return o2.name.compareTo(o1.name);	//문자열 자료 비교	- 내림차순
//		return Integer.compare(o1.sno, o2.sno); //정수형 자료 비교 - 오름차순
		return Integer.compare(o2.sno, o1.sno); //정수형 자료 비교 - 내림차순
	}
	}
}