package com.demo.recursion;

public class IsArraySorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(sorted(new int[] {1,2,3,4,2}, 0));
	}
	
	static boolean sorted(int arr[],int i) {
		if(i==arr.length-1)
			return true;
		return arr[i]<arr[i+1] && sorted(arr, i+1);
	}

}
