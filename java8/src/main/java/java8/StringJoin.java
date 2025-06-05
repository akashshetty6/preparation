package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StringJoin {

	public static void main(String[] args) {
		List<String> asList = Arrays.asList("1","2","3","4");
		String join = String.join("-", asList);
		System.out.println(join);
		
//		Runnable r=()->System.out.println("hello");
		Thread t=new Thread(()->{
			IntStream.rangeClosed(1, 10).filter(e->e%2==0).forEach(System.out::println);			
		});
		t.start();
		
	}

}
