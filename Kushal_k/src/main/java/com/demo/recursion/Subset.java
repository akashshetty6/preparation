package com.demo.recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset {

	public static void main(String[] args) {
//		subset("", "abc");
		List<String> list=new ArrayList<String>();
		subset("", "abc", list);
		System.out.println(list);
		int arr[]= {1,2,3,4,5,6,7};
		System.out.println(numOfSubarrays(0, arr, 0,false));
//		printnumOfSubarrays(0, arr, 0, arr.length-1);
	}

	static void subset(String p,String up){
		if(up.isEmpty()) {
			System.out.println(p);
//			list.add(p);
			return;
		}
		char c=up.charAt(0);
		subset(p+c, up.substring(1));
		subset(p, up.substring(1));
	}
	
	static void subset(String p,String up,List<String> list){
		if(up.isEmpty()) {
			list.add(p);
			return ;
		}
		char c=up.charAt(0);
		
		subset(p+c, up.substring(1),list);
		subset(p, up.substring(1),list);
	}
	
	public static int numOfSubarrays(int sum,int[] arr,int i,boolean isOdd) {
		if(i==arr.length) {
			return (sum%2!=0 && isOdd)?1:0;
		}
		int l=numOfSubarrays(arr[i]+sum, arr, i+1,true);
		int r=numOfSubarrays(sum, arr, i+1,isOdd);
		return l+r;
	}
	
}
