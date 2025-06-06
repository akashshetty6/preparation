package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class CommonElements {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {4,5,6,7,8};
		
		System.out.println( Arrays.stream(a).filter(n1->Arrays.stream(b).anyMatch(n2->n2==n1)).boxed().collect(Collectors.toList()));
		
		Arrays.stream(a).filter(a1->Arrays.stream(b).anyMatch(b1->b1==a1)).boxed().collect(Collectors.toList());
		
	}

}
