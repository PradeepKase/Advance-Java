package eval4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Q1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
		
		
		try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evaluationc4","root","7775")){
			
			PreparedStatement ps = conn.prepareStatement("insert into employee values (1,'kushal','himachal','kushal@gmail.com','123',3000,0)");
			
			int x = ps.executeUpdate();
			
			
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eval4","root","")){
			
			PreparedStatement ps = conn.prepareStatement("select * from department");
			
			int x = ps.executeUpdate();
			
			
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	
	
	try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eval4","root","")){
		
		PreparedStatement ps = conn.prepareStatement("update department set location = 'delhi'");
		
		int x = ps.executeUpdate();
		
		
		
		
	} catch (SQLException e) {
		System.out.println(e.getMessage());
		// TODO: handle exception
	}
	
try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eval4","root","")){
		
		PreparedStatement ps = conn.prepareStatement("update employee set password = '1234'");
		
		int x = ps.executeUpdate();
		
		
		
		
	} catch (SQLException e) {
		System.out.println(e.getMessage());
		// TODO: handle exception
	}
}
}
