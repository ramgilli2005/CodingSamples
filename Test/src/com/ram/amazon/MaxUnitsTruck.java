package com.ram.amazon;

import java.util.Arrays;

/**
 * Class that demonstrates sorting a 2D array based on the second value in descending order.
 */
public class MaxUnitsTruck {

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        int maxUnits = 0;
        
        for (int[] box : boxTypes) {
            int boxes = Math.min(truckSize, box[0]);
            maxUnits += boxes * box[1];
            truckSize -= boxes;
            
            if (truckSize == 0) {
                break;
            }
        }

        return maxUnits;
    }      
}
