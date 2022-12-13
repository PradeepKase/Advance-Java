package eval1;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Student> s1= s->s.getMark()<500;
		boolean b=s1.test(new Student(3, "Pradeep",600));
		System.out.println(b);
		}
	}

