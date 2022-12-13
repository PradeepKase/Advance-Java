package eval1;

import java.util.function.Consumer;

public class Q1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Student> s2= s -> {
			
			System.out.println("Roll is :"+s.getRoll());
			System.out.println("Name is :"+s.getName());
			System.out.println("Marks is :"+s.getMark());
			
		};
		
		s2.accept(new Student(10, "Ram", 800));
	}

}
