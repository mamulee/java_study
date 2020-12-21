package Container;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class MaleStudentEx {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Student.Sex.MALE),
				new Student("김수애", 6, Student.Sex.FEMALE),
				new Student("신용권", 10, Student.Sex.MALE),
				new Student("박수미", 6, Student.Sex.FEMALE)
				);

		//Stream <Student> totalStream = totalList.stream(); //오리지날 스트림
//		Stream <Student> totalStream = totalList.parallelStream(); //병렬 처리 스트림
//		Stream <Student> maleStream =totalStream.filter(s->s.getSex() == Student.Sex.MALE);
//		Supplier <MaleStudent> supplier = () -> new MaleStudent();
//		BiConsumer<MaleStudent, Student> accumulator = (m,s) ->m.accumulate(s);
//		BiConsumer<MaleStudent, MaleStudent> combiner = (ms1, ms2) -> ms1.combine(ms2);
//		
//		MaleStudent maleStudent = maleStream.collect(supplier, accumulator, combiner);
//		System.out.println(maleStudent.getList());
		
		// 람다식 표현
//		MaleStudent maleStudent = totalList.stream()
//			      .filter(s->s.getSex() == Student.Sex.MALE)
//			      .collect(
//			         ()->new MaleStudent(), 
//			         (r, t) -> r.accumulate(t),
//			         (r1, r2) -> r1.combine(r2) );
		
		// 메소드 참조로 표현
		MaleStudent maleStudent = totalList.stream()
			     .filter(s->s.getSex() == Student.Sex.MALE)
			    .collect(MaleStudent::new, MaleStudent::accumulate, MaleStudent::combine);
	}

}
