package com.dsa.sort;

import java.util.ArrayList;
import java.util.List;
//   https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
class FindAllNumbersDisappearedinArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int i=0;
		while(i<nums.length) {
			int correctIndex=nums[i]-1;
			if(  nums[i]!=nums[correctIndex]) {
				swap(nums,i,correctIndex);
			}else {
				i++;
			}    
		}
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                res.add(index+1);
            }
        }
        return res;
    }

    static void swap(int[] arr, int i, int correctIndex) {
		int tmp=arr[i];
		arr[i]=arr[correctIndex];
		arr[correctIndex]=tmp;
	}
}