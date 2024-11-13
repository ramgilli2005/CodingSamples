package com.ram.leetcode;

import java.util.HashMap;

public class TwoSumClass {
    public int[] twoSum(int[] nums, int target) {
    	
    	HashMap<Integer, Integer> prevMap = new HashMap<Integer, Integer>();
    	
    	for (int i=0; i<nums.length; i++) {
    		int compliment = target - nums[i];
    		if(prevMap.containsKey(compliment)) {
    			return new int[] {prevMap.get(compliment), i};
    		}
    		prevMap.put(nums[i],i );
    	}
    	
    	return new int[2];
    	
    }
}