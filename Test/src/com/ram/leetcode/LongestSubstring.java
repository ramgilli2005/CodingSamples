package com.ram.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
	public int lengthofLongestSubstring(String s) {
		if (s.length() <= 0 ) {
			return s.length();
		}
		
		Set<Character> chars = new HashSet<>();
		
		int k =0;
		int left=0;
		for(int right =0; right < s.length(); right++) {
			if (!chars.contains(s.charAt(right))) {
				chars.add(s.charAt(right));
				k = Math.max(k, chars.size());
			} else {
				while(s.charAt(left) != s.charAt(right)) {
					chars.remove(s.charAt(left)); 
					left++;
				}
				chars.remove(s.charAt(left));left++;
				chars.add(s.charAt(right));
			}
		}
		
		
		
		return k;
	}
}
