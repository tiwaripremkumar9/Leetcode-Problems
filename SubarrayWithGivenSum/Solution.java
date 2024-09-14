package SubarrayWithGivenSum;

import java.util.HashMap;
import java.util.Map;
/*
 * Find a subarray with given target sum.
 * As solution, need to return a 2-element array consiting of start index and end index of the subarray found.
 */

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

    public static int [] optimalApproach(int [] arr, int targetSum){
        /*
         * Best Case Time Complexity - O(n)
         * Worst Case TC - O(n)
         */
        Map<Integer, Integer> map = new HashMap<>();
        int [] resultArray = {-1,-1};
        int currentSum = 0;
        for(int i = 0; i < arr.length; i++){
            currentSum += arr[i];
            int startIndex, endIndex = 0;
            if(currentSum == targetSum){
                resultArray[0] = 0;
                resultArray[1] = i;
            }
            if(map.containsKey(currentSum - targetSum)){
                startIndex = map.get(currentSum - targetSum) + 1;
                endIndex = i;
                resultArray[0] = startIndex;
                resultArray[1] = endIndex;
                break;
            }
            map.put(currentSum, i);
        }

        return resultArray;

    }


    public static void main(String[] args) {
     //int [] arr = {2,6,1,9,10,3,4};
     int [] arr = {1, 4, 20, 3, 10, 5};
        //  int [] resultArray = optimalApproach(arr, 22);
        // int [] resultArray = optimalApproach(arr, 33);
        int [] resultArray = optimalApproach(arr, 25);
        for (int i : resultArray) {
            System.out.println(i);
        }
    }
    
}
