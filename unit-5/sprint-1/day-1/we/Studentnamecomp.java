package class1;

import java.util.Comparator;

public class Studentnamecomp implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getName().equals(s2.getName()) ? +1: -1;
//		return s1.getRoll() > s2.getRoll() ? +1: -1;
	}

	
}
