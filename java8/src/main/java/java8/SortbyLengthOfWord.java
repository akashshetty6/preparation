package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortbyLengthOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {"a","bb","ccc","dd"};
		
		Arrays.sort(s, Collections.reverseOrder(Comparator.comparing(x->x.length())));;
		for(String c:s) {
			System.out.println(c);
		}
	
	
		
	Object[] string = Arrays.stream(s).sorted(Collections.reverseOrder(Comparator.comparing(x->x.length()))).toArray();
	for(Object c:string) {
		System.out.println(c);
	}
	}

}
