package sprint2day1assaignment;

import java.util.Objects;

public class Student {
	private String name;
	private int roll;
	private int mark;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	public Student() {
		
	}
	public Student(String name, int roll, int mark) {
		super();
		this.name = name;
		this.roll = roll;
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", mark=" + mark + "]";
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
	
	
}
