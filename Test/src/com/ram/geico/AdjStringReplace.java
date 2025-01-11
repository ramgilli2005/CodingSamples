package com.ram.geico;

public class AdjStringReplace {

    public static String replacePairs(int N) {
        if (N <= 0) return "";
        
        long startTimeMillis = System.currentTimeMillis();
        // Step 1: Create a string of length N with the character 'a'
        StringBuilder str = new StringBuilder("a".repeat(N));

        // Step 2: Replace pairs iteratively
        while (true) {
        	
            StringBuilder newStr = new StringBuilder();
            boolean replaced = false;
            int i = 0;

            while (i < str.length()) {
                if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                    char currentChar = str.charAt(i);
                    if (currentChar != 'z') {
                        newStr.append((char) (currentChar + 1)); // Replace pair with next character
                        replaced = true;
                    }
                    i += 2; // Skip the pair
                } else { //Remaining characters
                    newStr.append(str.charAt(i)); // Append single character
                    i++;
                }
            }

            if (!replaced) {
            	long endTimeMillis = System.currentTimeMillis();
            	System.out.println("Time taken : " + (endTimeMillis - startTimeMillis) + " ms");
                return newStr.toString(); // No changes, return the result
            }

            str = newStr; // Update the string for the next iteration
        }
        
        
    }

    public static void main(String[] args) {
        
        for (int i=0; i<12; i++) {
        	System.out.println("Result " +i + " : " + replacePairs(i));
        }
        
        System.out.println("Result Large :" + replacePairs(179239121));
    }
}

