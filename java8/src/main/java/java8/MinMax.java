package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {

		List<Integer> l=Arrays.asList(1,2,3,4,5);
		Integer integer = l.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(integer);
		
		Integer integer1 = l.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(integer1);
		
		System.out.println(l.stream().mapToInt(e->e).max().getAsInt());
		
	}

}
