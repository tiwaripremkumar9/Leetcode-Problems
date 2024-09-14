package SubarrayWithGivenSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    public static int[] bruteForce(int [] arr, int sum){
        /*
         * TC - O(n*n)
         * Best Case TC - O(n) -> where the sum = arr[0] + arr[1]
         */
        int [] resultArray = new int[2];
        for(int i = 0; i < arr.length; i++){
            int currentSum = arr[i];
            for(int j = i+1; j < arr.length; j++){
                currentSum = currentSum + arr[j];
                if(currentSum == sum){
                    resultArray[0] = i;
                    resultArray[1] = j;
                    break;
                }
                if(currentSum > sum){
                    break;
                }
            }
            if(resultArray[0] != 0){
                break;
            }
        }

        return resultArray;
    }

    public static void optimalApproach(int [] arr, int targetSum){
       // HashMap to store the prefix sums and their indices
       HashMap<Integer, Integer> prefixSum = new HashMap<>();
       int currentSum = 0;

       // Traverse through the array
       for (int i = 0; i < arr.length; i++) {
           // Add the current element to the running sum
           currentSum += arr[i];

           // Check if the current sum is equal to the target sum
           if (currentSum == targetSum) {
               System.out.println("Subarray found from index 0 to " + i);
               return;
           }

           // Check if (currentSum - targetSum) exists in the map
           if (prefixSum.containsKey(currentSum - targetSum)) {
               int start_index = prefixSum.get(currentSum - targetSum) + 1;
               System.out.println("Subarray found from index " + start_index + " to " + i);
               return;
           }

           // Store the current sum with its index in the map
           prefixSum.put(currentSum, i);
       }

       // If no subarray is found
       System.out.println("No subarray with given sum found");

    }


    public static void main(String[] args) {
        int [] arr = {2,6,1,9,10,3,4};
        // int [] resultArray = bruteForce(arr, 8);
        // for (int i : resultArray) {
        //     System.out.println(i);
        // }
        optimalApproach(arr, 22);
    }
    
}
