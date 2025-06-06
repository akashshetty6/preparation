package com.dsa.sort;

import java.util.Arrays;

public class SelectionSort {
// best case O(N2)  when arr is already sorted
	public static void main(String[] args) {
		int arr[]=new int[] {1,5,2,3,4};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void selectionSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int last=arr.length-i-1;
			int max = findMaxIndex(arr,0,last);
			swapMax(arr,max,last);
		}
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
