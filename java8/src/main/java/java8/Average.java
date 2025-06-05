package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Average {

	public static void main(String[] args) {
		
		//average
		int a[]= {0};
		List<Integer> d= Arrays.stream(a).boxed().collect(Collectors.toList());
		List<Integer> l=Arrays.asList(1,2,3,4,5);
		
		double asDouble = l.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println(asDouble);
		// square, filter and average.
		List<Integer> ll=Arrays.asList(1,10,20,30,15);
		double asDouble2 = ll.stream().map(e->e*e).filter(e->e>100).mapToInt(e->e).average().getAsDouble();
		System.out.println(asDouble2);		
	}
}
