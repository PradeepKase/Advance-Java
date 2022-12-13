package class1;

import java.util.Objects;

public class Student {   //implements Comparable
	
	
	
	private int roll;
	private String name;
	private int mark;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", mark=" + mark + "]";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(mark, name, roll);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return mark == other.mark && Objects.equals(name, other.name) && roll == other.roll;
	}
	
	
	public Student(int roll, String name, int mark) {
		///super();
		this.roll = roll;
		this.name = name;
		this.mark = mark;
	}
	void Showdetails(){
		System.out.println(roll+" "+name+" "+mark);
	}
	
//	@Override
//	public int compareTo(Object obj) {
//		Student s1=this;  //if it returns positive number then s1 is bigger 
//		Student s2=(Student)obj; //if it returns negative number then s2 is bigger 
//		//if(it retuns 0 then both objects are same
//		if(s1.getMark()>s2.getMark()) {
//			return +1;
//		}
//		else if(s1.getMark()<s2.getMark()) {
//			return -1;
//		}
//		else {
//			return 0;
//		}
//	}




}
