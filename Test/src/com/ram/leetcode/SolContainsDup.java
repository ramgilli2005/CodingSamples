package com.ram.leetcode;

import java.util.HashSet;
import java.util.Set;

public class SolContainsDup {
	
	public boolean containsDuplicate(int[] nums) {
		
		Set<Integer> uniqueSet = new HashSet<Integer>();
		
		for( int i=0; i< nums.length; i++) {
			if(uniqueSet.contains(nums[i])) {
				return true;
			}
			uniqueSet.add(nums[i]);
		}
		
		return false;
	}

}
