package sprint2day1assaignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums= new ArrayList<>();
		nums.add(3);
		nums.add(5);
		nums.add(7);
		nums.add(8);
		nums.add(2);
		nums.add(1);
		System.out.println(nums);
//		Stream<Integer> n1=nums .stream();
		
		List<Integer> sqrt = nums
								.stream()
								.map(n -> n*n)
								.collect(Collectors.toList());
		
//		nums
//		.stream()
//		.forEach(n-> System.out.println(n*n));

		
		
		System.out.println(sqrt);
	}

}
