package com.ram.geico;

public class CarWeightReturn {

	public static void main(String[] args) {
		CarWeightSolution cws = new CarWeightSolution();
		
		System.out.println("Turn backs : " + cws.numDrivers(2, new int[]{3,4,5,6,7,8,9}));
		
		System.out.println("Turn backs : " + cws.numDrivers(10, new int[]{2,2,2,2,2,2,3}));
		
		System.out.println("Turn backs : " + cws.numDrivers(9, new int[]{5, 3, 8, 1, 8, 7, 7, 6}));
		
		System.out.println("Turn backs : " + cws.numDrivers(2, new int[]{2}));
		
		System.out.println("Turn backs : " + cws.numDrivers(2, new int[]{3}));

	}

}

class CarWeightSolution {
	public int numDrivers(int U, int[] weights) {
		
		if(weights.length < 2) {
			if (weights.length == 1 && weights[0] > U) {
				return 1;
			} else {
				return 0;
			}
		}
		
		int turnBacks = 0;
		
		int i=0, j=1;
		
		while (j < weights.length) {
			if (weights[i] + weights[j] > U) {
				turnBacks += 1;
				if (weights[i] > weights[j]) {
					i = j;
				}
			} else {
				i = j;
			}
			j += 1;
		}
		
		if (weights[i] > U) {
			turnBacks += 1;
		}
		
		
		return turnBacks;
	}
}
