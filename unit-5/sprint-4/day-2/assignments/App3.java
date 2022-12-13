package jdbcapp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Statement;

public class App3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("add products here");

		
		

		


//	int n=s.nextInt();
//	if(n==1) {
		while(true) {
			System.out.println("Enter the id of the product :");
			int id=s.nextInt();
			System.out.println("Enter the product name of the product :");
			String pname=s.next();
			System.out.println("Enter the quantity of the product :");
			int quantity=s.nextInt();
			System.out.println("Enter the price of the product :");
			int price=s.nextInt();
			
			
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			String url="jdbc:mysql://Localhost:3306/web20sb101db";
			
	try (Connection conn=  DriverManager.getConnection(url,"root","")){
				
				
				java.sql.Statement st= conn.createStatement();
				
				int x= st.executeUpdate("insert into products values("+id+",'"+pname+"',"+quantity+","+price+")");
				
				if(x > 0) {
					System.out.println(x+" recored inserted sucessfully..!");
				}
				else
					System.out.println("insertion fails..");
				
			
			}catch(SQLException e) {
				e.printStackTrace();
			}
	System.out.println("if want to add more products press 1 or press 2 to exit");
	int m= s.nextInt();
	if(m==2) {
		System.out.println("exited");
		break;
	}else if(m!=2 && m!=1) {
		System.out.println("exit from data base because pressed >1 or <1");
		break;
	}
	}
	
	
//		System.out.println("Enter the id of the product :");
//		int id=s.nextInt();
//		System.out.println("Enter the product name of the product :");
//		String pname=s.next();
//		System.out.println("Enter the quantity of the product :");
//		int quantity=s.nextInt();
//		System.out.println("Enter the price of the product :");
//		int price1=s.nextInt();	
//	}
		
	}

}
