package com.dsa.sort;
//  https://leetcode.com/problems/find-the-duplicate-number/description/
class FindDuplicateNumberCyclic {
    public int findDuplicate(int[] nums) {
        int i=0;
		while(i<nums.length) {
			int correctIndex=nums[i]-1;
			if(  nums[i]!=nums[correctIndex]) {
				swap(nums,i,correctIndex);
			}else {
				i++;
			}    
		}
        int res=0;
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                res= nums[index];
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