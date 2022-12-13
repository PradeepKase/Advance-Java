package eval1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Q2 {
public static void main(String[] args) {
	List <Product> product = new ArrayList <>();
	product.add(new Product(1, "pen",12, 7));
	product.add(new Product(2, "pencil",8, 5));
	product.add(new Product(3, "Sharpener",6, 3));
	product.add(new Product(4, "Scale",1, 6));
	product.add(new Product(5, "Compass",3, 10));
	
	//filtering
product.stream().filter(s->s.getQuantity()<2).forEach(System.out::println);
	
	//using lamda expression
	Collections.sort(product,(s1,s2) -> s1.getPrice() > s2.getPrice() ? -1 : +1);
	
	System.out.println(product);
	// printing all
	product.forEach(System.out::println);
}
}
