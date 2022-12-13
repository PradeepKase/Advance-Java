package class1;
import java.util.*;
public class Demo {
	
	public List<Student> getStudentList(){
	
//		List<Student> st=new ArrayList<Student>();
		LinkedList<Student> st=new LinkedList<Student>();
		st.add(new Student(2,"N1",800));
		st.add(new Student(3,"N2",900));
		st.add(new Student(4,"N3",700));
		st.add(new Student(5,"N4",500));
		st.add(new Student(6,"N5",900));
		
		System.out.println(st.size());
		return st;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.setRoll(1158);
		s1.setName("paddu");
		s1.setMark(100);
		
//		s1.Showdetails();
//		String x=;
		System.out.println(s1.getName());
		System.out.println(s1.getRoll());
		System.out.println(s1.getMark());
		
		
		Student s2=new Student(21,"siddu", 99);
		System.out.println(s2.getName());
		System.out.println(s2.getRoll());
		System.out.println(s2.getMark());
		
		Student s3=new Student(21,"siddu", 99);
		System.out.println(s3.getName());
		System.out.println(s3.getRoll());
		System.out.println(s3.getMark());
		
		
		Demo d=new Demo();
		System.out.println(d.getStudentList());
		
		Set<Student> s=new HashSet<>();
		s.add(new Student(21,"dont",21));
		s.add(new Student(21,"donta",21)); 
		s.add(new Student(21,"donts",21));
		s.add(new Student(21,"dont",21));
		s.add(new Student(21,"dont",21));  
		//new operator creats new space to store each obj so this is physically equal but not logically 
		//equal. so get o/p set size=5 to make it logically equal we use over ride 
		//Hashcode and quals method in Student class
		System.out.println(s.size());
		
		System.out.println(s2.equals(s3));
//in order to identify the dublicate elements HashSet and LinkedHashSet class uses equals() and Hashcode() methods
//**All collection classes are mutually inclusive i.e we can convert any type of
//collection to any other collection very easily:
	}

}
