package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,2,3,4,5,1,2);

		Set<Integer> collect = l.stream().filter(e->Collections.frequency(l, e)==1).collect(Collectors.toSet());
		System.out.println(collect);
		
		String in="akash";
		System.out.println(Arrays.stream(in.split("")).filter(e->Collections.frequency(Arrays.asList(in.split("")), e)>1).collect(Collectors.toSet()));
		
	}
}
