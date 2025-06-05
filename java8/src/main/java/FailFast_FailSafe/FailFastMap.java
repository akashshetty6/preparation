package FailFast_FailSafe;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map<Integer, String> map=new HashMap<>();
		Map<Integer, String> map=new ConcurrentHashMap<>();
		
		
		map.put(1, "a");map.put(2, "b");
		Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			map.put(3, "c");
		}
		
		String s="akash";
		s="a";
		String a="akash";
		System.out.println(s==a);
		
	}
}
