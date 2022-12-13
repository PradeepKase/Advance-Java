package eval4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ProductDaoImp implements ProductDao{

	@Override
	public String addProduct(Product product) {
String msg = "Not Inserted...";
try (Connection conn= DemoUtil.provideConnection()){
	
	PreparedStatement ps= conn.prepareStatement("insert into student values(?,?,?)");
	
	
	ps.setInt(1, product.getProductid());
	ps.setString(2, product.getPname());
	ps.setInt(3, product.getQuantity());
	ps.setInt(4, product.getPrice());
	
	int x=  ps.executeUpdate();
	
	
	if(x > 0)
		msg = "Record Inserted Successfully..";
	
	
} catch (SQLException e) {
	msg = e.getMessage();
}



return msg;
		
	

	}

	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
