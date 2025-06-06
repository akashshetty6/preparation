package com.dsa.sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,1,5,4};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	static void quickSort(int arr[],int low,int high) {
		if(low>=high) {
			return;
		}
		int s=low;
		int e=high;
		
		int m=(s+e)/2;
		int pivot=arr[m];
		
		while(s<=e) {
			while(arr[s]<pivot) {
				s++;
			}
			while(arr[e]>pivot) {
				e--;
			}
			if(s<=e) {
				int tmp=arr[s];
				arr[s]=arr[e];
				arr[e]=tmp;
				s++;
				e--;
			}
		}
		quickSort(arr, low, e);
		quickSort(arr, s, high);
		
	}

}
