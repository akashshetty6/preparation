package com.dsa.sort;

import java.util.Arrays;
// distinct numbers in the range [1, n] or [0,N] , like missing numbers
public class CyclicSort {

	public static void main(String[] args) {
		int arr[]=new int[] {1,4,2,3,5,7,6};
		cyclicSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void cyclicSort(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int correctIndex=arr[i]-1;
			if(arr[i]!=arr[correctIndex]) {
				swap(arr,i,correctIndex);
			}else {
				i++;
			}
		}
	}

	static void swap(int[] arr, int i, int correctIndex) {
		int tmp=arr[i];
		arr[i]=arr[correctIndex];
		arr[correctIndex]=tmp;
	}
}
