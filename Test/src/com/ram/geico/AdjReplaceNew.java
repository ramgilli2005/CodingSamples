package com.ram.geico;

public class AdjReplaceNew {

	public static void main(String[] args) {
		AdjacentReplace ar = new AdjacentReplace();
		
		for (int i=0; i <=11; i++) {
			System.out.println("Result : " + i + " : " + ar.replaceString(i));
		}
		
		System.out.println("Result Large " + ar.replaceString(176239129));

	}

}

class AdjacentReplace {
	public String replaceString(int N) {
		
		StringBuilder result = new StringBuilder().append("a".repeat(N));
		if(N < 2) {
			return result.toString();
		}
		
		//System.out.println("Inital String :" + result.toString());
		long startTime = System.currentTimeMillis();
		boolean noReplace = false;
		do {
			int i=0, j=result.length()-1;
			//System.out.println("String Length : " + result.length());
			if (result.charAt(i) == 'z') {
				//System.out.println("z encountered. Final String : " + result);
				break;
			}
			if (result.length() < 2) {
				//System.out.println("Reduced to 1 char : "+result);
				break;
			}
			while (j>i && result.charAt(i) != result.charAt(j)) {
				j--;
			}
			
			//System.out.println("Matching Value j :"+j);
			char next = (char) (result.charAt(i) + 1);
			StringBuilder newStr = new StringBuilder(String.valueOf(next).repeat((j+1)/2));
			if (j%2 == 0) {
				//Odd Scenario - array is -1 of length
				//System.out.println("Odd Case : true");
				newStr.append(result.substring(j));
			} else if (j < result.length() - 1) {
				//System.out.println("j < result.length-1");
				newStr.append(result.substring(j+1));
			}
			//System.out.println("New Str : "+ newStr);
			//if(!newStr.toString().equals(result.toString())) {
			if(j > i) {
				result = newStr;
			} else {
				noReplace = true;
			}
			
		} while(!noReplace);
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Time taken : " + (endTime - startTime) + " ms");
		
		return result.toString();
		
	}
}
