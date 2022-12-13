package eval1;

import java.util.function.Supplier;

public class Q1c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Student> s3= ()->{
		Student s= new Student(16,"p",600);
		return s;
//			System.out.println("Name is :"+s.getName());
//			System.out.println("Marks is :"+s.getMark());
			 
		};
		Student s;
		System.out.println( s3.get());
//		s3.get(s.getMark());	
//		s3.get(s.getMark());
		

	}

}
