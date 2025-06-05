package com.dsa.sort;

import java.util.Arrays;
//Intusion : For every pass large element will be placed last index
public class BubbleSort {

	public static void main(String[] args) {
		int arr[]=new int[] {1,4,2,3,5};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
//	best case O(N)  when arr is already sorted
//	worst case O(N2) when arr is reveresed.
	static void bubbleSort(int[] arr) {
		boolean swapped=false;
		
		for(int i=0;i<arr.length;i++) {
			// In the 1st iteration large value placed in last index
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					swapped=true;
				}
			}
			// no swap means arr is sorted so exit from the loop.
			if(!swapped) {
				break;
			}
		}
	}

}
