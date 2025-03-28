package com.ram.amazon;

import java.util.BitSet;
import java.util.HashSet;

/**
 * This class provides a solution to find the minimum number of operations
 * needed to reduce all elements in an array to zero.
 * In each operation, a positive integer can be chosen and subtracted from
 * all array elements that are greater than or equal to that integer.
 */
public class ArrayZero {

    /**
     * Implementation using boolean array for medium-sized ranges
     * Time Complexity: O(n) where n is the length of the array
     * Space Complexity: O(k) where k is the maximum value in the array (but fixed at 101 here)
     */
    public int minimumOperations(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        // Count unique non-zero values
        int uniqueCount = 0;
        boolean[] seen = new boolean[101]; // Assuming constraints: 1 <= nums[i] <= 100
        
        for (int num : nums) {
            if (num > 0 && !seen[num]) {
                seen[num] = true;
                uniqueCount++;
            }
        }
        
        return uniqueCount;
    }
    
    /**
     * Implementation using bit manipulation for very small ranges
     * This is more memory efficient when the range of values is small (e.g., <= 32)
     * Time Complexity: O(n)
     * Space Complexity: O(1) - uses only a single 32-bit integer
     */
    public int minimumOperationsBitwise(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        // Use a single integer as a bit mask to track seen numbers
        // This works efficiently when the range is small (e.g., 1-31)
        int bitMask = 0;
        
        for (int num : nums) {
            if (num > 0 && num < 32) { // Ensure we don't exceed 32-bit integer capacity
                bitMask |= (1 << num);
            }
        }
        
        // Count the number of set bits in the mask
        return Integer.bitCount(bitMask);
    }
    
    /**
     * Implementation for larger ranges with optimized memory usage using boolean array
     * Time Complexity: O(n)
     * Space Complexity: O(maxValue) - uses one byte per possible value
     */
    public int minimumOperationsOptimized(int[] nums, int maxValue) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        boolean[] seen = new boolean[maxValue + 1];
        int uniqueCount = 0;
        
        for (int num : nums) {
            if (num > 0 && !seen[num]) {
                seen[num] = true;
                uniqueCount++;
            }
        }
        
        return uniqueCount;
    }
    
    /**
     * Implementation using BitSet for large ranges with better memory efficiency
     * Time Complexity: O(n)
     * Space Complexity: O(maxValue/8) - uses one bit per possible value
     */
    public int minimumOperationsBitSet(int[] nums, int maxValue) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        // BitSet uses 1 bit per element instead of 1 byte in boolean array
        BitSet seen = new BitSet(maxValue + 1);
        
        for (int num : nums) {
            if (num > 0) {
                seen.set(num);
            }
        }
        
        // Return the number of bits set to true
        return seen.cardinality();
    }
    
    /**
     * Implementation for unknown or very large ranges using a HashSet
     * This is the original approach but with null/empty checks added
     * Time Complexity: O(n)
     * Space Complexity: O(k) where k is the number of unique non-zero values
     */
    public int minimumOperationsHashSet(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }
        
        return set.size();
    }
}
