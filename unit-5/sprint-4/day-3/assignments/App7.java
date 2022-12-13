package jdbcapp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class App7 {
	public static void main(String[] args) {
//		Develop a JDBC application to list out all the Employee Details whose salary is less than
//		80000;	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String url = "jdbc:mysql://localhost:3306/db3";
		
		try( Connection conn= DriverManager.getConnection(url,"root","") ) {
			
			PreparedStatement ps= conn.prepareStatement("select * from employee3 where salary<800000 ");
			
//			ps.setInt(1, id);
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("Roll is :"+rs.getInt("eid"));
				System.out.println("Roll is :"+rs.getString("name"));
				System.out.println("Roll is :"+rs.getString("address"));
				System.out.println("Roll is :"+rs.getInt("salary"));
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
