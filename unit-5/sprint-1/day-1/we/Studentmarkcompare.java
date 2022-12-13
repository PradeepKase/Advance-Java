package class1;

import java.util.Comparator;

public class Studentmarkcompare implements Comparator<Student> {

//	@Override
//	public int compare(Student s1, Student s2) {
//		return s1.getMark()>s2.getMark() ? +1 : -1;
//	}
	public int compare(Student s1, Student s2) {
	if(s1.getMark() > s2.getMark())
		return +1;
	else if(s1.getMark() < s2.getMark())
		return -1;
	else
		return s1.getName().compareTo(s2.getName());
	}

}
