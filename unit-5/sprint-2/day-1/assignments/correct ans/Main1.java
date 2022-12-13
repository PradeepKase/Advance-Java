package sprint2day1assaignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> product=new ArrayList<>();
		product.add(new Product(1,"pen",8,2));
		product.add(new Product(1,"pen",3,3));
		product.add(new Product(1,"pen",4,12));
		product.add(new Product(1,"pen",8,3));
		product.add(new Product(1,"pen",9,15));
		product.add(new Product(1,"pen",10,7));
		
//		Stream<Product> pro1=product.stream();
//		Stream<Product> pro2=pro1.filter(s-> s.getQuantity()<10);
//		pro2.forEach(s->System.out.println(s));
		
		
		//using lamda expression
	List <Product> pro=product.stream().filter(s->s.getQuantity()<10).collect(Collectors.toList());
	
	Collections.sort(pro,(s1,s2) -> s1.getPrice() > s2.getPrice() ? +1 : -1);
	System.out.println(pro);
	System.out.println(product);


	}

}
