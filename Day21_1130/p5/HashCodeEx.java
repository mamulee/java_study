package p5;

import java.util.Objects;

public class HashCodeEx {

	public static void main(String[] args) {
		Student s1 = new Student(1,"홍길동");
		Student s2 = new Student(1,"홍길동");
		Student s3 = null;
		
		System.out.println(s1.hashCode());	//Object 클래스의 해시코드 함수
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());	//예외발생
		System.out.println(Objects.hashCode(s1));
		System.out.println(Objects.hashCode(s2));	//Objects클래스의 해시코드
		System.out.println(Objects.hashCode(s3));	//0리턴
	}

}
