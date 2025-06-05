package java8;

import java.util.Arrays;
import java.util.List;

public class PrintNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=Arrays.asList(2,1,22,4,233,5);
		l.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2")).forEach(System.out::println);;
	}

}
