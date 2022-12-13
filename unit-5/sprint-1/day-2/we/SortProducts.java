package class2;

import java.util.Comparator;

public class SortProducts implements Comparator <ProductBean> {

	@Override
	public int compare(ProductBean o1, ProductBean o2) {
		return (o1.getPrice() - o2.getPrice());
	}
	 
}
