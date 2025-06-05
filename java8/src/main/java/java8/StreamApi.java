package java8;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StreamApi {
	public static void main(String[] args) {
		
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		  hm.put("Math", 98);
	        hm.put("Data Structure", 85);
	        hm.put("Database", 91);
	        hm.put("Java", 95);
	        hm.put("Operating System", 79);
	        hm.put("Networking", 80);
		List<Map.Entry<String, Integer> > list =
	               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
		
		
        // enter data into hashmap
      
        Collections.sort(list, (o1,o2)->o1.getValue().compareTo(o2.getValue()));
        System.out.println(list);
        
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        System.out.println(temp);
        
		
	}
 
	
	
	
}
