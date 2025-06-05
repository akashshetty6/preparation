package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> n=Arrays.asList(2,3,1,5,6,0);
		List<Integer> n1 = n.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(n1);
		
		List<Integer> n2 = n.stream().sorted().collect(Collectors.toList());
		System.out.println(n2);

	}

}
