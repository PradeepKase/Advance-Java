package jdbcapp1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class App6 {
public static void main(String[] args) {
//● Develop a JDBC application to get all employee’s all details from the table
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter eid to Employees based on Id.");
	int id= sc.nextInt();
	
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	String url = "jdbc:mysql://localhost:3306/db3";
	
	try( Connection conn= DriverManager.getConnection(url,"root","") ) {
		
		PreparedStatement ps= conn.prepareStatement("select * from employee3 where eid = ?");
		
		ps.setInt(1, id);
		
		ResultSet rs= ps.executeQuery();
		
		if(rs.next()) {
			
			int eid= rs.getInt("eid");
			String name= rs.getString("name");
			String add= rs.getString("address");
			String sal=rs.getString("salary");
			
			System.out.println("id is :"+eid);
			System.out.println("Name is :"+name);
			System.out.println("address is :"+add);
			System.out.println("salary is :"+sal);
			
		}else
			System.out.println("Student does not exist with Roll :"+id);
		
		
		
		
		
		
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
}
}
