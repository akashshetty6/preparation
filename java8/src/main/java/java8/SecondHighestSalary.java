package java8;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SecondHighestSalary {

	public static void main(String[] args) {
		Map<String , Integer> map=new HashMap<>();
		map.put("akash", 100);
		map.put("prajwal", 200);
		map.put("sd", 300);
		map.put("suraj", 400);
		
		map.put("adi", 300);	
		map.put("shri", 400);
		map.put("uday",100);
		
  Optional<Entry<String,Integer>> findFirst = map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).skip(1).findFirst();
  System.out.println(findFirst.get());

 
 Map<Integer, List<String>> collect = map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey,Collectors.toList())));
 System.out.println(collect);
 
 
 Entry<Integer, List<String>> collect2 = collect.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(1);
	
 System.out.println(collect2);
  Map<Integer, List<Entry<String, Integer>>> collect3 = map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue));
  System.out.println(collect3);
	
	}
}
