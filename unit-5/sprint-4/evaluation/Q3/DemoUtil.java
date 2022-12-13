package eval4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoUtil {
public static Connection provideConnection() {
	Connection conn =null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String url="jdbc:mysql://Localhost:3306/eval4";
	
	try {
		conn = DriverManager.getConnection(url,"root","");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} //i have not set password
	
	return conn;
}

}
