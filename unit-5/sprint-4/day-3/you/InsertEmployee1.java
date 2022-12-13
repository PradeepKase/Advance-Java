package jdbcapp2;

import java.util.Scanner;

public class InsertEmployee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter eid");
int id= s.nextInt();
System.out.println("Enter name");
String name= s.next();
System.out.println("Enter address");
String address= s.next();
System.out.println("Enter salary");
int salary= s.nextInt();

Employee3DaoImp da= new Employee3DaoImp();
String str=da.insertEmployee3Details(id, name, address, salary);
System.out.println(str);
	}

}
