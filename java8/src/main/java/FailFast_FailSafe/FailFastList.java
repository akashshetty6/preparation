package FailFast_FailSafe;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastList {

	public static void main(String[] args) {
		List<String> a=new CopyOnWriteArrayList<>();
		
		a.add("a");
		a.add("b");
		
		Iterator<String> iterator = a.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			a.add("c");
		}
	}
}
