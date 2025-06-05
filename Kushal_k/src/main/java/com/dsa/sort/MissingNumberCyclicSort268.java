package com.dsa.sort;

// https://leetcode.com/problems/missing-number/
class MissingNumberCyclicSort268 {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctIndex=nums[i];
            if(nums[i] < nums.length && nums[i]!=nums[correctIndex]){
                swap(nums,i,correctIndex);
            }else{
                i++;
            }
        }

        for(int x=0;x<nums.length;x++){
            if(nums[x]!=x){
                return x;
            }
        }
        return nums.length;
    }

    static void swap(int[] nums, int i, int correctIndex) {
		int tmp=nums[i];
		nums[i]=nums[correctIndex];
		nums[correctIndex]=tmp;
	}
}