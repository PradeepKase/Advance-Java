package class2;

import java.util.List;

public class PrintListSolved {

	public static void main(String[] args) {
		
		PrintList i1=new PrintList() {
			@Override
			public void display(List<String> city) {
				
				System.out.println(city);
			}
		};
	}

}
