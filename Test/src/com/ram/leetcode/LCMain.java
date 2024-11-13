package com.ram.leetcode;

import java.util.stream.IntStream;

public class LCMain {

	//Remove Dups
//	public static void main(String[] args) {
//		ArrayDups ad = new ArrayDups();
//		int[] nums = {1,1,2};
//		
//		System.out.println("Size :" + ad.removeDuplicates(nums));
//		System.out.println(Arrays.toString(nums));
//	}
	/*public static void main(String[] args) {
		RemoveElm re = new RemoveElm();
		int[] nums = {3,2,2,3};
		int[] nums2 = {0,1,2,2,3,0,4,2};
		int[] nums3 = {2};
		int[] nums4 = {3,3};
		int[] nums5 = {2,2,2};
		int[] nums6 = {1,2,3,4};
		int[] nums7 = {1,2,3,0,5,4};
		
		System.out.println("Expected Length :" + re.removeElement(nums, 3));
		System.out.println("Array : " + Arrays.toString(nums));
		System.out.println("Expected Length :" + re.removeElement(nums2, 2));
		System.out.println("Array : " + Arrays.toString(nums2));
		System.out.println("Expected Length :" + re.removeElement(nums3, 3));
		System.out.println("Array : " + Arrays.toString(nums3));
		System.out.println("Expected Length :" + re.removeElement(nums4, 5));
		System.out.println("Array : " + Arrays.toString(nums4));
		System.out.println("Expected Length :" + re.removeElement(nums5, 5));
		System.out.println("Array : " + Arrays.toString(nums5));
		System.out.println("Expected Length :" + re.removeElement(nums6, 5));
		System.out.println("Array : " + Arrays.toString(nums6));
		System.out.println("Expected Length :" + re.removeElement(nums7, 4));
		System.out.println("Array : " + Arrays.toString(nums7));
		
		
	} */
	/* public static void main(String[] args) {
		SolInsert si = new SolInsert();
		int[] nums = {1,3,5,6};
		int[] nums1 = {1};
		System.out.println("Location :" +  si.searchInsert(nums, 7));
		System.out.println("Location :" +  si.searchInsert(nums1, 4));
	} */
	/* public static void main(String[] args) {
		SolValidateSudoku svs = new SolValidateSudoku();
		/*char[][] board = {
				{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
			    {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
			    {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
			    {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
			    {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
			    {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
			    {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
			    {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
			    {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
		};*/
		/*char[][] board = {
			{'.', '.', '.', '.', '5', '.', '.', '1', '.'},
		    {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
		    {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
		    {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
		    {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
		    {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
		    {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
		    {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
		    {'.', '.', '4', '.', '.', '.', '.', '.', '.'}
		};
		
		if(svs.isValidSudoku(board)) {
			System.out.println("Board is valid");
		} else {
			System.out.println("Invalid numbers in board");
		}
		
	} */

	/*public static void main(String[] args) {
		LongestSubstring ls = new LongestSubstring();
//		System.out.println(ls.lengthofLongestSubstring("abba"));
//		System.out.println(ls.lengthofLongestSubstring("abcabcdb"));
//		System.out.println(ls.lengthofLongestSubstring("bbbbbb"));
//		System.out.println(ls.lengthofLongestSubstring("pwwkew"));
//		System.out.println(ls.lengthofLongestSubstring("aab"));
//		System.out.println(ls.lengthofLongestSubstring("dvbdf"));
		System.out.println(ls.lengthofLongestSubstring("qrsvbspk"));
		
	}*/

	public static void main(String[] args) {
		TwoSumClass tsc = new TwoSumClass();
		int[] numbers = {1,2,3,4,5};
		int target = 6;
		int[] indices = tsc.twoSum(numbers, target);
		
		IntStream.of(indices).forEach(System.out::println);
	}

}
