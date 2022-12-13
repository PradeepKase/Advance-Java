package eval4;

import java.util.List;

public class GetAllProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductDaoImp dao = new ProductDaoImp();
		
		try {
		 	List<Product> product = dao.getAllProduct();
		 	product.forEach(s -> System.out.println(s));
			 	
		 	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
