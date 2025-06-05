package testpkg;

import java.util.ArrayList;

public class CustomList extends ArrayList<Integer> {
	
	@Override
	public boolean add(Integer e) {
		if(!super.contains(e)) {
			return super.add(e);
		}
		return false;
	}

	public static void main(String[] args) {
		CustomList n=new CustomList();
		n.add(1);
		n.add(1);
		n.add(1);
		System.out.println(n);
	}
}
