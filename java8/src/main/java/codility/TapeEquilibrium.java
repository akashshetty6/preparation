package codility;

import java.util.Arrays;

public class TapeEquilibrium {
	
	public static void main(String[] args) {
		int a[]= {3,1,2,4,3};
		
		int r_sum = Arrays.stream(a).sum();
		
		int min=Integer.MAX_VALUE;
		int l_sum=0;
		for(int i=0;i<a.length;i++) {
			 l_sum+=a[i];
			 r_sum-=a[i];
			 int diff= Math.abs(r_sum-l_sum);
			 if(diff<min) {
				 min=diff;
			 }
		}
		System.out.println(min);
	}

}
