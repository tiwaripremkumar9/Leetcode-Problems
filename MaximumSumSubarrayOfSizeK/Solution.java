package MaximumSumSubarrayOfSizeK;


// Sliding Window.
public class Solution {
    
    public int maxSumSubArray(int [] arr, int k){
        int currentSum = 0;
        int l = arr.length;
        int maxSumSubArray = 0;
        // find the sum of first window . i.e first K elements. so need to iterate from 0 - (k-1)
        for(int i = 0; i < k; i++){
            currentSum = arr[i]+currentSum;
        }

        for(int i=k; i<l; i++){
            currentSum = (currentSum + arr[i]) - arr[i-k];
            maxSumSubArray = Math.max(currentSum, maxSumSubArray); 
        }
        return maxSumSubArray;
    }

    public static void main(String[] args) {
        
    }
}
