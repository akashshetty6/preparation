package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l=Arrays.asList(1,2,3,1,2,4,5);
		
		List<Employee> collect = Stream.of(new Employee(1, "akash", 30),new Employee(1, "suresh", 31),new Employee(1, "dinesh", 32),new Employee(1, "nilesh", 33)).collect(Collectors.toList());
		
//		Map<Integer, List<Employee>> collect2 = collect.stream().collect(Collectors.groupingBy(Employee::getAge));
	    Map<Integer, List<String>> collect2 = collect.stream().collect(Collectors.groupingBy(Employee::getAge,Collectors.mapping(Employee::getName, Collectors.toList())));
		System.out.println(collect2);
		
//		collect.stream().mapToInt(x->x).max().getAsInt()
		 
		Map<Integer, Long> collect3 = l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect3);
		collect3.entrySet().stream().filter(x->x.getValue()>1).forEach(x->System.out.println(x.getKey()));
		
		System.out.println(collect.stream().sorted((o1,o2)->o1.getAge()-o2.getAge()).collect(Collectors.toList()));
	}

}
