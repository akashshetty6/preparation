package codility;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;

public class Segregate {

	public static void main(String[] args) {
		Hashtable

		Integer a[]= {1,1,0,1,0,1,0};
		List<Integer> l=Arrays.stream(a).collect(Collectors.toList());
		
		for(int i=0;i<l.size();i++) {
			if(l.get(i)==1) {
				l.remove(l.get(i));
				l.add(1);
			}
			
		}

	
		for(Object i:l.toArray()) {
			System.out.print(i);
		}
	}

}
