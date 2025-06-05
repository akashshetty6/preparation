package com.demo.recursion;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(linearSearch(new int[] {1,2,3,4,2}, 2, 0,new ArrayList<>()));
	}
	
	static List<Integer> linearSearch(int arr[],int target,int index,ArrayList<Integer> list){
//		List<Integer> list=new ArrayList<>();
		if(index==arr.length) {
			return list;
		}
		if(arr[index]==target) {
			list.add(index);
		}
		return linearSearch(arr, target, index+1,list);
	}

}
