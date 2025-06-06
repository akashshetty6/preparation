package java8;

import java.util.Arrays;

public class LongestStringInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] x= {1,2,3,4};
		Integer integer = Arrays.stream(x).reduce((c,b)->c+b).get();
		System.out.println(integer);
		
		String s[]= {"akash","shriyash","prajwal","suraj","xcvbnmnbvcxz"};
		String string = Arrays.stream(s).reduce((a,b)->a.length()>b.length()?String.valueOf(a.length()):String.valueOf(b.length())).get();
		System.out.println(string);
	}

}
