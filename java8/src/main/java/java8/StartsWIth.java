package java8;

import java.util.Arrays;
import java.util.List;

public class StartsWIth {

	public static void main(String[] args) {

		List<Integer> list= Arrays.asList(1,2,22,3,233,444);
		
		list.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2")).forEach(System.out::println);
	}

}
