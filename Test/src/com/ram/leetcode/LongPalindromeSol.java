package com.ram.leetcode;

public class LongPalindromeSol {
	
	public static String longestPalindrome(String s) {
		if (s == null || s.length() < 1)
			return "";

		String result = "";
		int resLen = 0;

		for (int i = 0; i < s.length(); i++) {
			// Odd
			int[] oddResult = expandAroundCenter(s, i, i);
			if (oddResult[1] > resLen) {
				resLen = oddResult[1];
				result = s.substring(oddResult[0], oddResult[0] + resLen);
			}

			// Even
			int[] evenResult = expandAroundCenter(s, i, i + 1);
			if (evenResult[1] > resLen) {
				resLen = evenResult[1];
				result = s.substring(evenResult[0], evenResult[0] + resLen);
			}
		}
		return result;

		// Odd
//        	int l = i, r = i;
//        	while (l>=0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
//    			if ((r - l + 1) > resLen) {
//    				resLen = r - l + 1;
//    				result = s.substring(l, r+1);
//    			}
//    			l -= 1;
//    			r += 1;
//    		}
//        	
//        	//Even
//        	l = i; 
//        	r = i+1;
//        	while (l>=0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
//    			if ((r - l + 1) > resLen) {
//    				resLen = r - l + 1;
//    				result = s.substring(l, r+1);
//    			}
//    			l -= 1;
//    			r += 1;
//    		}
//        }
//        
//        
//        return result;
	}
	
	private static int[] expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the starting index and length of the palindrome
        return new int[]{left + 1, right - left - 1};
    }
	
	

	public static void main(String[] args) {
		String subSample = "babad";
		
		System.out.println(LongPalindromeSol.longestPalindrome(subSample));
		
		String subSample2 = "abbc";
		
		System.out.println(LongPalindromeSol.longestPalindrome(subSample2));
		
		String subSample3 = "";
		
		System.out.println(LongPalindromeSol.longestPalindrome(subSample3));

	}

}
