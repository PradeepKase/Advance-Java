package sprint2day1assaignment;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> student=new ArrayList<>();
		student.add(new Student("N1", 10,500));
		student.add(new Student("N2", 12,400));
		student.add(new Student("N3", 13,420));
		student.add(new Student("N4", 14,440));
		student.add(new Student("N5", 15,600));
		student.add(new Student("N6", 16,380));
		
		Optional<Student> opt = student.stream().max( (s1,s2) -> s1.getMark() > s2.getMark() ? +1 :-1);
		Student maxStudent= opt.get();
		
		System.out.println(maxStudent);
	}

}
