package jdbcapp2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Employee3DaoImp implements Employee3{
	@Override
	public String insertEmployee3Details(int eid, String name, String address, int salary) {
		String msg="not inserted";

		
		try(Connection conn=NewApp.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("insert into Employee3 values(?,?,?,?)"); 
			
			ps.setInt(1,eid);
			ps.setString(1,name);
			ps.setString(1,address);
			ps.setInt(1,salary);
			
			int x= ps.executeUpdate();
			if(x>0) {
				msg="recor iserted successfully";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			msg=e.getMessage();
		}
		
		
		return msg;
	}
}
