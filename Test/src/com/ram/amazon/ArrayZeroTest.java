package com.ram.amazon;

import java.util.Arrays;
import java.util.Random;

/**
 * Test class to demonstrate and compare the different implementations of ArrayZero
 */
public class ArrayZeroTest {

    public static void main(String[] args) {
        // Create an instance of ArrayZero
        ArrayZero solution = new ArrayZero();
        
        // Test with small arrays
        testWithSmallArrays(solution);
        
        // Test with larger arrays to compare memory usage and performance
        testWithLargeArrays(solution);
        
        // Test with edge cases
        testWithEdgeCases(solution);
        
        // Test with very large ranges to compare memory-efficient implementations
        testWithLargeRanges(solution);
    }
    
    private static void testWithSmallArrays(ArrayZero solution) {
        System.out.println("=== Testing with small arrays ===");
        
        // Test case 1: Array with unique values
        int[] test1 = {1, 2, 3, 4, 5};
        testAndCompare(solution, test1, "Array with unique values");
        
        // Test case 2: Array with duplicates
        int[] test2 = {1, 2, 2, 3, 3, 3};
        testAndCompare(solution, test2, "Array with duplicates");
        
        // Test case 3: Array with zeros
        int[] test3 = {0, 1, 0, 2, 0, 3};
        testAndCompare(solution, test3, "Array with zeros");
    }
    
    private static void testWithLargeArrays(ArrayZero solution) {
        System.out.println("\n=== Testing with large arrays ===");
        
        // Generate a large array with values in range 1-30 (suitable for bitwise)
        int[] largeArray1 = generateRandomArray(100000, 30);
        System.out.println("Large array with values 1-30:");
        
        // Measure time for boolean array implementation
        long startTime = System.nanoTime();
        int result1 = solution.minimumOperations(largeArray1);
        long endTime = System.nanoTime();
        System.out.println("Boolean array implementation: " + result1 + " operations, Time: " + 
                           (endTime - startTime) / 1000000.0 + " ms");
        
        // Measure time for bitwise implementation
        startTime = System.nanoTime();
        int result2 = solution.minimumOperationsBitwise(largeArray1);
        endTime = System.nanoTime();
        System.out.println("Bitwise implementation: " + result2 + " operations, Time: " + 
                           (endTime - startTime) / 1000000.0 + " ms");
        
        // Generate a large array with values in range 1-100
        int[] largeArray2 = generateRandomArray(100000, 100);
        System.out.println("\nLarge array with values 1-100:");
        
        // Measure time for boolean array implementation
        startTime = System.nanoTime();
        int result3 = solution.minimumOperations(largeArray2);
        endTime = System.nanoTime();
        System.out.println("Boolean array implementation: " + result3 + " operations, Time: " + 
                           (endTime - startTime) / 1000000.0 + " ms");
        
        // Measure time for optimized boolean array implementation
        startTime = System.nanoTime();
        int result4 = solution.minimumOperationsOptimized(largeArray2, 100);
        endTime = System.nanoTime();
        System.out.println("Optimized boolean array: " + result4 + " operations, Time: " + 
                           (endTime - startTime) / 1000000.0 + " ms");
        
        // Measure time for BitSet implementation
        startTime = System.nanoTime();
        int result5 = solution.minimumOperationsBitSet(largeArray2, 100);
        endTime = System.nanoTime();
        System.out.println("BitSet implementation: " + result5 + " operations, Time: " + 
                           (endTime - startTime) / 1000000.0 + " ms");
        
        // Measure time for HashSet implementation
        startTime = System.nanoTime();
        int result6 = solution.minimumOperationsHashSet(largeArray2);
        endTime = System.nanoTime();
        System.out.println("HashSet implementation: " + result6 + " operations, Time: " + 
                           (endTime - startTime) / 1000000.0 + " ms");
    }
    
    private static void testWithLargeRanges(ArrayZero solution) {
        System.out.println("\n=== Testing with large value ranges ===");
        
        // Generate an array with some values in a large range (1-1000)
        int[] largeRangeArray = generateSparseArray(10000, 1000);
        int maxValue = 1000;
        
        System.out.println("Array with sparse values in range 1-1000:");
        
        // Skip boolean array implementation as it would use too much memory for demo
        
        // Measure time for BitSet implementation
        long startTime = System.nanoTime();
        int result1 = solution.minimumOperationsBitSet(largeRangeArray, maxValue);
        long endTime = System.nanoTime();
        System.out.println("BitSet implementation: " + result1 + " operations, Time: " + 
                           (endTime - startTime) / 1000000.0 + " ms");
        
        // Measure time for HashSet implementation
        startTime = System.nanoTime();
        int result2 = solution.minimumOperationsHashSet(largeRangeArray);
        endTime = System.nanoTime();
        System.out.println("HashSet implementation: " + result2 + " operations, Time: " + 
                           (endTime - startTime) / 1000000.0 + " ms");
        
        // Generate an array with some values in a very large range (1-10000)
        int[] veryLargeRangeArray = generateSparseArray(10000, 10000);
        maxValue = 10000;
        
        System.out.println("\nArray with sparse values in range 1-10000:");
        
        // Measure time for BitSet implementation
        startTime = System.nanoTime();
        result1 = solution.minimumOperationsBitSet(veryLargeRangeArray, maxValue);
        endTime = System.nanoTime();
        System.out.println("BitSet implementation: " + result1 + " operations, Time: " + 
                           (endTime - startTime) / 1000000.0 + " ms");
        
        // Measure time for HashSet implementation
        startTime = System.nanoTime();
        result2 = solution.minimumOperationsHashSet(veryLargeRangeArray);
        endTime = System.nanoTime();
        System.out.println("HashSet implementation: " + result2 + " operations, Time: " + 
                           (endTime - startTime) / 1000000.0 + " ms");
    }
    
    private static void testWithEdgeCases(ArrayZero solution) {
        System.out.println("\n=== Testing with edge cases ===");
        
        // Test case 1: Empty array
        int[] test1 = {};
        testAndCompare(solution, test1, "Empty array");
        
        // Test case 2: Array with only zeros
        int[] test2 = {0, 0, 0, 0};
        testAndCompare(solution, test2, "Array with only zeros");
        
        // Test case 3: Array with a single element
        int[] test3 = {5};
        testAndCompare(solution, test3, "Array with a single element");
        
        // Test case 4: Null array
        testAndCompare(solution, null, "Null array");
    }
    
    private static void testAndCompare(ArrayZero solution, int[] array, String testName) {
        System.out.println("\nTest: " + testName);
        if (array != null) {
            System.out.println("Array: " + Arrays.toString(array));
        } else {
            System.out.println("Array: null");
        }
        
        // Test boolean array implementation
        int result1 = solution.minimumOperations(array);
        System.out.println("Boolean array implementation result: " + result1);
        
        // Test bitwise implementation if applicable (for small ranges)
        if (array == null || isWithinRange(array, 31)) {
            int result2 = solution.minimumOperationsBitwise(array);
            System.out.println("Bitwise implementation result: " + result2);
        }
        
        // Test optimized boolean array implementation
        int maxValue = array == null ? 0 : getMaxValue(array);
        int result3 = solution.minimumOperationsOptimized(array, maxValue);
        System.out.println("Optimized boolean array result: " + result3);
        
        // Test BitSet implementation
        int result4 = solution.minimumOperationsBitSet(array, maxValue);
        System.out.println("BitSet implementation result: " + result4);
        
        // Test HashSet implementation
        int result5 = solution.minimumOperationsHashSet(array);
        System.out.println("HashSet implementation result: " + result5);
    }
    
    private static int[] generateRandomArray(int size, int maxValue) {
        int[] array = new int[size];
        Random random = new Random();
        
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(maxValue + 1); // 0 to maxValue
        }
        
        return array;
    }
    
    private static int[] generateSparseArray(int size, int maxValue) {
        int[] array = new int[size];
        Random random = new Random();
        
        // Make the array sparse - most values will be 0 or small
        for (int i = 0; i < size; i++) {
            // 70% chance of being 0 or a small value
            if (random.nextDouble() < 0.7) {
                array[i] = random.nextInt(10); // 0-9
            } else {
                // 30% chance of being a larger value up to maxValue
                array[i] = random.nextInt(maxValue) + 1; // 1 to maxValue
            }
        }
        
        return array;
    }
    
    private static boolean isWithinRange(int[] array, int maxRange) {
        for (int num : array) {
            if (num > maxRange) {
                return false;
            }
        }
        return true;
    }
    
    private static int getMaxValue(int[] array) {
        int max = 0;
        for (int num : array) {
            max = Math.max(max, num);
        }
        return max;
    }
}
