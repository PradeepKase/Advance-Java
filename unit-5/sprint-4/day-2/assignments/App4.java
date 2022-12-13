package jdbcapp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class App4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
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
//			java.sql.Statement st= conn.createStatement();
//			
//			int x= st.executeUpdate("insert into products values("+id+",'"+pname+"',"++","+price+")");
//			
//			if(x > 0) {
//				System.out.println(x+" recored inserted sucessfully..!");
//			}
//			else
//				System.out.println("insertion fails..");
			
PreparedStatement ps= conn.prepareStatement("insert into student values("+id+",'"+pname+"',?,?)");
			
			ps.setInt(1, id);
			ps.setString(2, pname);
			ps.setInt(3, quantity);
			ps.setInt(4, price);
			int x= ps.executeUpdate();
			
			
			if(x > 0)
				System.out.println("recored inserted successfully..!");
			else
				System.out.println("fails...");
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
