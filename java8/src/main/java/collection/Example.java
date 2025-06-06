package collection;

import java.util.Arrays;
import java.util.List;

public class Example {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,2,3);
		
		l.stream().map(x->x*x).forEach(System.out::println);
	}

}
