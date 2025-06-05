package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Address ad=new Address("abc", "Bhatkal", 1233);
//		Employee e=new Employee(ad, 10,"Akash" );
//		
//		List<Employee> emp=Arrays.asList(e);
//		
//		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		
//		emp.stream().filter(x->x.getAdr().getPincode()==n).forEach(System.out::println);
		
		//////////////
//		List<Integer> emp=Arrays.asList(1,1,2,4,4,5);
//		emp.stream().distinct().forEach(System.out::println);
		/////////////
		int i=0;
		String s="bablu";
		HashMap<Character, Integer> m=new HashMap<>();
		for(char c:s.toCharArray()) {
			m.put(c,m.getOrDefault(c, 0)+1);		
		}
		System.out.println(m);
		
//		String s1=String.join(",",m.values().toString());
//		System.out.println(s1);
		
		List<Double> v=new ArrayList<>();
		//show(v);
	}
	
	public static void show(List<Integer> kl) {
		
	}

}
