package com.ram.leetcode;

public class TwoSumClass {
    public int[] twoSum(int[] numbers, int target) {
        int[] indices = new int[2];
        
        boolean found = false;
        for(int i=0; i< numbers.length; i++) {
        	int interim = target - numbers[i];
        	
        	for(int j=i+1; j<numbers.length; j++) {
        		if(numbers[j] == interim) {
        			found = true;
        			indices[0] = i;
        			indices[1] = j;
        			break;
        		}
        	}
        	if(found) {
        		break;
        	}
        	
        }
        
        if(!found) {
        	indices[0] = -1;
			indices[1] = -1;
        }

        return indices;
    }
}