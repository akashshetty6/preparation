package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparatorr {
	public static void main(String[] args) {
		
		List<Integer> n=Arrays.asList(3,4,64,6,8);
		
		Comparator<Integer> c=new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1>o2?1:-1;
			}
		};
		
//		Collections.sort(n);
		Collections.sort(n, c);
		System.out.println(n);
		n.sort(c);
		System.out.println(n);
		
	}

}