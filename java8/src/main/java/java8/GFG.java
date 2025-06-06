package java8;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GFG {

	// function to sort hashmap by values
	public static HashMap<String, Double> sortByValue(HashMap<String, Double> hm){
		// Create a list from elements of HashMap
		List<Map.Entry<String, Double> > list= new LinkedList<>(hm.entrySet());

		// Sort the list using lambda expression
		Collections.sort(list,(i1,i2) -> i1.getValue().compareTo(i2.getValue()));

		// put data from sorted list to hashmap
		HashMap<String, Double> temp= new LinkedHashMap<String, Double>();
		for (Map.Entry<String, Double> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}

//		String[] array =  temp.keySet().toString().split(",");
//		List<String> asList = Arrays.asList(array);
//		System.out.println(asList);
//		String ans=String.join(",", asList);
//		System.out.println(ans);
		
		StringBuilder sb=new StringBuilder("");
		String x="";
		for(String s:temp.keySet()) {
			sb.append(s).append(",");
		}
		System.out.println(sb.replace(sb.length()-1, sb.length(), ""));
		return temp;
	}

	// Driver Code
	public static void main(String[] args)
	{

		HashMap<String, Double> hm
			= new HashMap<String, Double>();

		// enter data into hashmap
		hm.put("akash", 5.6);
		hm.put("suraj", 5.8);
		hm.put("kk", 6D);
		
		Map<String, Double> hm1 = sortByValue(hm);

		// print the sorted hashmap
		for (Map.Entry<String, Double> en :hm1.entrySet()) {
			System.out.println(en.getKey()
							+ "="
							+ en.getValue());
		}
	}
}
