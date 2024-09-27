package com.ram.leetcode;

public class SolInsert {
	
	public int searchInsert(int[] nums, int target) {
        int i=0;
        for (i=0; i< nums.length; i++) {
        	if((nums[i] == target) || (nums[i] > target)) {
        		return i;
        	} else if (nums[i] < target && (i+1 < nums.length) && nums[i+1] > target) {
        		return i+1;
        	}
        }
        
        return i;
    }

}
