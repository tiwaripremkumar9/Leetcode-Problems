package MaxLengthSubarrayWithGivenSum;

import java.util.*;

public class Solution {

    public static int[] maxLengthSubarrayWithGivenSum(int [] arr, int targetSum){
        int sum = 0;
        int maxLength = 0;
        int [] resultArray = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            int complementSum = sum - targetSum;
            if(!map.containsKey(complementSum)){
                map.put(sum, i);
            }
            else{
            	//find the length of the sub array 
                int length = i - (map.get(complementSum) + 1);
                //if the current subarray is the max length 
                if(length > maxLength){
                    maxLength = length;
                    resultArray[0] = map.get(complementSum) + 1;
                    resultArray[1] = i;
                }
                /*
                 * if it is not the max length subrray with given sum,
                 *  then iterate ahead in search of another possible max length subarray
                 */
                map.put(sum, i);
            }
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 7, 5, 1, 4, 3, 4, 6,6};
        System.out.println(Arrays.toString(maxLengthSubarrayWithGivenSum(arr, 12)));

        
    }
    
}
