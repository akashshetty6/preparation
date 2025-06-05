package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a= {1,2,3,4,3,1};
		List<Integer> l=new ArrayList<>(Arrays.asList(a));
		String in="akash hello akash akash";
		
		Map<String, Long> collect = Arrays.stream(in.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
		Map<Integer, Long> collect2 = Arrays.stream(a).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect2);
				
		System.out.println(	l.stream().filter(e->Collections.frequency(l, e)>1).collect(Collectors.toSet()));
			
		List<Entry<String,Long>> collect3 = collect.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList());
		
		
		System.out.println(collect3);
		
	}

}
