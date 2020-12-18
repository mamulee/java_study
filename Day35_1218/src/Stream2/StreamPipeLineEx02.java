package Stream2;

import java.util.Arrays;
import java.util.List;

public class StreamPipeLineEx02 {

	public static void main(String[] args) {
		List <Student> list = Arrays.asList(
				new Student ("1반", 100, 90),
				new Student ("2반", 80, 100),
				new Student ("1반", 70, 50),
				new Student ("2반", 85, 100)

				);

		int korSumC1 = list.stream().filter(m -> m.getClassname().equals("1반")).mapToInt(Student :: getKor).sum();
		int engSumC2 = list.stream().filter(m ->m.getClassname().equals("2반")).mapToInt(Student::getEng).sum();

		System.out.println("1반 국어점수 합 : " + korSumC1 +"\n2반 영어점수 합 : " + engSumC2);

		int totalKorSum = list.stream()
							.mapToInt(Student :: getKor)
							.sum();
		System.out.println("모든 반의 국어 점수 합: "+ totalKorSum);
		
	}

}

class Student {
	private String classname;
	private int kor;
	private int eng;
	public Student(String classname, int kor, int eng) {
		super();
		this.classname = classname;
		this.kor = kor;
		this.eng = eng;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}


}