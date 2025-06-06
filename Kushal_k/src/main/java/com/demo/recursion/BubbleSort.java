package com.demo.recursion;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,1,5,4};
		bubbleSort(arr, arr.length-1, 0);
		System.out.println(Arrays.toString(arr));
	}
	
	static void bubbleSort(int arr[],int len,int c) {
		if(len==0) {
			return;
		}
		if(c<len) {
			if(arr[c]>arr[c+1]) {
				int t=arr[c];
				arr[c]=arr[c+1];
				arr[c+1]=t;
			}
			bubbleSort(arr, len, c+1); 
		}
		bubbleSort(arr, len-1, 0);
		
		
	}

}
