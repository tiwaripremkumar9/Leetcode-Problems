package LargestSumContagiousSubArray;

public class Solution {

    /*
     * below code of Kadane's doesn't works as expected when all the values of array are negative
     */

    public static int kadanesAlgortihmApproach(int [] arr){
    	int currentSum = 0;
    	int maxSum = 0;
    	
    	for(int i = 0; i < arr.length; i++) {
    		currentSum += arr[i];
    		if(currentSum < 0) {
    			currentSum = 0;
    		}
    		if(currentSum > maxSum) {
    			maxSum = currentSum;
    		}
    	}
    	return maxSum;
    }

    /*
     * Kadane's algorithm idea lies in the fact tht during iteration and summing, we should try to find the larger value possible,
     * hence, if sum till a[n] > a[i], then sum till a[n] is largely helpful for getting the max sum moving to further elements.
     * thinking of vice-versa, if a[i] > sum till a[n] then a[i] is largely helpful for getting the max sum moving to further elements.
     * 
     * this way, we keep removing the lowest negative values (depereciating factor in our sum), and in way if we try finding the maximum sum.
     */
   
     public static int refinedKadanesAlgorithm(int [] arr){
        int currentSum = arr[0];
        int maxSum = arr[0];

        for(int i = 1; i < arr.length; i++){
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }

    public static int bruteForce(int [] arr) {
    	int currentSum = 0;
    	int maxSum = 0;
    	
    	for(int i = 0; i < arr.length; i++) {
    		currentSum = arr[i];
    		for(int j = i+1; j < arr.length; j++) {
    			currentSum += arr[j];
    			if(currentSum > maxSum) {
    				maxSum = currentSum;
    			}
    		}
    	}
    	
    	return maxSum;
    }

    public static void main(String[] args) {
        int [] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println((refinedKadanesAlgorithm(arr)));
    }
    
}
