package com.dsa.sort;

import java.util.ArrayList;
import java.util.List;
//	https://leetcode.com/problems/find-all-duplicates-in-an-array/
class FindAllDuplicateElementsCyclicSort {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int i =0;
        while(i<nums.length){
            int cIndex=nums[i]-1;
            if(nums[i]!=nums[cIndex]){
                swap(nums,i,cIndex);
            }else{
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                list.add(nums[index]);
            }
        }
        return list;
    }
    static void swap(int[] arr, int i, int correctIndex) {
		int tmp=arr[i];
		arr[i]=arr[correctIndex];
		arr[correctIndex]=tmp;
	}
}