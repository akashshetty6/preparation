package com.demo.recursion;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,1,5,4,2,3};
		selectionSort(arr, arr.length-1, 0);
		System.out.println(Arrays.toString(arr));
	}
	
	static void selectionSort(int arr[],int l,int c) {
		if(l==0) {
			return;
		}
		if(c<l) {
			int findMaxIndex = findMaxIndex(arr, c, l);
			swapMax(arr, findMaxIndex, l);
//			selectionSort(arr, l-1, 0);
		}
		selectionSort(arr, l-1, 0);
	}
	
	private static void swapMax(int[] arr, int max, int last) {
		int tmp=arr[max];
		arr[max]=arr[last];
		arr[last]=tmp;
		
	}

	private static int findMaxIndex(int[] arr, int start, int last) {
		int max=start;
		for(int i=start;i<=last;i++) {
			if(arr[i]>arr[max]) {
				max=i;
			}
		}
		return max;
	}

}
