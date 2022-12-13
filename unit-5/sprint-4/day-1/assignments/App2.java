package jdbcapp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App2  {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("could not load the driver in main class");
		}
		
		String url="jdbc:mysql://localhost:3306/bank";
		
		try {
			Connection conn=DriverManager.getConnection(url, "root", "");
			if(conn!=null) {
				System.out.println("connected it");
			}
			else {
				System.out.println("Not connected");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
