package com.ram.leetcode;

import java.util.TreeSet;

public class ArrayDups {
		
	public int removeDuplicates(int[] nums) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		for (int num : nums) {
			treeSet.add(num);
		}
		
		int i=0;
		for (Integer number : treeSet) {
			System.out.println("Number going back in :" + number);
			nums[i++] = number;
		}
		
		return treeSet.size();
	}

}
