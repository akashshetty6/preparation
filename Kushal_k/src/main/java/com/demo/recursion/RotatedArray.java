package com.demo.recursion;

public class RotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(search(new int[] {4,5,6,7,8,1,2,3}, 3, 0, 7));
		
	}
	
	static int search(int arr[],int target,int s,int e) {
		if(s>e) {
			return -1;
		}
		int mid=(s+e)/2;
		if(arr[mid]==target) {
			return mid;
		}
		
		if(arr[s]<=arr[mid]) {
			if(target>=arr[s] && target<= arr[mid]) {
				return search(arr, target, s, mid-1);
			}else {
				return search(arr, target, mid+1, e);
			}
		}
		if(target>=arr[mid] && target<= arr[e]) {
			return search(arr, target, mid+1, e);
		}
		return search(arr, target, s, mid-1);
		
		
	}

}
