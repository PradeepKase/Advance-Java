package eval4;

public class Product {
private int productid;
private String pname;
private int quantity;
private int price;


public Product() {
}

public Product(int productid, String pname, int quantity, int price) {
	super();
	this.productid = productid;
	this.pname = pname;
	this.quantity = quantity;
	this.price = price;
}

public int getProductid() {
	return productid;
}

public void setProductid(int productid) {
	this.productid = productid;
}

public String getPname() {
	return pname;
}

public void setPname(String pname) {
	this.pname = pname;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

@Override
public String toString() {
	return "Product [productid=" + productid + ", pname=" + pname + ", quantity=" + quantity + ", price=" + price + "]";
}


}
