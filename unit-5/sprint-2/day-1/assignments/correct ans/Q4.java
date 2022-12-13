package sprint2day1assaignment;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> stu=new HashSet<>();
		stu.add(new Student("N1", 10,500));
		stu.add(new Student("N2", 12,400));
		stu.add(new Student("N3", 13,420));
		stu.add(new Student("N4", 14,440));
		stu.add(new Student("N4", 14,440));
		stu.add(new Student("N6", 16,380));
	
//	List <Product> pro=product.stream().filter(s->s.getQuantity()<10).collect(Collectors.toList());	
//	Collections.sort(pro,(s1,s2) -> s1.getPrice() > s2.getPrice() ? +1 : -1);
//	System.out.println(pro);
//	System.out.println(product);
	
	Set<Student>students=stu.stream().filter(s->s.getMark()<500).collect(Collectors.toSet());
	students.forEach(s->System.out.println(s));
	
	
	}
}
