package class2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import class1.Student;
import class1.Studentrollcom;

public class Demo {

	public static void main(String[] args) {
		
//		SortProducts pcomp=new SortProducts();
		
		List <ProductBean> product = new ArrayList <>();
		product.add(new ProductBean(1, "chair",1, 4000));
		product.add(new ProductBean(2, "sofa",1, 15000));
		product.add(new ProductBean(3, "tv",1, 34000));
		product.add(new ProductBean(4, "laptop",1, 78000));
		product.add(new ProductBean(5, "doll",1, 800));
		
//		Collections.sort(product, new SortProducts());
		
//		System.out.println(product);
		
		//using lamda expression
		Collections.sort(product,(s1,s2) -> s1.getPrice() > s2.getPrice() ? -1 : +1);
		
		System.out.println(product);
		
	}
	
}
