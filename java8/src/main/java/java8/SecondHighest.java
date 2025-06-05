package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class SecondHighest {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x=10;
		List<Integer> l=Arrays.asList(1,2,3,4);
		
		int integer = l.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).mapToInt(e->e).findFirst().getAsInt();
		

//		String s="ajash";
//		System.out.printf("%xs",s);
		
//		l.stream().sorted(Collections.reverseOrder()).distinct().
	
	}

}
