package LargestSumContagiousSubArray;

public class Solution {

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
        System.out.println((bruteForce(arr)));
    }
    
}
