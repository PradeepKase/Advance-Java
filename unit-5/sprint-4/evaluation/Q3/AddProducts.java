package eval4;

import java.util.Scanner;

public class AddProducts {

public static void main(String[] args) throws ProductException {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the id of the product :");
	int id=s.nextInt();
	System.out.println("Enter the product name of the product :");
	String pname=s.next();
	System.out.println("Enter the quantity of the product :");
	int quantity=s.nextInt();
	System.out.println("Enter the price of the product :");
	int price=s.nextInt();
	
	Product product= new Product();
	product.setProductid(id);
	product.setPname(pname);
	product.setPrice(quantity);
	product.setPrice(price);
	
	ProductDao dao = new ProductDaoImp();
	String msg = dao.addProduct(product);
	System.out.println(msg);
	

}
}
