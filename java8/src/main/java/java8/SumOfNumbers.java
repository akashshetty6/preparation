package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,2,3,4,5);
		Optional<Integer> reduce = l.stream().reduce((a,b)->a+b);
		System.out.println(reduce.get());		
	}

}