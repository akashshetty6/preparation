package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequentWords {

	public static void main(String[] args) {
		String s="hi akash how are you akash what are you doing akash";
		int n=4;
		
		String[] split = s.split(" ");
		List<String> asList = Arrays.asList(split);
		Map<String, Long> collect = asList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	
		collect.entrySet().stream().sorted((o1,o2)->Integer.valueOf((int)(o2.getValue()-o1.getValue()))).limit(4).forEach(x->System.out.println(x.getKey()));
		
		System.out.println(collect);
		List<Entry<String,Long>> limit = collect.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList());
		
		System.out.println(limit);
//		Map<Long, List<String>> collect2 = limit.collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey,Collectors.toList())));
//		System.out.println(collect2);
		
//		Map<Object, List<Object>> collect3 = limit.collect(Collectors.groupingBy(Map.Entry::getKey,Collectors.mapping(Map.Entry::getValue,Collectors.toList())));
//		System.out.println(collect3);
		
		int w=9;
		System.out.println(Integer.toBinaryString(w));
	}
}
