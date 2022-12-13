package class1;
import java.util.*;
public class Treees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> t1=new TreeSet<>();
		t1.add(4);
		t1.add(3);
		t1.add(2);
		t1.add(1);
		t1.add(4); //not allow dublicate becasue its from set family
		System.out.println(t1); //natural sorting apply here
		
		TreeSet<String> t2=new TreeSet<>();
		t2.add("saanu");
		t2.add("tanu");
		t2.add("bhanu");
		t2.add("anu");
		t2.add("anu");//not allow dublicate becasue its from set family
		System.out.println(t2);////natural sorting apply here
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("to sort by roll type 1 or to sort by marks type 2");
		int n=s.nextInt();
		if(n==1) {
			Studentrollcom rcomp=new Studentrollcom();
			TreeSet<Student> ts=new TreeSet<>(rcomp);
//			sortedbyroll();
			ts.add(new Student(13,"paddu",57));
			ts.add(new Student(10,"guddu",52));
			ts.add(new Student(14,"laddu",58));
			ts.add(new Student(13,"addu",52));
			System.out.println(ts);
		}
		else if(n==2){
		Studentmarkcompare mcomp=new Studentmarkcompare();
		TreeSet<Student> ts=new TreeSet<>(mcomp);
		
		ts.add(new Student(13,"paddu",57));
		ts.add(new Student(10,"guddu",52));
		ts.add(new Student(14,"laddu",58));
		ts.add(new Student(13,"addu",52));
		System.out.println(ts);
		}
		else {
			Studentnamecomp ncomp=new Studentnamecomp();
			TreeSet<Student> ts=new TreeSet<>(ncomp);
			ts.add(new Student(13,"paddu",57));
			ts.add(new Student(10,"guddu",52));
			ts.add(new Student(14,"laddu",58));
			ts.add(new Student(13,"addu",52));
			System.out.println(ts);
		}
		
//			TreeSet:
//			=======
//
//			--if we try to add any elements inside the TreeSet, that element
//			must be comparable. otherwise we get a ClassCastException.
//
//			java.lang.Comparable is an interface which have only method:
//
//			public int compareTo(Object obj);
//
//			--if we try to add any element inside the TreeSet class then that element 
//			class must implements the Comparable interface and define the 
//			sorting logic of that object by overriding compareTo method.
//
//
//			Note: all the Wrapper classes and String class internally implements
//			Comparable interface.

// Note: to consider the duplicate element, HashSet and LinkedHashSet class uses equal() and hashCode() method 
//	internally, where as TreeSet class uses compareTo or compare() method.
		

	}

}
