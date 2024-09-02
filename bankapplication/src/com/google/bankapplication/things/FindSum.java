package com.google.bankapplication.things;

public class FindSum {

	public static void main(String[] args) {
		int[] array = {5,2,3,1,7,8,2,3,4};
		        int targetSum = 7;

		        for (int i = 0; i < array.length; i++) {
		            for (int j = i + 1; j < array.length; j++) {
		            	for(int k=j+1; k<array.length; k++) {
		                if (array[i] + array[j]+array[k]== targetSum) {
		                    System.out.println("Pair found: (" + array[i] + "," + array[j] + ","+array[k]+")");
		                }
		               // if(array[i]+array[j]==targetSum) {
		                //	System.out.println("Pair Found:"+array[i]+","+array[j]);
		                //}
		            }
		        }
		    }
	}
}


